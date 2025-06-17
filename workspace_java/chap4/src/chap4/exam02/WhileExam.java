package chap4.exam02;

import java.util.Scanner;

public class WhileExam {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu; // while 조건에서도 접근 가능하도록 do-while 밖에서 선언
        
        do {
            System.out.println("메뉴를 골라주세요");
            System.out.println("1 : 커피, 2: 우유, 0: 종료");

            menu = scan.nextInt();

            switch(menu) {
                case 1:
                    System.out.println("커피");
                    break;

                case 2:
                    System.out.println("우유");
                    break;

                case 0:
                    System.out.println("종료");
                    break; // 여기서도 break를 사용해야 올바름

                default:
                    System.out.println("다른 메뉴를 골라줘");
            }

        } while(menu != 0);

        scan.close(); // Scanner 닫아주는 것이 좋음
    }
}
