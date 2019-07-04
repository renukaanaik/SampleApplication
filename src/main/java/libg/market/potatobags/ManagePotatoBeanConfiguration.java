/**
 * 
 */
package libg.market.potatobags;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import libg.market.potatobags.dtos.PotatoBagsInMarket;
import libg.market.potatobags.rest.PotatoBagsService;
import libg.market.potatobags.util.PotatoBagsUtil;

/**
 * @author C02071
 *
 */
@Configuration
public class ManagePotatoBeanConfiguration {
	
	@Bean
	public PotatoBagsService potatoBagsServiceBean() {
		return new PotatoBagsService();
	}
	
	@Bean
	public PotatoBagsInMarket potatoBagsInMarketBean() {
		return new PotatoBagsInMarket();
	}
	
	@Bean
	public PotatoBagsUtil potatoBagsUtilBean() {
		return new PotatoBagsUtil();
	}

}
