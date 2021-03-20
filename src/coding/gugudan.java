package coding;

import java.util.*;

public class gugudan {
	public static void main(String[] args) {
		/* น้มุ 2739 */

		Scanner sc = new Scanner(System.in);

		/*
		 * int N; int M;
		 * 
		 * N = sc.nextInt(); M = sc.nextInt();
		 * 
		 * for (N = 2; N <= 9; N++)
		 *  { for (M = 1; M <= 9; M++) 
		 *  { System.out.println(N +
		 * "*" + M + "=" + N * M); } } 
		 * System.out.println(" ");
		 */

		int N = sc.nextInt();

		for (int i = 1; i < 10; i++) {
			System.out.println(N + " * " + i + " = " + (N * i));

		}
	}
}
