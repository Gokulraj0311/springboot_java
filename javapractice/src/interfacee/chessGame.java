package interfacee;

public class chessGame implements gamingconsole {
	@Override
	public void up() {
		System.out.println("move piece up");
	}

	@Override
	public void down() {
		System.out.println("move piece down");
	}
}
