package com.htc.locus.model;

import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * Represents a model class for UserDetailsDetailed.
 * 
 * @author HTC Global Services
 * @version 1.0
 * @since 30-03-2021
 * 
 */

public class UserDetailsDetailed {

	// id
	private Long userDetailsId;
	// address1
	private String addressOne;
	// city
	private String city;
	// state
	private String state;
	// country_name
	private String countryName;
	// user_id
	private Long userDetailsUserId;
	// date_format
	private String dateFormat;
	// logo
	private String logo;
	// company_name
	private String companyName;
	// contact_no
	private String contactNo;
	// tax_type
	private String taxType;
	// tax_calculation
	private String taxCalculation;
	// tax_option
	private String taxOption;
	// backorder
	private Boolean backorder;
	// threshold
	private Integer threshold;
	// invoice_template
	private String invoiceTemplate;
	// po_template
	private String poTemplate;
	// so_template
	private String soTemplate;
	// shipment_template
	private String shipmentTemplate;
	// package_template
	private String packageTemplate;
	// stripe_amount
	private Integer stripeAmount;
	// stripe_threshold
	private Integer stripeThreshold;
	// wallet_limit
	private Integer walletLimit;
	// wallet_total
	private Integer walletTotal;
	// enable_printhive
	private Boolean enablePrinthive;

	public UserDetailsDetailed() {
	}

	/**
	 * @return the userDetailsId
	 */
	public Long getUserDetailsId() {
		return userDetailsId;
	}

	/**
	 * @param userDetailsId the userDetailsId to set
	 */
	@JsonSetter("id")
	public void setUserDetailsId(Long userDetailsId) {
		this.userDetailsId = userDetailsId;
	}

	/**
	 * @return the addressOne
	 */
	public String getAddressOne() {
		return addressOne;
	}

	/**
	 * @param addressOne the addressOne to set
	 */
	@JsonSetter("address1")
	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	@JsonSetter("city")
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	@JsonSetter("state")
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	@JsonSetter("country_name")
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the userDetailsUserId
	 */
	public Long getUserDetailsUserId() {
		return userDetailsUserId;
	}

	/**
	 * @param userDetailsUserId the userDetailsUserId to set
	 */
	@JsonSetter("user_id")
	public void setUserDetailsUserId(Long userDetailsUserId) {
		this.userDetailsUserId = userDetailsUserId;
	}

	/**
	 * @return the dateFormat
	 */
	public String getDateFormat() {
		return dateFormat;
	}

	/**
	 * @param dateFormat the dateFormat to set
	 */
	@JsonSetter("date_format")
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	/**
	 * @return the logo
	 */
	public String getLogo() {
		return logo;
	}

