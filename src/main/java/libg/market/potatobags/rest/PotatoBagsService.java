package libg.market.potatobags.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;

import libg.market.potatobags.dtos.PotatoBag;
import libg.market.potatobags.dtos.PotatoBagsInMarket;
import libg.market.potatobags.util.RandomString;

/**
 * Service class to add/get the potato bags in market
 * @author Renuka
 *
 */
public class PotatoBagsService {	

	@Autowired
	private PotatoBagsInMarket potatoBagsInMarket;	
	
	/**
	 * addPotatoBagToMarket : This method add a new potato bag to the market.
	 * @param input PotatoBag object 
	 */
	public void addPotatoBagToMarket(PotatoBag input) {
		List<PotatoBag> bagToadd = new ArrayList<PotatoBag>();
		
		if(null != potatoBagsInMarket && potatoBagsInMarket.getPotatoBagsList() != null && !potatoBagsInMarket.getPotatoBagsList().isEmpty()) {
			bagToadd = potatoBagsInMarket.getPotatoBagsList();
		}
		RandomString gen = new RandomString(8, ThreadLocalRandom.current());
		input.setId(gen.nextString());
		bagToadd.add(input);
		potatoBagsInMarket.setPotatoBagsList(bagToadd);
	}

	/**
	 * getListOfBagsInMarket : This method gets the list of potato bags available in market based on noOfBagsToReturn parameter.
	 * @param noOfBagsToReturn tells how many bags to be returned if null then the method will return 3 bags by default.
	 * @return List<PotatoBag> list of potato bags
	 */
	public List<PotatoBag> getListOfBagsInMarket(int noOfBagsToReturn) {
		
		List<PotatoBag> result = new ArrayList<PotatoBag>();
		
		List<PotatoBag> bagsInMarket = potatoBagsInMarket.getPotatoBagsList();
		int counter = 1;
		if(bagsInMarket!=null) {
			for (PotatoBag bag : bagsInMarket) {
				result.add(bag);
				counter++;
				if (counter > noOfBagsToReturn) {
					break;
				}
			}
		}
		return result;
		
	}
	
	public PotatoBagsInMarket getPotatoBagsInMarket() {
		return potatoBagsInMarket;
	}

	public void setPotatoBagsInMarket(PotatoBagsInMarket potatoBagsInMarket) {
		this.potatoBagsInMarket = potatoBagsInMarket;
	}

}
