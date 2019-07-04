/**
 * 
 */
package libg.market.potatobags.dtos;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author C02071
 *
 */
@XmlRootElement(name = "potatoBag")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PotatoBag {
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("noOfPotatoes")
	private int noOfPotatoes;
	
	@JsonProperty("supplier")
	private Supplier supplier;
	
	@JsonProperty("packagingDate")
	private String packagingDate;
	
	@JsonProperty("price")
	private int price;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the noOfPotatoes
	 */
	public int getNoOfPotatoes() {
		return noOfPotatoes;
	}
	/**
	 * @param noOfPotatoes the noOfPotatoes to set
	 */
	public void setNoOfPotatoes(int noOfPotatoes) {
		this.noOfPotatoes = noOfPotatoes;
	}
	
	/**
	 * @return the packagingDate
	 */
	public String getPackagingDate() {
		return packagingDate;
	}
	/**
	 * @param packagingDate the packagingDate to set
	 */
	public void setPackagingDate(String packagingDate) {
		this.packagingDate = packagingDate;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the supplier
	 */
	public Supplier getSupplier() {
		return supplier;
	}
	/**
	 * @param supplier the supplier to set
	 */
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	public String toString() {
		String s = this.id + ","+this.noOfPotatoes + ","+this.packagingDate+","+this.price+","+this.supplier;
		return s;		
	}

}
