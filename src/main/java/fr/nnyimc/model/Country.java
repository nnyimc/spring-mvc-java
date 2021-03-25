package fr.nnyimc.model;

public class Country {
	private int counter = 0;
	private Long id;
	private String name;
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		counter++;
		this.id = (long) counter;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Country [  id=" + id + ", name=" + name + " ]";
	}
	
	
	
}
