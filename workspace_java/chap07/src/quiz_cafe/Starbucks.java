package quiz_cafe;


public class Starbucks extends Cafe {
//	주소, 직원수, 가게이름은 각각 가게 마다 달라야 한다
//	커피를 만드는 방법도 달라야 한다
//	메뉴판도 달라야 한다.
///////////////////////////////////////////////////
//	아래 두가지는 공통되야 한다.
//	비품 재고를 관리하는 메서드, 
//	결제와 주문을 받는 메서드
	
	
//	Map<String, Integer> product_list = new HashMap<>();
//    Map<String, Integer> menu_list = new HashMap<>();
//    Map<String, Integer> order_list = new HashMap<>();
	
    public Starbucks() {
    	store_name = "스타벅스 원성DT";
    	address = "천안시 원성동";
    	employee = 10;
    	
    	
    	add_pro_init("glass", 10);
		add_pro_init("straw", 20);
		add_pro_init("flastic cup", 5);
		
		
		add_menu_init("americano", 1000);
		add_menu_init("cafuchino", 1000);
		add_menu_init("milktea", 3000);
    }
    
 
//    
//    
//	
//	public void pro_init() {
//		star.add_pro_init("glass", 10);
//		star.add_pro_init("straw", 20);
//		star.add_pro_init("flastic cup", 5);
//	}
//	
//	public void menu_list() {
//		star.add_menu_init("americano", 1000);
//		star.add_menu_init("cafuchino", 1000);
//		star.add_menu_init("milktea", 3000);
//		
//	}
//	
	
//    Cafe star;
//
//    public Starbucks() {
//        star = new Cafe();
//        star.add_pro_init("glass cup", 10);
//    }
}
