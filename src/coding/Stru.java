package coding;

import java.util.*;

public class Stru {
	public static void main(String[] args) {

		//가위바위보
		
		
		//입력
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("** 가위!바위!보! **");
		System.out.println("가위(0),바위(1),보자기(2)를 입력하세요");
		
		
		//사용자
		int a= sc.nextInt();
		
		System.out.println("나는");
		System.out.println(" ");
		if(a==0) {
			System.out.println("가위 내기!");
		}
		if(a==1) {
			System.out.println("바위 내기!");
		}
		if (a==2) {
			System.out.println("보자기 내기!");
		}
		
		System.out.println("==============");
		System.out.println("상대방");
		System.out.println("  ");
		//컴퓨터
		int rand=(int)(Math.random()*3); 
		if(rand==0) {
			System.out.println("가위");
		}
		if(rand==1) {
			System.out.println("바위");
		}
		if (rand==2) {
			System.out.println("보자기");
		}
		
		System.out.println("==================");
		
		
		if(rand==0) {
			if(a==0) {
				System.out.println("비겼네용");
			}
			if(a==1) {
				System.out.println("이겼습니다!!><");
			}
			if(a==2) {
				System.out.println("졌습니다 ㅠㅠ ");
			}
			
		}
		
		
		if(rand==1) {
			if(a==0) {
				System.out.println("졌습니다 ㅠㅠ");
			}
			if(a==1) {
				System.out.println("비겼네용");
			}
			if(a==2) {
				System.out.println("이겼습니다!!>< ");
			}
			
		}
		
		if(rand==2) {
			if(a==0) {
				System.out.println("이겼습니다!! ><");
			}
			if(a==1) {
				System.out.println("졌습니다 ㅠㅠ");
			}
			if(a==2) {
				System.out.println("비겼네용 ");
			}
			
		}
	}
}
