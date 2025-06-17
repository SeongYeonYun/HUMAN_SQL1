package chap4.exam02;

import java.util.Scanner;

public class WhileExam {

    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan = new Scanner(System.in); 
        int menu1; // while 조건에서도 접근 가능하도록 do-while 밖에서 선언
        int price=0;
        do {
            System.out.println("메뉴를 골라주세요");
            System.out.println("1 : 아메리카노(1000원), 2: 우유(2000원),3: 라떄(3000원),"
            		+ "4: 카푸치노(4000원),5:에스프레소(5000원) 0: 종료");

            menu1 = scan.nextInt();
            
            switch(menu1) {
                case 1:
                    System.out.println("아메리카노를 선택하셨습니다.");
                    price  = price + 1000;
                    System.out.println("추가 옵션을 선택해 주세요(0: 아이스:500원 추가, 1: 핫(기본)");
                    int detail = scan1.nextInt();
                    if(detail == 0) {
                    	System.out.println("아이스 추가, 500원 추가입니다.");
                    	price = price +500;
                    } else {
                    	System.out.println("핫,추가요금 업습니다.");
                    }
                    
                    
                    break;

                case 2:
                    System.out.println("우유를 선택 하셨습니다.");
                    price  = price + 2000;
                    System.out.println("추가 옵션을 선택해 주세요(0:시원하게, 1: 핫(기본)");
                    int detail1 = scan1.nextInt();
                    if(detail1 == 0) {
                    	System.out.println("시원하게, 추가요금 없습니다. ");
                    	price = price ;
                    } else {
                    	System.out.println("핫,추가요금 업습니다.");
                    }
                    break;
                case 3:
                	System.out.println("라때를 선택 하셨습니다.");
                	price  = price + 3000;
                	System.out.println("추가 옵션을 선택해 주세요(0:시원하게, 1: 핫(기본)");
                	int detail2 = scan1.nextInt();
                	if(detail2 == 0) {
                		System.out.println("시원하게, 추가요금 없습니다. ");
                		price = price ;
                	} else {
                		System.out.println("핫,추가요금 업습니다.");
                	}
                	break;
                case 4:
                	System.out.println("카푸치노를 선택 하셨습니다.");
                	price  = price + 4000;
                	System.out.println("추가 옵션을 선택해 주세요(0:아이스, 1: 핫(기본)");
                	int detail3 = scan1.nextInt();
                	if(detail3 == 0) {
                		System.out.println("아이스, 500원추가. ");
                		price = price ;
                	} else {
                		System.out.println("핫,추가요금 업습니다.");
                	}
                	break;
                case 5:
                	System.out.println("에스프레소를 선택 하셨습니다.");
                	price  = price + 5000;
                	System.out.println("추가 옵션을 선택해 주세요(0:아이스, 1: 핫(기본)");
                	int detail4 = scan1.nextInt();
                	if(detail4 == 0) {
                		System.out.println("아이스, 500원추가. ");
                		price = price ;
                	} else {
                		System.out.println("핫,추가요금 업습니다.");
                	}
                	break;

                case 0:
                    System.out.println("종료");
                    System.out.printf("%d원 입니다.",price);
                    break; // 여기서도 break를 사용해야 올바름

                default:
                    System.out.println("다른 메뉴를 골라줘");
            }

        } while(menu1 != 0);

        scan.close(); // Scanner 닫아주는 것이 좋음
    }
}
