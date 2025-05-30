package chap4.exam02;

public class for_exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum = 0;
//		for(; sum <= 10 ; sum ++) {
//			System.out.println(sum);
//
//		}
//		int sum1=0;
//		for(int i = 1; i <=10; i++ ) {
//			sum1 +=1;
//			System.out.println(sum1);
//		}
		
		//구구단 3단 출력
		int i = 3;
		for(int x = 1;x<=9;x++ ) {
			System.out.printf("%d x %d = %d\n", i, x, i*x);
		}
//				

//		int sum2 =0;
//		for(int i = 1 ;i<=100; i++) {
//			sum2 = sum2 + i;
//		}
//		System.out.println(sum2);
		
//		//피보나치 수열
//		int sum3 =0;
//		int sum4 = 1;
//		int sum5;
//		//System.out.println(sum3);
//		for(int w = 1 ;w<=9; w++) {
//		
//			sum5 = sum4 + sum3;
//			sum3 = sum4;
//			sum4 = sum5;
//			//System.out.println(sum3);		
//		
//		}
//		System.out.println(sum3);	
		
//		for(int x = 2 ; x<=10 ; x++ ) {
//			if(x%2 == 0) {
//				System.out.println(x);
//			}
//		}
//		
//		for(int x = 10 ; x>0; x--) {
//			System.out.println(x);
//		}
//		
//		for(int x = 10 ; x>0; x--) {
//			if(x %2==0) {				
//				System.out.printf("%d : 짝수\n",x);
//			}
//			else {
//				System.out.printf("%d : 홀수\n",x);
//			}
//		}
//		
		
		////////////////////5////////////////////////
//		System.out.println("5번 문제");
//		for(int r = 1; r<=10;r++) {
//			if(r %3 != 0) {
//				System.out.print(r); //10일떄 ln으로 출려 하는것도 방법임 줄바꿈 주의
//				}
//			else {
//				System.out.println(r);
//				}
//			}
//		
//		
//		///////////////////////6//////////////
//		System.out.println("\n6번 문제");
//		int count = 0 ;
//		for(int t = 1; t<=100; t++) {
//			if(t % 2 !=1) {
//				count = count +1;
//			}
//			
//		}
//		System.out.println(count);
//		
//		/////////7///////////////////////
//		System.out.println("7번 문제");
//		for( int q = 2 ; q<10; q++) {
//			for (int n = 1; n<10;n++) {
//				System.out.printf("%d x %d = %d\n", q, n, q*n);
//		}
//		}
//		
//		//////////////8///////////////
//		System.out.println("8번 문제");
//		int n = 2;
//		for(int x = 2; x<=9; x++) {
//			System.out.printf("%d x %d = %d\n", x, n, x*n);
//			
//		}
//	
//	
//	//피라미드 만들기		
//		//길이를 11/ 5,1,5식으로 출력, ww = 총 길이
//		for (int ww = 1; ww<=31;ww=ww+2) {
//			int y;
//			y = (31-ww)/2; //한방향의 공백수
//				System.out.println(" ".repeat(y) + "*".repeat(ww) + " ".repeat(y));
//			}
//		
//	//역피라미드	
//		for (int ww = 29; ww<=29;ww=ww-2) {
//			int y;
//			if(ww>=0) {
//				y = (31-ww)/2; //한방향의 공백수
//				System.out.println(" ".repeat(y) + "*".repeat(ww) + " ".repeat(y));
//			}
//		}
//		
//		for (int y = 1;y<=5;y++) {
//			for(int x = 1;x<=y;x++) {
//				if (x<y) {
//					System.out.print("*");
//				}
//				
//				else {System.out.println("*");
//					
//				}
//			}
//		}
		
		//사다리꼴 두개 만들고, 역 삼각형 밑에 붙히자, 하트 만들기
		for (int ww = 3; ww<=10;ww=ww+4) {
			int y;
			y = (10-ww)/2; //한방향의 공백수
				System.out.println("    "+
						" ".repeat(y) +
						"*".repeat(ww) +
						" ".repeat(y)+""+
						"  "+
						" ".repeat(y) +
						"*".repeat(ww) +
						" ".repeat(y));
			}
		for (int ww = 20; ww<=20;ww=ww-4) {
			int y;
			if(ww>=0) {
				y = (29-ww)/2; //한방향의 공백수
				System.out.println( " ".repeat(y) +
						"*".repeat(ww) +
						" ".repeat(y));
			}
		}
		//////////////////////7///////////////////////////////////
		for (int y = 5;y<=5;y--) {
			for(int x = 1;x<=y;x++) {
				if (x<y) {
					System.out.print(y);
				}
				
				else {
					System.out.println(y);
					
				}
			}
		}
		////////////8////////////////////////////////////////
		System.out.println("8번");
		int yy = 5; //길이
		for (int y = 1;y<=yy;y++) {
			for(int x = 1;x<=y;x++) {
				if (x<y) {
					System.out.print("*");
				}
				
				else {
					System.out.println("*" +
							"-".repeat(yy-x));
					
				}
			}
		}
		/////////////////////9///////////////////////////////
		System.out.println("9번");
		yy = 5; //길이
		for (int y = 5;y<=yy;y++) {
			for(int x = 1;x<=y;x++) {
				if (x<y) {
					System.out.println("-".repeat(yy-x) +
							"*".repeat(x)
							);
				}
				
				//else {System.out.print("*");}
			}
		}
		
		////////////////10///////////////////////////////////
		System.out.println("10번");
	
		int range = 9;
		for(int x =1; x< range; x = x+2) {
				System.out.println("-".repeat((range-x)/2) +
						"*".repeat(x)
						);
		}
		

		
		
		/////////////////11///////////////////////////////////
		System.out.println("11번");
		
		range = 9;
		for(int x =1; x< range; x = x+2) {
				System.out.println("-".repeat((range-x)/2) +
						"*".repeat(x)+
						"-".repeat((range-x)/2)
						);
		}
		
		///////////////12/////////////////////////////////////
		System.out.println("12번");
		int input = 10;
		int r = 1+ 2*(input-1);
		
		for(int u = 1; u<=r; u = u+2) {
			if(u !=r) {
//				System.out.println(u);
//				System.out.println((2^u));
//				System.out.println(r/2);
				System.out.println("-".repeat((r-u)/2) + "*".repeat(u)+"-".repeat((r-u)/2));			
			}
			
			else {
				System.out.println("*".repeat(u));
			}
		}
	
		
		
		}
	}
	
	
	
	
	
	
	
	
	
		
