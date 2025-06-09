package chap05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] a1 = new int[6];
//		int a2 [][] = new int[5][10];
//		int a3 [][] = new int[5][10];
//		
//		String [] s1;
//		
//		//배열 변수는 참조타입이라서  null값을 가질수 있디.
//		int score_0  = 90;
//		int score_1  = 80;
//		int score_02 = 75;
//		for (int x = 0;x<=5;x++) {
//			a1[x] = 90-x;
//		
//		}
//		
//		a2[0][0] = 10;
//		a2[0][1] = 5;
//		System.out.println(Arrays.toString(a1)); //1차원 배열 출력 , Arrays import
//		
//		System.out.println(Arrays.deepToString(a2)); //2차원 배열 출력
//		System.out.println(a2[0][1] == a2[0][0]); 
//		
//		int[] score = new int[3];
//		score[0] = 90;
//		score[1] = 85;
//		score[2] = 70;
//		System.out.println("score : " + score[1]);
//		System.out.println("a1 : " + a1[1]);
//		//System.out.println("a1 : " + a1[1]);
//		
//		int[] i1 = new int[] {90,80,75};
//		int [] i2 = null;
//		i2 = new int[] {90,80,75};
//		//선언과 동시에 초기화 하는경우 new생략 가능
//		int[] i3 = {90,80,75};
//		
//		System.out.println(i1 == i3);
//		System.out.println("score_length = "+a2.length);
//		
//		//2차원 배열의 경우 먼저 2차원 안 1차원에 속하는 배열들이 먼저 heap메모리에 할당되고, 
//		//할당된 배열을 찹조하는 다른 배열이 순차적인 메모리 값을 가진다고 하는데 글험 누가 어떤값을 가지는가??
//		
//		int [] aaa = new int[10]; 
//		for(int i = 1 ; i<= 10; i++) {
//			aaa[i-1] = i;
//			System.out.println(aaa[i-1]);
//			}
//		
//		System.out.println(Arrays.toString(aaa));

		int[] d1 = {1,2,3,4,5};
		int[] d2 = d1; //주소만 복사됨
		int[] d3 = {1,2,3,4,5};
		System.out.println(d1 == d3); //stack에 저장된 주소값이 다르다.
		System.out.println(d1 == d2);
		
		d2[1] = 10;
		System.out.println(d1[1]); //정해진 주소값으로 들어가 수정한것이기 때문에 , 번지수가 같아서
		d2 = d3;//d2의 주소값을 변환하는것이기 때문에 d1과는 상광이 없다.
		System.out.println(d2 == d3);
		System.out.println(d2[1]);
		
		int[] e = new int[10];
		e[0] = 1;
		e[1] = 2;
		for(int i=0 ;i<10;i++) {
			e[i] = i+1;
		}
		
		int[] f = {15,354,84,31,11};
		for(int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		
		int[] f2 = new int[f.length];
	
		
		for(int i = 0; i<f.length;i++ ) {
			f2[i] = f[i];
			System.out.println(f2[i]);
		}
		
		for(int i = 0;i <f.length;i++) {
			int data = f[i];
			System.out.println(data);			
		}
		
		//enhance for 요약이 됨
		for (int data:f) {
			System.out.println(data);	
		}
	    //-----------------------------문제 1
		System.out.println("-----------문제 1번 ------------------");
		int[] n = {1,2,3};
		int[] n1 = new int[3];
		for(int i = 0;i< n.length; i++) {
			n1[i] = n[(n.length-1)-i];
	
		}
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n));
		
		System.out.println("-----------문제 2번 ------------------");
		int[] hol =  {3,4,7,5,1,9,4};
		int cnt_hol = 0;
		for(int i = 0; i < hol.length ; i++) {
			if (hol[i] %2 >0) {
				cnt_hol ++;
				
				
			}
		}
		System.out.println(cnt_hol);
		
		System.out.println("-----------문제 3번 ------------------");
		cnt_hol = 0;
		for(int i = 0; i < hol.length ; i++) {
			if (hol[i] >4) {
				cnt_hol ++;
				
				
			}
		}
		System.out.println(cnt_hol);
		System.out.println("-----------문제 4번 ------------------");
		int temp2 = 0;
		for(int i = 0 ; i<hol.length-1 ; i++) {
			if(hol[i] >= hol[i+1]) {
				temp2 = hol[i]; 				
				}
		}
		
		System.out.printf("제일 큰 수 = %d \n" , temp2);
		System.out.println("-----------문제 5번 ------------------");
		int temp3 = 0;
		
		for(int i = 0 ; i<hol.length-1; i++) {
			if(hol[i] < temp2) {
				if(hol[i] >= hol[i+1] && temp3 <=hol[i]&& hol[i+1] !=temp2) {
					temp3 = hol[i];
					System.out.println(temp3);
					} else if(hol[i] < hol[i+1] && temp3 <=hol[i+1] && hol[i+1] !=temp2){
						temp3 = hol[i+1];
						System.out.println(temp3);
						}
			} 
		}
		//수정하고
		System.out.printf("두번쨰로 큰 수 = %d \n" , temp3);
		
		System.out.println("-----------문제 6번 ------------------");
		//오른쪽으로 한칸 밀고 왼쪽에는 0추가 하기
		int [] q_1 = {3,7,4,5,8,9,4};
		int [] q_2 = new int[q_1.length+1];
		for(int i = 0; i < q_2.length;i++){
			if(i == 0) {
				q_2[0] = 0;
			} else {
				q_2[i] = q_1[i-1];
			}
			
		}
		System.out.println(Arrays.toString(q_1));
		System.out.println(Arrays.toString(q_2));
	     
		System.out.println("-----------문제 7번 ------------------");
		int [] ray = {3,4,7,5,1,9,4};
		int [] temp = new int[1];
		//int [] temp1 = new int[ray.length -1];
		temp[0] = ray[0];
		for(int a = 0; a< ray.length; a++) {			
			if(a != ray.length-1) {
				ray[a] = ray[a+1];
			} else {ray[a] = temp[0];
				}				
			}
		
		System.out.println(Arrays.toString(ray));
			
		
		
		System.out.println("-----------문제 8번 ------------------");
