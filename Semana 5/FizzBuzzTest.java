public class FizzBuzzTest {
	public static void main(String[] args) {
		if (args.length > 0) {
			int number = new Integer(args[0]);
			FizzBuzz objeto = new FizzBuzz();
			System.out.println(objeto.fizzBuzz(number));
		}
	}
}