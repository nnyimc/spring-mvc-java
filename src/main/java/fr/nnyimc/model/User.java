package fr.nnyimc.model;

public class User {

    private String firstname;
    private String lastname;
    private Address address;
    private Country country;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", address=" + address + '\'' +
                ", country=" + country +
                '}';
    }
}
