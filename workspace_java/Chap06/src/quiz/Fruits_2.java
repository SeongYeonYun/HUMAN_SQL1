package quiz;
//무조건 ARRaylist 가 편할듯
class FruitStore {
    public String[] fruits_name = {"apple", "banana", "cherry"};
    public int[] fruits_price = {1000, 1500, 2000};
    public int[] fruits_stock = {10, 20, 30};
}

class Fruits_2 {
    FruitStore store;

    public Fruits_2(FruitStore store) {
        this.store = store;
        Fruits_info();
    }

    void addFruits(String fruit, int price, int stock) {
        int len = store.fruits_name.length;

        String[] frn = new String[len + 1];
        int[] fp = new int[len + 1];
        int[] fs = new int[len + 1];

        for (int i = 0; i < len; i++) {
            frn[i] = store.fruits_name[i];
            fp[i] = store.fruits_price[i];
            fs[i] = store.fruits_stock[i];
        }

        frn[len] = fruit;
        fp[len] = price;
        fs[len] = stock;

        store.fruits_name = frn;
        store.fruits_price = fp;
        store.fruits_stock = fs;

        System.out.printf("%d짜리 %s 가 %d개 생김\n", price, fruit, stock);
    }

    String[][][] fru = new String[10][10][10];

    String[][][] Fruits_info() {
        for (int x = 0; x < store.fruits_name.length; x++) {
            fru[x][x][0] = store.fruits_name[x];
            fru[x][x][1] = String.valueOf(store.fruits_price[x]);
            fru[x][x][2] = String.valueOf(store.fruits_stock[x]);
            System.out.printf("%s는 %d원이고 %d개 있다\n", store.fruits_name[x], store.fruits_price[x], store.fruits_stock[x]);
        }
        return fru;
    }

    public String ask(String name, int count) {
        for (int x = 0; x < store.fruits_name.length; x++) {
            if (store.fruits_name[x].equals(name)) {
                int total = store.fruits_price[x] * count;
                String result = String.format("%s %d개의 가격은 %d원입니다.", name, count, total);
                System.out.println(result);
                return result;
            }
        }
        return "해당 과일은 존재하지 않습니다.";
    }

    public String pay(String name, int count, int money) {
        for (int x = 0; x < store.fruits_name.length; x++) {
            if (store.fruits_name[x].equals(name)) {
                int total = store.fruits_price[x] * count;

                if (count > store.fruits_stock[x]) {
                    return "재고가 부족합니다.";
                }

                if (money >= total) {
                    int change = money - total;
                    store.fruits_stock[x] -= count;

                    String result = String.format(
                            "%s %d개를 사고 남은 거스름돈은 %d원입니다. (지불금액 %d)",
                            name, count, change, money);
                    System.out.println(result);
                    System.out.println("남은 재고: " + store.fruits_stock[x] + "개");
                    return result;
                } else {
                    return "돈이 부족합니다.";
                }
            }
        }
        return "해당 과일은 존재하지 않습니다.";
    }

    public String deliver() {
        int[] resultPool = {0,0,0,0,0,0,0,1,1,1};
        int randomIndex = (int)(Math.random() * 10);

        if (resultPool[randomIndex] == 0) {
            System.out.println("배송 성공!");
            return "배송 성공!";
        } else {
            System.out.println("배송 실패...");
            return "배송 실패...";
        }
    }

    public String income(String name, int amount) {
        for (int x = 0; x < store.fruits_name.length; x++) {
            if (store.fruits_name[x].equals(name)) {
                store.fruits_stock[x] += amount;
                String result = name + "가 " + amount + "개 입고되었습니다.";
                System.out.println(result);
                System.out.println("남은 재고: " + store.fruits_stock[x] + "개");
                return result;
            }
        }
        return "해당 없음";
    }
}


