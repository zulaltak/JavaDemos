public class WhileDemo {

	public static void main(String[] args) {
		int i = 5;
		while (i < 10) {
			System.out.println(i); // output = 5 7 9
			i += 2;
		}
		System.out.println("while loop finished");

		// Do - while
		int j = 1;
		do {
			System.out.println(j); // 10dan kucuk oldugu surece arttir 2ser
			j += 2;
		} while (j < 10); // output : 1 3 5 7 9

	}
}
