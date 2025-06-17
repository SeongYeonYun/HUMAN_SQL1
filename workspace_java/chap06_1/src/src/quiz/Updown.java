package src.quiz;
import java.util.Scanner;
public class Updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int goal = (int)(Math.random() * 201) - 100;
		int ttry = 1;
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

}
