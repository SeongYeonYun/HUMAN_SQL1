package quiz_cafe;

public class Alba {

    // 주문과 재고 처리만 담당
    public void processOrder(Cafe cafe, String menuName, int count) {
        //만약 주문된 음식의 메뉴가 없을경우????
    	//아니야 이건 하지 말자
    	
    
    	// 주문 넣기
        cafe.order_set(menuName, count);

        // 재고 차감 (컵, 빨대 등)
        reduceProduct(cafe, "플라스틱컵", count);
        reduceProduct(cafe, "빨대", count);
    }
    
    //주문시 제고 로그
    private void reduceProduct(Cafe cafe, String productName, int used) {
        Integer current = cafe.product_list.get(productName);
        if (current == null) {
            System.out.println("비품 없음: " + productName);
        } else if (current < used) {
            System.out.println("재고 부족: " + productName);
        } else {
            cafe.product_list.put(productName, current - used);
            System.out.println(productName + " 재고 차감 → 남은 수량: " + (current - used));
        }
    }
    
    public void open_alarm(Cafe cafe) {
    	cafe.open_alarm();
    }
    
    public void close_alarm(Cafe cafe) {
    	cafe.close_alarm();
    }
    
    
    
}
