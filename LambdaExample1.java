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
		// Pre Java 8 style anonymous inner class
		Operation addition = new Operation() {
			@Override
			public int execute(int a, int b) {
				return a+b;
			}
		};
		System.out.println("10 + 23 =  " + calc.execute(10, 23, addition));

		// Lambda style
		Operation subtraction = (a, b) -> a - b;
		System.out.println("20 - 7 = " + calc.execute(20, 7, subtraction));
		System.out.println("20 * 10 = " + calc.execute(20, 10, (a,b) -> a*b));
		// Method reference
		System.out.println("max(20,10) = " + calc.execute(20, 10, Math::max));
	}
}

