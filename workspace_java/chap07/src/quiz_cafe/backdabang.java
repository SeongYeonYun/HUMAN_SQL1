package quiz_cafe;

public class backdabang extends Cafe {
    
    public backdabang() {
        store_name = "백다방 천안 터미널점";
        address = "천안시 신부동";
        employee = 15;

        // 메뉴 구성
        add_menu_init("americano", 2000);
        add_menu_init("latte", 2500);

        // 비품 구성
        add_pro_init("플라스틱컵", 100);
        add_pro_init("빨대", 200);
    }

    // 가게의 초기 정보만 구성 (실제 주문은 알바가 담당)
}
