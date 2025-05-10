package oopsobjectcomposition;

public class customer {
	private String name;
	private Address homeAddress;
	private Address workaddres;

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddres(Address homeaddress) {
		this.homeAddress = homeaddress;
	}

	public Address getWorkaddres() {
		return workaddres;
	}

	public void setWorkaddres(Address workaddres) {
		this.workaddres = workaddres;
	}

	public customer(String name, Address homeAddress) {
		super();
		this.name = name;
		this.homeAddress = homeAddress;
	}

	@Override
	public String toString() {
		return String.format("name-[%s] homeaddress-[%s] workAddress--[%s] ", name, homeAddress, workaddres);
	}

}
