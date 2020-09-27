/**
 * 
 */
package libg.market.potatobags.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import libg.market.potatobags.dtos.PotatoBag;
import libg.market.potatobags.exception.ExceptionUtil;
import libg.market.potatobags.util.PotatoBagsUtil;

/**
 * @author Renuka
 *
 */
@Controller
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
	public String getPotatoBagsForSale(@RequestParam(value = "noOfBagsToReturn", required = false) Integer noOfBagsToReturn,  ModelMap model){
		if(noOfBagsToReturn == null || noOfBagsToReturn == 0) {
			noOfBagsToReturn = DEFAULT_BAGS_TO_RETURN;
		}
		List<PotatoBag> result = potatoBagsService.getListOfBagsInMarket(noOfBagsToReturn);
		model.put("bagList",result);
		return "potatobags";
	}

	/**
	 * Rest call to add potato bag to the market.
	 * @throws Exception 
	 */
	@PostMapping("/addPotatoBagToMarket")
	public void addPotatoBagToMarket(ModelMap model) throws Exception{
		try {
			PotatoBag bagDetails = (PotatoBag) model.get("bagDetails");
			potatoBagsUtil.validateInput(bagDetails);

			potatoBagsService.addPotatoBagToMarket(bagDetails);
		} catch (Exception e) {
			throw ExceptionUtil.createException("Potato bag not added : "+e.getMessage());
		}

	}

}
