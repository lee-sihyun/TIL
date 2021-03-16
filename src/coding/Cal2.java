package coding;

import java.util.*;

public class Cal2 {
	public static void main(String[] args) {

		/* 10430 */

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		System.out.println((a + b) % c);
		System.out.println((a % c + b % c) % c);
		
		System.out.println((a * b) % c);
		System.out.println((a % c + b % c) % c);

		
		
		/*2588*/
		

		int A,B;
		
		A= sc.nextInt();
		B= sc.nextInt();
		
		
		System.out.println(A*(B%10));
		System.out.println(A*(B%100/10));
		System.out.println(A*(B/10));
		System.out.println(A*B);
		
		
		
		/*1330*/
		int C,D; 
		
		C=sc.nextInt();
		D=sc.nextInt();
		
		if(C>D) {
			
			System.out.println(">");
		}else if(C<D) {
			System.out.println(">");
		}else {
			System.out.println("==");	
		}
		
		
	}
}
