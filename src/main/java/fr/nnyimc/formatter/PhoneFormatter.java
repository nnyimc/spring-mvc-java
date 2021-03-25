package fr.nnyimc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import fr.nnyimc.model.Phone;

public class PhoneFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		return null;
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		
		try {
			String countryCode = text.substring(0,2);
			String areaCode = text.substring(2,3);
			String number = text.substring(3, text.length());
			
			Phone phone = (Phone) Class.forName("fr.nnyimc.model.Phone").newInstance();
			
			phone.setCountryCode(countryCode);
			phone.setAreaCode(areaCode);
			phone.setNumber(number);
			return phone;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