	/**
	 * @param logo the logo to set
	 */
	@JsonSetter("logo")
	public void setLogo(String logo) {
		this.logo = logo;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	@JsonSetter("company_name")
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * @param contactNo the contactNo to set
	 */
	@JsonSetter("contact_no")
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * @return the taxType
	 */
	public String getTaxType() {
		return taxType;
	}

	/**
	 * @param taxType the taxType to set
	 */
	@JsonSetter("tax_type")
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	/**
	 * @return the taxCalculation
	 */
	public String getTaxCalculation() {
		return taxCalculation;
	}

	/**
	 * @param taxCalculation the taxCalculation to set
	 */
	@JsonSetter("tax_calculation")
	public void setTaxCalculation(String taxCalculation) {
		this.taxCalculation = taxCalculation;
	}

	/**
	 * @return the taxOption
	 */
	public String getTaxOption() {
		return taxOption;
	}

	/**
	 * @param taxOption the taxOption to set
	 */
	@JsonSetter("tax_option")
	public void setTaxOption(String taxOption) {
		this.taxOption = taxOption;
	}

	/**
	 * @return the backorder
	 */
	public Boolean getBackorder() {
		return backorder;
	}

	/**
	 * @param backorder the backorder to set
	 */
	@JsonSetter("backorder")
	public void setBackorder(Boolean backorder) {
		this.backorder = backorder;
	}

	/**
	 * @return the threshold
	 */
	public Integer getThreshold() {
		return threshold;
	}

	/**
	 * @param threshold the threshold to set
	 */
	@JsonSetter("threshold")
	public void setThreshold(Integer threshold) {
		this.threshold = threshold;
	}

	/**
	 * @return the invoiceTemplate
	 */
	public String getInvoiceTemplate() {
		return invoiceTemplate;
	}

	/**
	 * @param invoiceTemplate the invoiceTemplate to set
	 */
	@JsonSetter("invoice_template")
	public void setInvoiceTemplate(String invoiceTemplate) {
		this.invoiceTemplate = invoiceTemplate;
	}

	/**
	 * @return the poTemplate
	 */
	public String getPoTemplate() {
		return poTemplate;
	}

	/**
	 * @param poTemplate the poTemplate to set
	 */
	@JsonSetter("po_template")
	public void setPoTemplate(String poTemplate) {
		this.poTemplate = poTemplate;
	}

	/**
	 * @return the soTemplate
	 */
	public String getSoTemplate() {
		return soTemplate;
	}

	/**
	 * @param soTemplate the soTemplate to set
	 */
	@JsonSetter("so_template")
	public void setSoTemplate(String soTemplate) {
		this.soTemplate = soTemplate;
	}

	/**
	 * @return the shipmentTemplate
	 */
	public String getShipmentTemplate() {
		return shipmentTemplate;
	}

	/**
	 * @param shipmentTemplate the shipmentTemplate to set
	 */
	@JsonSetter("shipment_template")
	public void setShipmentTemplate(String shipmentTemplate) {
		this.shipmentTemplate = shipmentTemplate;
	}

	/**
	 * @return the packageTemplate
	 */
	public String getPackageTemplate() {
		return packageTemplate;
	}

	/**
	 * @param packageTemplate the packageTemplate to set
	 */
	@JsonSetter("package_template")
	public void setPackageTemplate(String packageTemplate) {
		this.packageTemplate = packageTemplate;
	}

	/**
	 * @return the stripeAmount
	 */
	public Integer getStripeAmount() {
		return stripeAmount;
	}

	/**
	 * @param stripeAmount the stripeAmount to set
	 */
	@JsonSetter("stripe_amount")
	public void setStripeAmount(Integer stripeAmount) {
		this.stripeAmount = stripeAmount;
	}

	/**
	 * @return the stripeThreshold
	 */
	public Integer getStripeThreshold() {
		return stripeThreshold;
	}

	/**
	 * @param stripeThreshold the stripeThreshold to set
	 */
	@JsonSetter("stripe_threshold")
	public void setStripeThreshold(Integer stripeThreshold) {
		this.stripeThreshold = stripeThreshold;
	}

	/**
	 * @return the walletLimit
	 */
	public Integer getWalletLimit() {
		return walletLimit;
	}

	/**
	 * @param walletLimit the walletLimit to set
	 */
	@JsonSetter("wallet_limit")
	public void setWalletLimit(Integer walletLimit) {
		this.walletLimit = walletLimit;
	}

	/**
	 * @return the walletTotal
	 */
	public Integer getWalletTotal() {
		return walletTotal;
	}

	/**
	 * @param walletTotal the walletTotal to set
	 */
	@JsonSetter("wallet_total")
	public void setWalletTotal(Integer walletTotal) {
		this.walletTotal = walletTotal;
	}

	/**
	 * @return the enablePrinthive
	 */
	public Boolean getEnablePrinthive() {
		return enablePrinthive;
	}

	/**
	 * @param enablePrinthive the enablePrinthive to set
	 */
	@JsonSetter("enable_printhive")
	public void setEnablePrinthive(Boolean enablePrinthive) {
		this.enablePrinthive = enablePrinthive;
	}

	@Override
	public String toString() {
		return "UserDetailsDetailed [userDetailsId=" + userDetailsId + ", addressOne=" + addressOne + ", city=" + city
				+ ", state=" + state + ", countryName=" + countryName + ", userDetailsUserId=" + userDetailsUserId
				+ ", dateFormat=" + dateFormat + ", logo=" + logo + ", companyName=" + companyName + ", contactNo="
				+ contactNo + ", taxType=" + taxType + ", taxCalculation=" + taxCalculation + ", taxOption=" + taxOption
				+ ", backorder=" + backorder + ", threshold=" + threshold + ", invoiceTemplate=" + invoiceTemplate
				+ ", poTemplate=" + poTemplate + ", soTemplate=" + soTemplate + ", shipmentTemplate=" + shipmentTemplate
				+ ", packageTemplate=" + packageTemplate + ", stripeAmount=" + stripeAmount + ", stripeThreshold="
				+ stripeThreshold + ", walletLimit=" + walletLimit + ", walletTotal=" + walletTotal
				+ ", enablePrinthive=" + enablePrinthive + "]";
	}

}
