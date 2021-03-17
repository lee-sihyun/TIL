package coding;

import java.util.*;

public class LeapYear {
	public static void main(String[] args) {

		/* 2753 */

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

//윤년:1 아니면 0 이며 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐때 또는 400의 배수일때이다.

		if (year % 4 == 0) {

			if (year % 100 != 0 || year % 400 == 0) {

				System.out.println("1");
			} else {
				System.out.println("0");
			}
		} else {
			System.out.println("0");
		}

	}
}
