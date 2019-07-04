/**
 * 
 */
package libg.market.potatobags.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import libg.market.potatobags.dtos.PotatoBag;
import libg.market.potatobags.dtos.Supplier;
import libg.market.potatobags.exception.ExceptionUtil;

/**
 * @author C02071
 *
 */
public class PotatoBagsUtil {
	
	public void validateInput(PotatoBag bagDetails) throws Exception {
		if(null == bagDetails) {
			throw ExceptionUtil.createException("Empty Input. ");
		}
		
		validateNoOfPotatoesInBag(bagDetails.getNoOfPotatoes());
		validatePackagingDate(bagDetails.getPackagingDate());
		validatePrice(bagDetails.getPrice());
		validateSupplierName(bagDetails.getSupplier());
		
	}

	private void validateSupplierName(Supplier supplier) throws Exception {
		System.out.println(supplier);
		boolean isValid = false;
		for(Supplier s : Supplier.values()) {
			System.out.println("s.name() : "+s.name());
			System.out.println("1 :: "+s.name().equals(supplier.name()));
			if(s.name().equals(supplier.name())) {
				isValid = true;		
				break;
			}
		}
		System.out.println("1 :: "+isValid);
		if(!isValid) {
			throw ExceptionUtil.createException("Not a valid Supplier Name.. Only these suppliers can supply potatoes : "+supplier.values().toString());
		}
		
	}

	private void validatePrice(int price) throws Exception {
		System.out.println(price);
		if(price <1 || price >50) {
			throw ExceptionUtil.createException("Potato Bag price can only vary from 1 to 50. ");
		}
		
	}

	private void validatePackagingDate(String packagingDate) throws Exception {
		System.out.println(packagingDate);
		if(packagingDate == null) {
			throw ExceptionUtil.createException("Date not valid. Date format should be mm/dd/yyyy. ");
		}
		SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
		sdf.setLenient(false);
		
		try {
			
			//if not valid, it will throw ParseException
			Date date = sdf.parse(packagingDate);
			System.out.println(date);
		
		} catch (ParseException e) {
			
			e.printStackTrace();
			throw ExceptionUtil.createException("Date not valid. Date format should be mm/dd/yyyy. ");
		}
		
	}

	private void validateNoOfPotatoesInBag(int noOfPotatoes) throws Exception {
		System.out.println(noOfPotatoes);
		if(noOfPotatoes <1 || noOfPotatoes >100) {
			throw ExceptionUtil.createException("Potato bags cannot take more then 100 Potatoes or less then 1 potato. ");
		}
		
	}

}
