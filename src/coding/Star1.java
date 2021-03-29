package coding;

import java.util.Scanner;

public class Star1 {
	public static void main(String[] args) {

		/* 2438 */

		Scanner sc = new Scanner(System.in);

		int s = sc.nextInt();

		for (int i = 0; i <= s; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}
}
