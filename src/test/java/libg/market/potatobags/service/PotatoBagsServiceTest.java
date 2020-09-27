/**
 * 
 */
package libg.market.potatobags.service;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

import libg.market.potatobags.dtos.PotatoBag;
import libg.market.potatobags.dtos.PotatoBagsInMarket;
import libg.market.potatobags.dtos.Supplier;
import libg.market.potatobags.rest.PotatoBagsService;

/**
 * @author Renuka
 *
 */
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class PotatoBagsServiceTest {
/*
	@Spy
	private PotatoBagsInMarket potatoBagsInMarket;

	@Autowired
	PotatoBagsService service;

	@Test
	public void whenMarketListIsEmpty_test_addPotatoBagToMarket() {


		PotatoBag bagToadd = createPotatoBagToAdd("1",20,"12/06/2019",50,Supplier.DE_COSTER);
		PotatoBagsInMarket expectedResult = new PotatoBagsInMarket();

		final Answer expectedAnswer = new Answer() { public Object
			answer(InvocationOnMock invocation) throws Throwable { 
			List<PotatoBag> list = new ArrayList<PotatoBag>(); 
			list.add(bagToadd);

			expectedResult.setPotatoBagsList(list); 
			return null; 
		} };		 

		Mockito.doAnswer(expectedAnswer).when(service).addPotatoBagToMarket(Mockito.any(PotatoBag.class));
		service.addPotatoBagToMarket(bagToadd);
		assertEquals(expectedResult.getPotatoBagsList().size(), 1);

	}
	
	@Test
	public void whenMarketListIsNotEmpty_test_addPotatoBagToMarket() {

		PotatoBag bagToadd = createPotatoBagToAdd("4",20,"12/06/2019",50,Supplier.DE_COSTER);		
		potatoBagsInMarket = createPotatoBagsInMarket();		
		ReflectionTestUtils.setField(service, "potatoBagsInMarket", potatoBagsInMarket);
		PotatoBagsInMarket expectedResult = new PotatoBagsInMarket();

		final Answer expectedAnswer = new Answer() { public Object
			answer(InvocationOnMock invocation) throws Throwable { 
			List<PotatoBag> list = new ArrayList<PotatoBag>(); 
			list.addAll(potatoBagsInMarket.getPotatoBagsList());
			list.add(bagToadd);

			expectedResult.setPotatoBagsList(list); 
			return null; 
		} };		 

		Mockito.doAnswer(expectedAnswer).when(service).addPotatoBagToMarket(Mockito.any(PotatoBag.class));
		service.addPotatoBagToMarket(bagToadd);
		assertEquals(expectedResult.getPotatoBagsList().size(), 4);

	}

	@Test(expected = NullPointerException.class)
	public void whenIncorrectInputIsProvided_test_addPotatoBagToMarket() {

		Mockito.doThrow(new NullPointerException()).when(service).addPotatoBagToMarket(null);
		service.addPotatoBagToMarket(null);
	}
	
	@Test
	public void whenGetListOfBagsInMarket_calledwith_validNoOfBags() {
		potatoBagsInMarket = createPotatoBagsInMarket();
		List<PotatoBag> result = new ArrayList<PotatoBag>();
		
		int noOfBagsToReturn = 2;		
		ReflectionTestUtils.setField(service, "potatoBagsInMarket", potatoBagsInMarket);		
		Mockito.when(service.getListOfBagsInMarket(noOfBagsToReturn)).thenCallRealMethod();
		
		result = service.getListOfBagsInMarket(noOfBagsToReturn);		
		assertEquals(result.size() , 2);
		
	}
	
	@Test
	public void whenGetListOfBagsInMarket_calledwith_MoreNoOfBags() {
		potatoBagsInMarket = createPotatoBagsInMarket();
		List<PotatoBag> result = new ArrayList<PotatoBag>();		
		int noOfBagsToReturn = 5;		
		ReflectionTestUtils.setField(service, "potatoBagsInMarket", potatoBagsInMarket);		
		Mockito.when(service.getListOfBagsInMarket(noOfBagsToReturn)).thenCallRealMethod();
		
		result = service.getListOfBagsInMarket(noOfBagsToReturn);		
		assertEquals(result.size() , 3);
		
	}

	private PotatoBagsInMarket createPotatoBagsInMarket() {
		PotatoBagsInMarket potatoBagsInMarket = new PotatoBagsInMarket();
		List<PotatoBag> list = new ArrayList<PotatoBag>(); 
		
		PotatoBag bagToadd  = createPotatoBagToAdd("1",20,"12/06/2019",50,Supplier.DE_COSTER); list.add(bagToadd);
		PotatoBag bagToadd1 = createPotatoBagToAdd("2",30,"12/06/2019",75,Supplier.OWEL);	list.add(bagToadd1);
		PotatoBag bagToadd2  = createPotatoBagToAdd("3",20,"12/06/2019",33,Supplier.YUNNAN_SPICES); list.add(bagToadd2);
		
		potatoBagsInMarket.setPotatoBagsList(list);
		return potatoBagsInMarket;
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
*/
}
