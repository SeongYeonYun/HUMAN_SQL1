package chap4.exam02;

import java.util.Scanner;

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
//		for (int ww = 3; ww<=10;ww=ww+4) {
//			int y;
//			y = (10-ww)/2; //한방향의 공백수
//				System.out.println("    "+
//						" ".repeat(y) +
//						"*".repeat(ww) +
//						" ".repeat(y)+""+
//						"  "+
//						" ".repeat(y) +
//						"*".repeat(ww) +
//						" ".repeat(y));
//			}
//		for (int ww = 20; ww<=20;ww=ww-4) {
//			int y;
//			if(ww>=0) {
//				y = (29-ww)/2; //한방향의 공백수
//				System.out.println( " ".repeat(y) +
//						"*".repeat(ww) +
//						" ".repeat(y));
//			}
//		}
//		//////////////////////7///////////////////////////////////
//		System.out.println("7번");
//		for (int y = 5;y<=5;y--) {
//			for(int x = 1;x<=y;x++) {
//				if (x<y) {
//					System.out.print(y);
//				}
//				
//				else {
//					System.out.println(y);
//					
//				}
//			}
//		}
//		////////////8////////////////////////////////////////
//		System.out.println("8번");
//		int yy = 5; //길이
//		for (int y = 1;y<=yy;y++) {
//			for(int x = 1;x<=y;x++) {
//				if (x<y) {
//					System.out.print("*");
//				}
//				
//				else {
//					System.out.println("*" +
//							"-".repeat(yy-x));
//					
//				}
//			}
//		}
//		/////////////////////9///////////////////////////////
//		System.out.println("9번");
//		yy = 5; //길이
//		for (int y = 5;y<=yy;y++) {
//			for(int x = 1;x<=y;x++) {
//				if (x<y) {
//					System.out.println("-".repeat(yy-x) +
//							"*".repeat(x)
//							);
//				}
//				
//				//else {System.out.print("*");}
//			}
//		}
//		
//		////////////////10///////////////////////////////////
//		System.out.println("10번");
//	
//		int range = 9;
//		for(int x =1; x< range; x = x+2) {
//				System.out.println("-".repeat((range-x)/2) +
//						"*".repeat(x)
//						);
//		}
//		
//
//		
//		
//		/////////////////11///////////////////////////////////
//		System.out.println("11번");
//		
//		range = 10;
//		for(int x =1; x< range; x = x+2) {
//				System.out.println("-".repeat((range-x)/2) +
//						"*".repeat(x)+
//						"-".repeat((range-x)/2)
//						);
//		}
//		
//		///////////////12/////////////////////////////////////
//		System.out.println("12번");
//		int input = 10;
//		int r = 1+ 2*(input-1);
//		
//		for(int u = 1; u<=r; u = u+2) {
//			if(u !=r) {
////				System.out.println(u);
////				System.out.println((2^u));
////				System.out.println(r/2);
//				System.out.println("-".repeat((r-u)/2) + "*".repeat(u)+"-".repeat((r-u)/2));			
//			}
//			
//			else {
//				System.out.println("*".repeat(u));
//			}
//		}
//		
//		System.out.println();
//		System.out.println();
//		System.out.println();
		
		
		// 문제 1// 주사위 두개의 모든 조합
		System.out.println("----------1번 문제---------");
