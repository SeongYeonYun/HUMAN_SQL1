package sec01.exam01;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); 
		//ctrl shift o, 스케너를 열면 항상 scan.close해줘야 한다.
	
		
		
		
		while(true) {	
			
			System.out.println("하고싶은 연산을 선택하세요");
			System.out.println("덧셈 : 0, 뺼셈 : 1, 나눗셈 : 2, 곱셈 : 3");
			
			int calc_type = scan.nextInt();
			double result = 0;
			
			switch (calc_type) {
			
				case 0:
					
					System.out.println("계산할값 값을 입력하세요");
					double input_0 = scan.nextDouble();
					
					System.out.println("계산할값 값을 입력하세요");
					double input_1 = scan.nextDouble();
					
					result = input_0 + input_1;
					//만약 (input % 1.0) > 0이면 double값을 출력하고,  (input % 1.0) = 0 이라면 int값을 출력
				
					System.out.printf("%.3f + %.3f = %.3f\n", input_0, input_1, result);
					
					break;
			
					
				case 1:
					
					System.out.println("빼어질 값을 입력하세요");
					double input_2 = scan.nextDouble();
					
					System.out.println("뺄값을 입력하세요");
					double input_3 = scan.nextDouble();
					
					result = input_2 - input_3;
					
					System.out.printf("%.3f - %.3f = %.3f\n", input_2, input_3, result);
				
					System.out.println("계산 종료");
					break;
				
					
				case 2:
					
					while (true) {
						System.out.println("나누어질 값을 입력하세요");
						double input_4 = scan.nextDouble();
						
						System.out.println("나눌 값을 입력하세요");
						double input_5 = scan.nextDouble();
						
						if (input_5 != 0) {
												
							System.out.printf("%.3f / %.3f = %.3f\n", input_4, input_5, result);
							
//							System.out.println(
//									String.format("%f / %f = ",
//											(double)input_4,
//											(double)input_5) + 								
//									Math.round((input_4/input_5)*1000)/1000.0
//											);
							
							System.out.println("계산 종료");			
							break;
						}
						
						
						
						else 
							
							System.out.println("division error or infitiny error");	//0으로는 나눌수 없다.										
						
							continue;	//while문을 처음부터 다시 시작
										//연산 선택을 다시 하지 않도록 case2의 시작부로 돌아갈순 없나???
										//case2안에 반복문을 더 넣어야 하나??
										//재귀 함수
							
					}
					
					break;
				
						
				case 3:
					
					System.out.println("계산할값 값을 입력하세요");
					double input_6 = scan.nextDouble();
					
					System.out.println("계산할값 값을 입력하세요");
					double input_7 = scan.nextDouble();
					
					result = input_6 * input_7;
					
					System.out.printf("%.3f * %.3f = %.3f\n", input_6, input_7, result);
					
					System.out.println("계산 종료");
					
					break;
				
				default: 
					
					System.out.println("잘못된 값을 입력했습니다. 다시 입력해 주세요");
					continue;

				}
		scan.close(); 		
		break;
		}
	}
}