package quiz;

import java.util.Scanner;

public class UpdownExam {
	int goal =(int)(Math.random() * 201) - 100;
	int ttry = 1;
	
	String Gamestart() {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("Game start! 숫자를 입력해 주세요");
			int input = scan.nextInt();
			if(input < goal){
				System.out.println(String.format("up -%d번쨰 시도",ttry));
					ttry +=ttry;
					continue;
				} else if(input < goal){
					System.out.println(String.format("down %d번쨰 시도",ttry));
					ttry +=ttry;
					continue;
				} else{
					System.out.println(String.format("정답입니다.%d번쨰 시도",ttry));
					System.out.println("게임이 종료되었습니다.");
					
					break;
				}
			
			}
		}

	
	
//	String Up(int input, int goal) {
//		if(input < goal){
//			System.out.println(String.format("up -%d번쨰 시도",ttry));
//				ttry +=ttry;
//		}
//		return "Up";
//	}
//	
//	String Down(int input, int goal) {
//		if(input > goal){
//			System.out.println(String.format("Down -%d번쨰 시도",ttry));
//			ttry +=ttry;
//		}
//		return "Down";
//	}
	
	
	
}