public class FizzBuzz {
	public String fizzBuzz(int number) {
		String resultado = "" + number;
		if (number % (5 * 3) == 0) {
			resultado = "FizzBuzz";
		} else if (number % 5 == 0) {
			resultado = "Buzz";
		} else if (number % 3 == 0) {
			resultado = "Fizz";
		}
		return resultado;
	}
}