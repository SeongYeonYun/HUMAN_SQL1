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
	System.out.println("문제 1");
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
	/////////////2////////////////////
	System.out.println("문제 2");
	int a = 0;
	int b = 215;
	
	if(a>b) {
		System.out.println(String.format("a > b 중에 큰 수는 %d입니다.", a));
	}
	else if(a<b) {
		System.out.println(String.format("b > a 중에 큰 수는 %d입니다.", b));
	}
	else {
		System.out.println("두수가 같다.");
	}
	//////////////3////////////////
	System.out.println("문제 3");
	//시간 더하기 
		int hour = 12;
		int min = 40;
		int min_add = 35;
		//조건문?????안쓰고 되나????
		//35분 더해
		
		hour = ((hour * 60) + min + min_add)/60;
		//사건울 분으로 나눈뒤 다시 시간으로 변환한다.
		
		min = ((hour * 60) + min + min_add)%60; 
		//분을 분으로 반환한다
		
		System.out.println(String.format(hour + "시" + min + "분 입니다"));
		System.out.println(String.format("%s시%s분 입니다",hour,min));
		System.out.printf("%d시%s분 입니다\n",hour,min); //자동 줄바꿈이 안됨
		
	///////4////////////////////
	System.out.println("문제 4");
	int num = 88;
	if(num >= 15 && num <= 20) {
		System.out.println("num은 15이상, 20이하 입니다.");
	}
	else {
		System.out.println("해당없음");
	}
	
	
	
	//////////////5/////////////
	System.out.println("문제 5");
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
	
	////////////6////////////////////////
	System.out.println("문제 6");
	int xa = 125;
	if(xa<100 && xa%2 ==0) {
		if(xa<0 ) {
			System.out.println("100보다 작다, 음수이다, 짝수이다");
			
		}
		else {
			System.out.println("100보다 작다, 0이상이다, 짝수이다");
		}
		
	}
		
	else if(xa<100 && xa%2 ==1) {
		if(xa<0 ) {
			System.out.println("100보다 작다, 음수이다, 홀수이다");
			
		}
		else {
			System.out.println("100보다 작다, 0이상이다, 홀수이다");
		}
	}
	
	else if(xa>=100 && xa%2 ==0) {
		if(xa<0 ) {
			System.out.println("100이상, 음수이다, 짝수이다");
			
		}
		else {
			System.out.println("100이상, 0이상이다, 짝수이다");
		}
	}
	
	else {
		System.out.println("100이상, 0이상이다, 홀수이다");
		
	}
	
	//////////////////7//////////////////////////
	System.out.println("문제 7");
	int dgr = 2;
	int dgr_y = -3; //저날기온 
	if (dgr_y < dgr) {
		System.out.printf("오늘은 영하 %d도 입니다. 어제보다 %d도 높습니다.\n",
				Math.abs(dgr_y),
				dgr-dgr_y);
	}
	else if (dgr_y < dgr) {
		System.out.printf("오늘은 영하 %d도 입니다. 어제보다 %d도 낮습니다.\n",
				Math.abs(dgr_y),
				dgr-dgr_y);
		}
	else System.out.println("두 수가 값습니다.");
	/////////////8/////////////////////////////
	System.out.println("문제 8");
	int asd = 77;
	if (10<=asd && asd<=99) {
		if (asd %10 == (asd - asd%10)/10) {//asd %10 == asd % 1.0 double 과 int 이기 떄문에 다름
			System.out.println("두수의 십과 일의 자리 숫자가 같다");
		}
		
		else {
			System.out.println("두수의 십과 일의 자리 숫자가 다르다");
		}
	}
	
			
	
	
	//////////////9///////////////////////
	System.out.println("문제 9");
	int x1 = 10;
	int y1 = 20;
	int x2 = 90;
	int y2 = 100;
	int x3 = 50;
	int y3 = 50;
	
	if(x3>=20 && x3<=90) {
		if (y3 >=20 && y3<=100) {
			System.out.println("사각형 안에 있습니다.");
		}
	}
			
	
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