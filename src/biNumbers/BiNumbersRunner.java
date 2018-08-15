package biNumbers;

public class BiNumbersRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BiNumbers numbers = new BiNumbers(2, 3);
		System.out.println(numbers.add());// 2 + 3

		System.out.println(numbers.multiply()); // 2 * 3

		numbers.doubleValue();

		System.out.println(numbers.getNumber1());// 4

		System.out.println(numbers.getNumber2());// 6
	}

}
