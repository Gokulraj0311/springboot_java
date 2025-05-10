package polymorphism;

abstract class animal {
	abstract void bark();
}

class dog extends animal {
	@Override
	public void bark() {
		System.out.println("bow bow");
	}
}

class cat extends animal {
	@Override
	public void bark() {
		System.out.println("meow meow");
	}
}

public class animalrunner {
	public static void main(String[] args) {
		animal[] ani = { new dog(), new cat() };
		for (animal anima : ani) {
			anima.bark();
		}

	}

}
