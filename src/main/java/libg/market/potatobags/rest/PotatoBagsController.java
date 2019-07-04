/**
 * 
 */
package libg.market.potatobags.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import libg.market.potatobags.dtos.PotatoBag;
import libg.market.potatobags.exception.ExceptionUtil;
import libg.market.potatobags.util.PotatoBagsUtil;

/**
 * @author Renuka
 *
 */
@RestController
public class PotatoBagsController {

	@Autowired
	private PotatoBagsService potatoBagsService;

	@Autowired
	private PotatoBagsUtil potatoBagsUtil;

	private final int DEFAULT_BAGS_TO_RETURN = 3;

	/**
	 * Rest call to get the list of potato bags in market
	 * @param noOfBagsToReturn tells how many bags to be returned if null then the method will return 3 bags by default.
	 * @return List<PotatoBag> list of potato bags
	 */
	@RequestMapping("/getPotatoBagsForSale")
	public List<PotatoBag> getPotatoBagsForSale(@RequestParam(value = "noOfBagsToReturn", required = false) Integer noOfBagsToReturn){
		if(noOfBagsToReturn == null || noOfBagsToReturn == 0) {
			noOfBagsToReturn = DEFAULT_BAGS_TO_RETURN;
		}
		List<PotatoBag> result = potatoBagsService.getListOfBagsInMarket(noOfBagsToReturn);

		return result;		
	}

	/**
	 * Rest call to add potato bag to the market.
	 * @param bagDetails PotatoBag object 
	 * @throws Exception 
	 */
	@RequestMapping("/addPotatoBagToMarket")
	public void addPotatoBagToMarket(@RequestBody PotatoBag bagDetails) throws Exception{
		System.out.println("Input details :: "+ bagDetails.toString());
		try {
			potatoBagsUtil.validateInput(bagDetails);

			potatoBagsService.addPotatoBagToMarket(bagDetails);
		} catch (Exception e) {
			throw ExceptionUtil.createException("Potato bag not added : "+e.getMessage());
		}

	}

}
