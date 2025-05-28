package sec01.exam01;

import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); //ctrl shift o
	
		
		System.out.println("하고싶은 연산을 선택하세요");
		System.out.println("덧셈 : 0, 뺼셈 : 1, 나눗셈 : 2, 곱셈 : 3");
		
		int calc_type = scan.nextInt();
		int result = 0;
			
		switch (calc_type) {
		
			case 0:
				
				System.out.println("계산할값 값을 입력하세요");
				int input_0 = scan.nextInt();
				
				System.out.println("계산할값 값을 입력하세요");
				int input_1 = scan.nextInt();
				
				result = input_0 + input_1;
				System.out.println(String.format("%d + %d =",input_0,input_1) + result);
				
				break;
		
				
			case 1:
				
				System.out.println("빼어질 값을 입력하세요");
				int input_2 = scan.nextInt();
				
				System.out.println("뺄값 값을 입력하세요");
				int input_3 = scan.nextInt();
				
				result = input_2 - input_3;
				
				System.out.println(
						String.format("%d - %d =",input_2,input_3)
						+ result);
				
				break;
			
				
			case 2:
				
				System.out.println("나누어질 값을 입력하세요");
				double input_4 = scan.nextInt();
				
				System.out.println("나눌 값을 입력하세요");
				double input_5 = scan.nextInt();
				
				if (input_5 != 0) {
					
					double re;
					
					re = ((int)((input_4/input_5)*1000)/1000.0);
					
					System.out.println(
							String.format("%f / %f =",(int)input_4,(int)input_5) 
							+ re);
				
					break;				
				
				}
				
				
				else 
					
					System.out.println("division error or infitiny error");					
					break;
			
					
			case 3:
				
				System.out.println("계산할값 값을 입력하세요");
				int input_6 = scan.nextInt();
				
				System.out.println("계산할값 값을 입력하세요");
				int input_7 = scan.nextInt();
				
				result = input_6 * input_7;
				
				System.out.println(
						String.format("%d * %d =",input_6,input_7) 
						+ result);
			
			default: 
				
				System.out.println("잘못된 값을 입력했습니다. 다시 입력해 주세요");
				
				break;

				}
		}
	}
			
			 
			
			
		
		
	


