package quiz;

public class Fruits_2 {
    String[] fruits_name = {"apple", "banana", "cherry"};
    int[] fruits_price = {1000, 1500, 2000};
    int[] fruits_stock = {10, 20, 30};

    String[][][] fru = new String[3][3][3];

    // 과일 정보 초기화 및 출력
    String[][][] Fruits_info() {
        for (int x = 0; x < fruits_name.length; x++) {
            fru[x][x][0] = fruits_name[x];
            fru[x][x][1] = String.valueOf(fruits_price[x]);
            fru[x][x][2] = String.valueOf(fruits_stock[x]);
            System.out.printf("%s는 %d원이고 %d개 있다\n", fruits_name[x], fruits_price[x], fruits_stock[x]);
        }
        return fru;
    }

    // 생성자에서 초기화 실행
    public Fruits_2() {
        Fruits_info();
    }

    // 매장 클래스 (필요시 확장 가능)
    public class Store {
        String[] store_name = {"천안", "아산"};
    }

    /**
     * 가격 문의 메서드
     * @param name 과일 이름
     * @param count 주문 개수
     * @return 총 가격 정보
     */
    public String ask(String name, int count) {
        for (int x = 0; x < fruits_name.length; x++) {
            if (fruits_name[x].equals(name)) {
                int total = fruits_price[x] * count;
                String result = String.format("%s %d개의 가격은 %d원입니다.", name, count, total);
                System.out.println(result);
                return result;
            }
        }
        return "해당 과일은 존재하지 않습니다.";
    }

    /**
     * 결제 메서드
     * @param name 과일 이름
     * @param count 주문 개수
     * @param money 낸 돈
     * @return 결제 결과 및 거스름돈
     */
    public String pay(String name, int count, int money) {
        for (int x = 0; x < fruits_name.length; x++) {
            if (fruits_name[x].equals(name)) {
                int total = fruits_price[x] * count;

                if (count > fruits_stock[x]) {
                    return "재고가 부족합니다.";
                }

                if (money >= total) {
                    int change = money - total;
                    fruits_stock[x] -= count;

                    String result = String.format(
                            "%s %d개를 사고 남은 거스름돈은 %d원입니다. (지불금액 %d)",
                            name, count, change, money);
                    System.out.println(result);
                    System.out.println("남은 재고: " + fruits_stock[x] + "개");
                    return result;
                } else {
                    return "돈이 부족합니다.";
                }
            }
        }
        return "해당 과일은 존재하지 않습니다.";
    }
    
    //70프로의 배송 성공률을 구현하자.
    //1. 숫자0 7게와 숫자 1 3개를 담은 리스트를 생성한후
    //0~9까지의 랜덤정수를 추출해서 for문으로구현, 0일경우 성공으로 가정한다.
	
    public String deliver() {
        int[] resultPool = {0,0,0,0,0,0,0,1,1,1}; // 0: 성공, 1: 실패
        int randomIndex = (int)(Math.random() * 10);
        
        if (resultPool[randomIndex] == 0) {
            System.out.println("배송 성공!");
            return "배송 성공!";
        } else {
            System.out.println("배송 실패...");
            return "배송 실패...";
        }
    }
    
    //입고
    //과일의 이름과 입고수량 추가
    public String income(String name, int amount) {
    	for (int x = 0; x < fruits_name.length; x++) {
            if (fruits_name[x].equals(name)) {
               fruits_stock[x] = fruits_stock[x] + amount;
               String result = name + "가" + amount + "개 입고되었습니다 .";
               System.out.println(name + "가" + amount + "개 입고되었습니다 .");
               System.out.println("남은 재고: " + fruits_stock[x] + "개");
               return result;
                } 
            
            }
    	return "해당 없음";
    	
    } 
    

    

   
}
