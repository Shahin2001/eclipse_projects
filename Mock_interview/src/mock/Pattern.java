package mock;

public class Pattern {
	public static void main(String[] args) {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				if (i == 1 || i == 3 || i == 5) {
                    System.out.print("*");

				}
				else if (i == 2 && j == 1) {
					System.out.print("*");
				}
				else if (i == 4 && j == 5) {

					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}

			System.out.println();

		}

	}
}
