package coding;

import java.util.*;

public class Cal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			System.out.println(a + b);
		} catch (Exception e) {
			System.out.printf("¿¡·¯", e);
		}

	}
}
