package libg.market.potatobags.dtos;

public enum Supplier {
	
	DE_COSTER("De Coster"),
	OWEL("Owel"),
	PATATAS_RUBEN("Patatas Ruben"),
	YUNNAN_SPICES("Yunnan Spices");
	
	private String supplierName;
	
	private Supplier(String supplierName) {
		this.supplierName = supplierName;
	}

	/**
	 * @return the supplierName
	 */
	public String getSupplierName() {
		return supplierName;
	}

	/**
	 * @param supplierName the supplierName to set
	 */
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

}
