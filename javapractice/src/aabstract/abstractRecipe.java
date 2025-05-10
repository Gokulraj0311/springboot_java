package aabstract;

public abstract class abstractRecipe {
	public void execute() {
		getready();
		doTheDish();
		cleanup();
	}

	abstract void getready();

	abstract void doTheDish();

	abstract void cleanup();

}
