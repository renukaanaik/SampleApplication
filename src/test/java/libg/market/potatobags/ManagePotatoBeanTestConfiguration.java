/**
 * 
 */
package libg.market.potatobags;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import libg.market.potatobags.dtos.PotatoBagsInMarket;
import libg.market.potatobags.rest.PotatoBagsService;
import libg.market.potatobags.util.PotatoBagsUtil;

/**
 * @author Renuka
 *
 */
@Profile("test")
@Configuration
public class ManagePotatoBeanTestConfiguration {
	
	@Bean
	@Primary
	public PotatoBagsService potatoBagsService() {
		return Mockito.mock(PotatoBagsService.class);
	}
	
	@Bean
	@Primary
	public PotatoBagsInMarket potatoBagsInMarket() {
		return Mockito.mock(PotatoBagsInMarket.class);
	}
	
	@Bean
	@Primary
	public PotatoBagsUtil potatoBagsUtil() {
		return Mockito.mock(PotatoBagsUtil.class);
	}

}
