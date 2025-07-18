package quiz_cafe;

import java.util.HashMap;
import java.util.Map;

public class Cafe {

    //  클래스 필드 
    public int employee;
    public String address;
    public String store_name;

    
    Map<String, Integer> product_list = new HashMap<>();
    Map<String, Integer> menu_list = new HashMap<>();
    Map<String, Integer> order_list = new HashMap<>();

    //  비품 추가 
    public void add_pro_init(String product_name, int cnt) {
        product_list.put(product_name, cnt);
        System.out.println("비품 목록: " + product_list);
    }

    //  메뉴 추가 
    public void add_menu_init(String menu_name, int price) {
        menu_list.put(menu_name, price);
        System.out.println("메뉴판: " + menu_list);
    }

    //  주문 처리 
    public void order_set(String order, Integer order_cnt) {
        order_list.put(order, order_cnt);
        System.out.println("주문 목록: " + order_list);
    }
    
    
    // 가게 오픈 알람
    //청소 메소드를 만든다음 청소 메소드 실행후 실행
    public void open_alarm() {
    	clear();
    	System.out.println("띵동~~! 가게를 오픈했습니다.");
    }
    
    public void clear() {
    	System.out.println("청소를 시작합니다.");
//    	Thread.sleep(3000);
    	try {
    	    Thread.sleep(3000);  // 3초 잠자기
    	} catch (InterruptedException e) {
    	    System.out.println("누가 나 깨웠어!?");
    	}

    	
    	System.out.println("청소가 끝났습니다.");
    	
    }
    
    
    //가게 닫는 알람 -> 
    //주문 목록을 통해 금액을 합산한후 정산 메소드 실행한다음 실행
    public void close_alarm() {
    	System.out.println("가게를 닫습니다.");
    }

    //  메인 테스트 
//    public static void main(String[] args) {
//        Cafe cafe = new Cafe();
//
//        // 기본 정보 입력
//        cafe.store_name = "퀴즈카페";
//        cafe.address = "서울시 강남구";
//        cafe.employee = 5;
//
//        // 메뉴, 비품 추가
//        cafe.add_menu_init("아메리카노", 4000);
//        cafe.add_pro_init("컵", 100);
//        cafe.order_set("아메리카노", 2);
//
//        // 최종 출력
//        System.out.println("가게 이름: " + cafe.store_name);
//        System.out.println("주소: " + cafe.address);
//        System.out.println("직원 수: " + cafe.employee);   
   // 
//}
    }
