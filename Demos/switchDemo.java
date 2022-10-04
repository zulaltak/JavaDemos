public class switchDemo {

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println(" You are definitely passed ");
			break;
		case 'B':
			System.out.println(" You passed ");
			break;
		case 'C':
			System.out.println(" You failed the class ");
			break;
		default:
			System.out.println("null");
		}

	}

}
