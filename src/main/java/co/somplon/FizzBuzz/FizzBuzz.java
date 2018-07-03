package co.somplon.FizzBuzz;

public class FizzBuzz {
	// fonction qui prend en paramètres 2 entiers.

	public static String fizzBuzz(int min, int max) {
		String result = null;
		if (min == 0 && max == 0) {
			result = null;
		}

		else {
			for (int nb = min; nb != max; nb++) {
				Boolean divisiblePar3 = multiple(min);

				if (divisiblePar3) {

					result = result + "Fizz";

				} else
					result = result + min;
			}
				Boolean divisiblePar5 = multiple(max);
				if (divisiblePar5) {
				result = result + "Buzz";
			}

				else {
				result = result + min;
			}
		}
		System.out.println(result);
		return result;
	}

	public static boolean multiple(int chiffre) {

		return (chiffre % 3) == 0;

	}
}