//	    + 8-1 : 숫자만  math.random 
		int [] num_pw = new int[8];
		for(int x = 0;x<num_pw.length ; x++) {
			num_pw[x] = (int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(num_pw));
		System.out.println("-----------문제 8-2번 ------------------");
//	    + 8-2 : 소문자만,  아스키 코드 조건식 97 ~ 122
		int [] int_pw = new int[8];
		
		//int [] int_pw = {97,100,101,111,105,109,105,107}; 
		//그럼 숫자를 입력하는 범위를 정해 
		for(int x = 0;x<int_pw.length; x++) {
			int_pw[x] = 97 + (int)(Math.random() * 26);
		}
		char [] char_pw = new char[int_pw.length];		
		for (int i = 0; i < char_pw.length; i++) {
		    char_pw[i] = (char) int_pw[i];
		}
		System.out.println(Arrays.toString(char_pw));
		
//	    + 8-3 : 숫자2개 이상, 대/소문자 각 1개 이상 
		System.out.println("-----------문제 8-3번 ------------------");
//		char [] char_pw2 = new char[8];
//		char arr03[0] = (char)((int)(Math.random()*10));
//		char arr03[1] = (char)((int)(Math.random()*10));
		
		System.out.println("-----------문제 9번 ------------------");
//		자리가 10개 있는 소극장의 예약 시스템
//		자리 번호는 1~10번까지 번호의 자리가 있습니다.
//		메뉴 : "1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료"
//		만약1 : 예약이 가능하다면 "n번 자리 예약 했습니다"
//		만약2 : 예약이 불가능하다면 "이미 예약 되어 있습니다"
		//시작할떄 예약이 가능한 좌석과 아닌 좌석을 보여주자
		//scan 함수 호출
		//1은 예약 가능석 2는 불가석
		int[] seat =new int [10];
		for(int x = 0; x< seat.length; x++) {			
			seat[x] = (int)(Math.random()*2+1);
		}
		
		Scanner scan = new Scanner(System.in);
		while(true) {				
			System.out.println("메뉴 : 1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료");
			System.out.println("선택해 주세요");
			int type = scan.nextInt();
			if (type == 2) {
				System.out.printf("좌석현황 1은 예약 가능석 2는 불가석\n" + Arrays.toString(seat) + "\n");
				continue;
				}else if(type == 1) {
					while(true){
						System.out.println("몇번 좌석을 예매하시겠습니까?");
						int seat_num = scan.nextInt();
						if(seat[seat_num-1] == 1) {
							seat[seat_num-1] = 1;
							System.out.println(String.format("%d 번 자리 예메 완료",seat_num));
							break;
						} else {
							System.out.println("이미 예약되었습니다");
							continue;
							} 
						}
					break;
					
					} else if(type == 3) {
						int cnt = 0;
						for(int w = 0; w<seat.length; w++) {
							if(seat[w] == 1) {
								cnt ++;
							}
						}
						System.out.printf("%d석이 예약 가능합니다.\n", cnt);						
						continue;
					} else {
						break ;
					}
		}
		
		
		
		
		
		
		
		System.out.println("-----------문제 10번 ------------------");
		int[] buy_number = new int[6];
		int[] rotto = new int [45];
		//랜덤추출로 random.nextInt(45);
		//배열 하나를 더 만든다음 비복원 추출로 해보자
		
		for(int i = 1; i<=45;i++) {
			rotto[i-1] = i;
		}
		while(true) {
			for(int i = 0; i<=5;i++) {
				int rand = (int)(Math.random() * 46);
				buy_number[i] = rand;
			}
			
			for (int x = 0; x<buy_number.length; x++) {
				for(int y = buy_number.length-1;y>=0;y--) {
					if(buy_number[x] == buy_number[y]) {
						continue;
					} 
				}
			}
			
			
			System.out.println(Arrays.toString(buy_number));
			break;
		}
				 
//		for(int i =0;i<=5;i++) {
//			int rand = (int)(Math.random() * 46);
//			//System.out.println(rand);
//			for(int x = 0;x<buy_number.length-1; x++) {
//				if (buy_number[x] != rand) {
//					if(buy_number.length ==6) {				
//						buy_number[i] = rotto[rand-1];
//					}
//				}
//			}
//			
//		}
		
		
		

		//max Integer.MIN_VALUE; 가장 작은값, MAX_VALUE도 가능
		
		
	}

}


