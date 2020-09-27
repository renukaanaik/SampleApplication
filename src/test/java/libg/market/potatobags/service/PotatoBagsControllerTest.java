/**
 * 
 */
package libg.market.potatobags.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import libg.market.potatobags.dtos.PotatoBag;
import libg.market.potatobags.dtos.PotatoBagsInMarket;
import libg.market.potatobags.dtos.Supplier;
import libg.market.potatobags.rest.PotatoBagsController;
import libg.market.potatobags.rest.PotatoBagsService;
import libg.market.potatobags.util.PotatoBagsUtil;
import org.springframework.ui.ModelMap;

/**
 * @author Renuka
 *
 */
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class PotatoBagsControllerTest {
/*
	@Autowired
	private PotatoBagsService potatoBagsService;

	@Autowired
	private PotatoBagsUtil potatoBagsUtil;
	
	@Autowired
	PotatoBagsController mock;
	
	@Test
	public void whenGetPotatoBagsForSale_calledwith_validNoOfBags() {
		int noOfBagsToReturn = 2;
		PotatoBagsInMarket list = createPotatoBagsInMarket();
		ModelMap model = null;
		
		Mockito.when(mock.getPotatoBagsForSale(noOfBagsToReturn,model)).thenCallRealMethod();
		Mockito.when(potatoBagsService.getListOfBagsInMarket(noOfBagsToReturn)).thenReturn(list.getPotatoBagsList());
		
		//List<PotatoBag> result = mock.getPotatoBagsForSale(noOfBagsToReturn,model);
		//assertEquals(result.size(),2);
		
	}
	
	@Test
	public void whenGetPotatoBagsForSale_calledwith_zeroNoOfBags() {
		int noOfBagsToReturn = 0;
		PotatoBagsInMarket list = createPotatoBagsInMarket();
		ModelMap model = null;
		
		Mockito.when(mock.getPotatoBagsForSale(noOfBagsToReturn,model)).thenCallRealMethod();
		Mockito.when(potatoBagsService.getListOfBagsInMarket(noOfBagsToReturn)).thenReturn(list.getPotatoBagsList());
		
		//List<PotatoBag> result = mock.getPotatoBagsForSale(noOfBagsToReturn,model);
		//assertEquals(result.size(),3);
		
	}
	
	@Test
	public void whenGetPotatoBagsForSale_calledwith_null() {
		PotatoBagsInMarket list = createPotatoBagsInMarket();
		ModelMap model = null;

		Mockito.when(mock.getPotatoBagsForSale(null,model)).thenCallRealMethod();
		Mockito.when(potatoBagsService.getListOfBagsInMarket(Mockito.anyInt())).thenReturn(list.getPotatoBagsList());
		
		//List<PotatoBag> result = mock.getPotatoBagsForSale(null,model);
		//assertEquals(result.size(),3);
		
	}
	
	@Test
	public void whenaddPotatoBagToMarket_calledwith_validInput() {
		
	}
	
	private PotatoBag createPotatoBagToAdd(String id, int noOfPotatoes, String packagingDate, int price, Supplier suppliername) {
		PotatoBag bagToadd = new PotatoBag();
		bagToadd.setId(id);
		bagToadd.setNoOfPotatoes(noOfPotatoes);
		bagToadd.setPackagingDate(packagingDate);
		bagToadd.setPrice(price);
		bagToadd.setSupplier(suppliername);
		return bagToadd;
	}
	
	private PotatoBagsInMarket createPotatoBagsInMarket() {
		PotatoBagsInMarket potatoBagsInMarket = new PotatoBagsInMarket();
		List<PotatoBag> list = new ArrayList<PotatoBag>(); 
		
		PotatoBag bagToadd  = createPotatoBagToAdd("1",20,"12/06/2019",50,Supplier.DE_COSTER); list.add(bagToadd);
		PotatoBag bagToadd1 = createPotatoBagToAdd("2",30,"12/06/2019",75,Supplier.OWEL);	list.add(bagToadd1);
		PotatoBag bagToadd2  = createPotatoBagToAdd("3",20,"12/06/2019",33,Supplier.YUNNAN_SPICES); list.add(bagToadd2);
		
		potatoBagsInMarket.setPotatoBagsList(list);
		return potatoBagsInMarket;
	}*/
	

}
