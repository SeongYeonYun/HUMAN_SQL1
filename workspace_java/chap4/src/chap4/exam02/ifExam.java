package chap4.exam02;

import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); //ctrl shift o
		
		System.out.println("점수를 입력해 주세요");
		
		int score = scan.nextInt();
		
		if (score>=90) {
			System.out.println("점수가 90점 이상이다.");
			System.out.println("A등급 입니다.");
		} 
		
		else if (score >=80) {
			System.out.println("90점 보다 점수가 낮고 80점 이상이다.");
			System.out.println("B등급 입니다.");
		}
		
		else if (score >=70) {
			System.out.println("80점 보다 점수가 낮고 70점 이상이다.");
			System.out.println("C등급 입니다.");
		}
		
		else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("D등급 입니다.");
		}
		
		
//		if (score%2==0) { // !(score%2==0) -> not 짝수
//			System.out.println("짝수");
//			
//		} else {
//			System.out.println("짝수");
//			}	
//	
///////////////////////////////////////////////////////////////////
		// random
		//set seed?????? 컴퓨터는 랜덤이란 없다. 아마 랜덤한 시드를 자동으로 생성하여 실행하는거 같다.
		
		double random = Math.random();
		System.out.println(random);

}
}