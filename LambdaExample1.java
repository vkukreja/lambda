public class LambdaExample1 {

	// Functional Interface
	interface Operation {
		int execute(int a, int b);
	}

	public int execute(int a, int b, Operation op) {
		return op.execute(a, b);
	}

	public static void main(String... args) {
		LambdaExample1 calc = new LambdaExample1();
		Operation addition = (a, b) -> a + b;
		Operation subtraction = (a, b) -> a - b;
		System.out.println("10 + 23 =  " + calc.execute(10, 23, addition));
		System.out.println("20 - 7 = " + calc.execute(20, 7, subtraction));
		System.out.println("20 * 10 = " + calc.execute(20, 10, (a,b) -> a*b));
	}
}

