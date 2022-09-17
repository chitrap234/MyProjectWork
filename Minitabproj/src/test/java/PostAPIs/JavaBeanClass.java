package PostAPIs;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


public class JavaBeanClass {
	
	private String OrderId;
	
	@Size(max=50, message="CustomerAccount should be less than 50 character")
	private String OrderName;
	@Size(max=50 ,message="CustomerAccount should be less than 50 character")
	private String CustomerAccount;
	private String PaymentTerms;
	private String TaxExempt;
	private String Currency;
	
	@Email 
	private String BillEmailAddress;
	private String BillFirstName;
	private String BillLastName;
	private String BillStreetLine1;
	private String BillStreetLine2;
	private String BillStreetLine3;
	private String BillCity;
	private String BillRegion;
	private String BillCountry;
	
	@Email 
	private String ShipEmailAddress;
	private String ShipFirstName;
	private String ShipLastName;
	private String ShipStreetLine1;
	private String ShipStreetLine2;
	private String ShipStreetLine3;
	private String ShipCity;
	private String ShipRegion;
	private String ShipCountry;
	
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	public String getOrderName() {
		return OrderName;
	}
	public void setOrderName(String orderName) {
		OrderName = orderName;
	}
	public String getCustomerAccount() {
		return CustomerAccount;
	}
	public void setCustomerAccount(String customerAccount) {
		CustomerAccount = customerAccount;
	}
	public String getPaymentTerms() {
		return PaymentTerms;
	}
	public void setPaymentTerms(String paymentTerms) {
		PaymentTerms = paymentTerms;
	}
	public String getTaxExempt() {
		return TaxExempt;
	}
	public void setTaxExempt(String taxExempt) {
		TaxExempt = taxExempt;
	}
	public String getCurrency() {
		return Currency;
	}
	
	public void setCurrency(String currency) {
		Currency = currency;
	}
	
	
	public String getBillEmailAddress() {
		return BillEmailAddress;
	}
	public void setBillEmailAddress(String billEmailAddress) {
		BillEmailAddress = billEmailAddress;
	}
	public String getBillFirstName() {
		return BillFirstName;
	}
	public void setBillFirstName(String billFirstName) {
		BillFirstName = billFirstName;
	}
	public String getBillLastName() {
		return BillLastName;
	}
	public void setBillLastName(String billLastName) {
		BillLastName = billLastName;
	}
	public String getBillStreetLine1() {
		return BillStreetLine1;
	}
	public void setBillStreetLine1(String billStreetLine1) {
		BillStreetLine1 = billStreetLine1;
	}
	public String getBillStreetLine2() {
		return BillStreetLine2;
	}
	public void setBillStreetLine2(String billStreetLine2) {
		BillStreetLine2 = billStreetLine2;
	}
	public String getBillStreetLine3() {
		return BillStreetLine3;
	}
	public void setBillStreetLine3(String billStreetLine3) {
		BillStreetLine3 = billStreetLine3;
	}
	public String getBillCity() {
		return BillCity;
	}
	public void setBillCity(String billCity) {
		BillCity = billCity;
	}
	public String getBillRegion() {
		return BillRegion;
	}
	public void setBillRegion(String billRegion) {
		BillRegion = billRegion;
	}
	public String getBillCountry() {
		return BillCountry;
	}
	public void setBillCountry(String billCountry) {
		BillCountry = billCountry;
	}
	
	
	public String getShipEmailAddress() {
		return ShipEmailAddress;
	}
	public void setShipEmailAddress(String shipEmailAddress) {
		ShipEmailAddress = shipEmailAddress;
	}
	public String getShipFirstName() {
		return ShipFirstName;
	}
	public void setShipFirstName(String shipFirstName) {
		ShipFirstName = shipFirstName;
	}
	public String getShipLastName() {
		return ShipLastName;
	}
	public void setShipLastName(String shipLastName) {
		ShipLastName = shipLastName;
	}
	public String getShipStreetLine1() {
		return ShipStreetLine1;
	}
	public void setShipStreetLine1(String shipStreetLine1) {
		ShipStreetLine1 = shipStreetLine1;
	}
	public String getShipStreetLine2() {
		return ShipStreetLine2;
	}
	public void setShipStreetLine2(String shipStreetLine2) {
		ShipStreetLine2 = shipStreetLine2;
	}
	public String getShipStreetLine3() {
		return ShipStreetLine3;
	}
	public void setShipStreetLine3(String shipStreetLine3) {
		ShipStreetLine3 = shipStreetLine3;
	}
	public String getShipCity() {
		return ShipCity;
	}
	public void setShipCity(String shipCity) {
		ShipCity = shipCity;
	}
	public String getShipRegion() {
		return ShipRegion;
	}
	public void setShipRegion(String shipRegion) {
		ShipRegion = shipRegion;
	}
	public String getShipCountry() {
		return ShipCountry;
	}
	public void setShipCountry(String shipCountry) {
		ShipCountry = shipCountry;
	}
	
	
	
	

}
