package chap4.exam02;

import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Scanner scan = new Scanner(System.in); //ctrl shift o
//		
//		System.out.println("점수를 입력해 주세요");
//		
//		int score = scan.nextInt();
//		
//		if (score>=90) {
//			System.out.println("점수가 90점 이상이다.");
//			System.out.println("A등급 입니다.");
//		} 
//		
//		else if (score >=80) {
//			System.out.println("90점 보다 점수가 낮고 80점 이상이다.");
//			System.out.println("B등급 입니다.");
//		}
//		
//		else if (score >=70) {
//			System.out.println("80점 보다 점수가 낮고 70점 이상이다.");
//			System.out.println("C등급 입니다.");
//		}
//		
//		else {
//			System.out.println("점수가 70점 미만입니다.");
//			System.out.println("D등급 입니다.");
//		}
		
		
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

		
	int i =1;
	if (i == 1) {
		System.out.println("1입니다.");
	}
	else if (i == 2) {
		System.out.println("2입니다.");
	} else {
		System.out.println("not 1 or 2");
	}
	
	//char, byte, short, int,String 만 사용가능 ,bollean
	switch (i) {
		case 1:
			System.out.println("1입니다.");
			//break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("1과 2가 아닙니다.");
			break;
		
		}
	
	int month = 1;
	if(3<=month) {
		if(5<=month) {
			System.out.println("봄 입니다");
		}	
		else if(month<=8) {
			System.out.println("여름 입니다");
			}	
		else if(month<=11) {
			System.out.println("가을 입니다");
			}
		}
	else { //자바에서 else문은 조건을 가질수 없다.
		System.out.println("겨울 입니다");
	}

	
////////문제 1/////////////////////////	
	int pra = 1;
	if(pra < 0) {
		System.out.println("음수");
		}
		else if(pra >0) {
			System.out.println("양수");
		}
	
		else {
			System.out.println("0");
		}

	//////////////5/////////////
	int minus = 115;
	int amount = 10000;
	if(amount - minus < 0) {
		System.out.println("잔액이 부족합니다.");
		}
		else if(amount - minus >0) {
			System.out.printf("%d출금 했고 %d남았습니다.\n", minus, (amount-minus));
		}
	
		else {
			System.out.println("정확히 입력해 주세요");
		}
	
	//////////////9///////////////////////
	int x1 = 10;
	int y1 = 20;
	int x2 = 90;
	int y2 = 100;
			
	
//	int month = 1;
//
//	if (3 <= month) {
//	    if (month <= 5) {
//	        System.out.println("봄 입니다");
//	    } else if (month <= 8) {
//	        System.out.println("여름 입니다");
//	    } else (month <= 11) {
//	        System.out.println("가을 입니다");
//	    } 
//	} else {
//	    System.out.println("겨울 입니다");
//	}

}
}