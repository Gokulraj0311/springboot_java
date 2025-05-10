package aabstract;

public class reciperunner {
	public static void main(String[] args) {
		recipe1 rp1 = new recipe1();
		rp1.execute();
		recipewithMicrowaven rpwave = new recipewithMicrowaven();
		rpwave.execute();
	}
}
