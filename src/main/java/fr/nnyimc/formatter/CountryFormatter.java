package fr.nnyimc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import fr.nnyimc.model.Country;

public class CountryFormatter implements Formatter<Country> {

	@Override
	public String print(Country object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Country parse(String text, Locale locale) throws ParseException {
		
		try {
			String name = text;
			Country country = (Country) Class.forName("fr.nnyimc.model.Country").newInstance();
			country.setName(name);
			return country;
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
