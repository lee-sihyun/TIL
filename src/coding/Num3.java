package coding;

import java.util.*;

public class Num3 {
	public static void main(String[] args) {

		/* 11021 */

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		int n = 0;

		for (int i = 1; i < T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			n++;

			System.out.println("Case #" + n + ": " + (a + b));
		}

	}
}
