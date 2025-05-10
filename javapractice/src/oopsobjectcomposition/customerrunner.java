package oopsobjectcomposition;

public class customerrunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line1", "Hydrabad", "555032");
		customer cus = new customer("Ranga", homeAddress);
		System.out.println(cus);
		Address workAddress = new Address("line1 for work", "Hydrabad", "555033");
		cus.setWorkaddres(workAddress);
		System.out.println(cus);
	}

}
