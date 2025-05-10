package aabstract;

public class recipewithMicrowaven extends abstractRecipe {
	@Override
	void getready() {
		// TODO Auto-generated method stub
		System.out.println("Get the raw material");

		System.out.println("switch on micro");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("do the dish");
		System.out.println("put in the microwave");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("cleanup the utensils");
		System.out.println("switch off micro");
	}
}
