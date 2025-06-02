package chap4.exam02;

import java.util.Scanner;

public class BreakExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("* game start *");
		int count = 1;
		while(true) {
			int num = (int)(Math.random()*6 +1);
			System.out.println(String.format("%d 번쨰 주사위 : ",count) + num);
			
			if(num==6) {
				break;
			}
			
			count++;
		}
		
		for(int i = 1;i<10;i++) {
			System.out.println("i: "+i);
		
			for(int j =0;j<5;j++) {
				System.out.println("j= "+j);
				if(j>=2) {
					System.out.println("break");
					break;
				}				
			}
		}
		//총 다섯명이 순차적으로 게임시작
		//만약 한명이라도 6이 나오면 게임 종료
		boolean isStop = false; //그런 사건이 있었는지??
		for(int i =1;i<=5;i++) {
			//한명당 주사위 3번 던지기
			for(int j=1; j<=3;j++) {
				int num2 =  (int)(Math.random()*6 +1);
				System.out.println("주사위 = " + num2);
				//만약 6이 나오면 게임종료
				if(num2==6) {
					isStop = true;
					break;
				}
			}
			
			if(isStop) {
				break;
			}
			}
		///////문제 1// -3이 나오면 음수라 출력 나머지는 양수라고 출력	
		Scanner scan = new Scanner(System.in); 
			//ctrl shift o, 스케너를 열면 항상 scan.close해줘야 한다.
		while(true) {
			System.out.println("숫자를 입력해 주세요");	
			int num = scan.nextInt();
			if(num == -3) {
				System.out.println("음수입니다");	
				break;
			} else {
				System.out.println("양수입니다");	
			}
		}
		
		///문제 2 // 월을 입력하면 계절이 나오고 0을 입력하면 종료
		Scanner sscan = new Scanner(System.in);
		System.out.println("월을 입력");
		int month = scan.nextInt();
		while(month!=0) {
			if(3<=month && month<=5) {
				System.out.println("봄");
				break;
			} else if(month>=6 && month <=8) {
				System.out.println("여름");
				break;
			} else if(month >=9 && month <=11) {
				System.out.println("가을");
				break;
			} else if(month == 0) {
				break;
			} else {
				System.out.println("겨울");
				break;
			}
		}
		
		
		
		
		//문제3// 가위바위보 게임이 0ㅇ 입력될떄까지 반복
		
		System.out.println("몇번의 게임을 할랴?");
		int game = scan.nextInt();
		int couts = 1;
		while(game>0) {
			System.out.println("게임을 시작하지" + couts);
			couts ++;
			game --;
		}
		
		
		
		
		//4// 1.예금, 2.출금, 3.잔고확인, 4.졸료
		//예금할떄 음수 안됨
		//출금할떄 음수 안됨, 잔고보다 큰 금액 불가
		
		Scanner sscan1 = new Scanner(System.in);
		System.out.println("방식을 선택 \n  1.예금, 2.출금, 3.잔고확인, 4.졸료");
		int type = sscan1.nextInt();
		
		
		
		int amount = 500000;
		while(true) {
			switch(type) {
				case 1:
					System.out.println("가격을 입력하시오");
					int price = scan.nextInt();
					if(type <0) {
						continue;
					} else {
						amount = amount + price;
						System.out.println("잔액 = "+ amount);
						break;
					}
						
				case 2 :
					System.out.println("가격을 입력하시오");
					price = scan.nextInt();
					if(type <0) {
						continue;
					} else if(price > amount){
						continue;
					} else {amount = amount - price;
						break;
					}
				
				case 3: 
					System.out.println("잔액 = "+ amount);
					break;
				
				case 4:
					break;
			}
			break;
			}
		}
				
		}
	