//		//배열을 안쓰고????? matrix는 ??
//		int [][] indice = new int [6][6];
//		int [][] append = new int [1][1]
		for(int dice_1 = 1; dice_1 <=6; dice_1 ++) {
			for(int dice_2 = 1; dice_2 <=6; dice_2 ++) {
//				indice = [dice_1][dice_2] = appe[dice_1,dice_2]; //append??
				System.out.print(String.format("{%d, %d} ",dice_1, dice_2));
			}
		}

		
		
		//문제 2번// 주사위 조합 두개의 합별로 나오는 수들의 조합
		System.out.println("\n----------2번 문제---------");
		int sum;
		for(int ra = 2; ra <=12; ra ++) {
			String text_1 = String.format("두 수의 합 : %d을 이루는 조합 =",ra);
			for(int dice_1 = 1; dice_1 <=6; dice_1 ++) {
				for(int dice_2 = 1; dice_2 <=6; dice_2 ++) {
					//indice = [{dice_1,dice_2}]; //append??
					sum = dice_1 + dice_2;
					
					if(sum == ra) {
						String text_2 = String.format("{%d, %d}", dice_1,dice_2) ;
						text_1 = text_1.concat(text_2);
						}					
				}
			
		}
			System.out.println(text_1);
		}
		
		//문제3번// 각 별로 조합의 수를 같이 추출
		//int sum;
		System.out.println("\n----------3번 문제---------");
		for(int ra = 2; ra <=12; ra ++) {
			int cnt = 0;
			String text_1 = String.format("두 수의 합 : %d을 이루는 조합 =",ra);
			for(int dice_1 = 1; dice_1 <=6; dice_1 ++) {
				for(int dice_2 = 1; dice_2 <=6; dice_2 ++) {
					//indice = [{dice_1,dice_2}]; //append??
					sum = dice_1 + dice_2;
				
					if(sum == ra) {
						cnt ++;
						String text_2 = String.format("{%d, %d}", dice_1,dice_2) ;
						text_1 = text_1.concat(text_2);
						}					
				}
			
		}
			System.out.println(text_1.concat(String.format("%d", cnt)));
		}
		
		//문제4번//순서에 관계 없이 출력
		System.out.println("----------4번 문제---------");
		//2로 나눴을떄 나머지가 0인 경우 cnt = (cnt-1)/2
		//그렇지 않을경우 cnt = cnt/2
		for(int ra = 2; ra <=12; ra ++) {
			if(ra%2 == 0) {
				int cnt = 0;
				String text_1 = String.format("두 수의 합 : %d을 이루는 조합 =",ra);
				for(int dice_1 = 1; dice_1 <=6; dice_1 ++) {
					for(int dice_2 = 1; dice_2 <=6; dice_2 ++) {
						//indice = [{dice_1,dice_2}]; //append??
						sum = dice_1 + dice_2;
					
						if(sum == ra) {
							cnt ++;
							if(dice_2>=dice_1) {
								String text_2 = String.format("{%d, %d}", dice_1,dice_2) ;
								text_1 = text_1.concat(text_2);
								
							}
											
							}					
					}
				
			}
				System.out.println(text_1.concat(String.format("%d",(cnt-1)/2+1)));
		}	else {
				int cnt = 0;
				String text_1 = String.format("두 수의 합 : %d을 이루는 조합 =",ra);
				for(int dice_1 = 1; dice_1 <=6; dice_1 ++) {
					for(int dice_2 = 1; dice_2 <=6; dice_2 ++) {
					
						sum = dice_1 + dice_2;
			
				if(sum == ra) {
					cnt ++;
					if(dice_2> dice_1) {
					String text_2 = String.format("{%d, %d}", dice_1,dice_2) ;
					text_1 = text_1.concat(text_2);
					}	
					}				
			}
		
	}
		System.out.println(text_1.concat(String.format("%d",cnt/2)));
			
		}
			
			
			}
		//문제5번//입력받은 정수에 따라 정사각형 출력
		
		System.out.println("----------6번 문제---------");
		System.out.println("숫자를 입력해 주세요 : ");
		Scanner scan = new Scanner(System.in);
		int square = scan.nextInt();
		for(int a = 1; a <= square; a++) { //a세로 길이
			for(int x = 1;x <=square; x++) { //x가로 길이
				if(a==1) {
					if(x!=square) {
						System.out.print("*");
					} else {System.out.println("*");}
				
				}	else if(a==square) {
						if(x!=square) {
							System.out.print("*");
						} else {System.out.println("*");}
				} else {//중간에 있는 부분 출력
					if(x==1) {
						System.out.print("*");
					} else if(x==square) {
						System.out.println("*");
					} else {System.out.print("-");
						
					}					
				}
								
			}
			}
		
		
		System.out.println("----------5번 문제---------");
		System.out.println("숫자를 입력해 주세요 : ");
		Scanner scan1 = new Scanner(System.in);
		int num = scan1.nextInt();
		for(int y = 0; y<=num-1;y++) {
			for(int x = 1; x<=num; x++) {
			
				if(x!=num) {
					System.out.print(String.format("%1$02d",(x-1)+10*y )  + "\t");
					}	else {
							System.out.println(String.format("%1$02d",(x-1)+10*y ));
//							x = x+(10*y);
								
				}
			}
		}
		scan.close();
		
	
	}
	}
	
	
	
	
	
	
	
	
		
