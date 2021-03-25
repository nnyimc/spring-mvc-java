package fr.nnyimc.model;

public class Phone {
	
	private static final String PLUS = "+";
	private String countryCode;
	private String areaCode;
	private String number;
	
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = PLUS + countryCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "Phone [countryCode=" + countryCode + ", areaCode=" + areaCode + ", number=" + number + "]";
	}
	
	

}
