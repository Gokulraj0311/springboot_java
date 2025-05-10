package aabstract;

public class recipe1 extends abstractRecipe {

	@Override
	void getready() {
		// TODO Auto-generated method stub
		System.out.println("Get the raw material");
		System.out.println("Get the utensils");
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("do the dish");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("cleanup the utensils");
	}

}
