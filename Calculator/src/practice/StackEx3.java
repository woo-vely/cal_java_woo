package practice;

public class StackEx3 {
	public static void main(String[] args) {
		OptExp2 opt = new OptExp2();
		infix2postfix infix = new infix2postfix();
		int result;
		String exp = infix.in2post();
		
		System.out.printf("\n����ǥ���: %s", exp);
		result = opt.evalPostfix(exp);
		System.out.printf("\n���� ��� = %d\n", result);
	}
}
