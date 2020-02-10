package example;

public class SecondEx {
	private FirstEx fe;
	public SecondEx() {
		fe = new FirstEx(1);
		System.out.println(fe.getcalc());
	}
	public static void main(String[] args) {
		SecondEx se = new SecondEx();
	}
}
