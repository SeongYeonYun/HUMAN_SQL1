public class FruitsExam {
    public static void main(String[] args) {
        FruitStore store = new FruitStore();

        Fruits_2 fruits1 = new Fruits_2(store);
        fruits1.ask("banana", 3);
        fruits1.pay("banana", 3, 10000);
        fruits1.deliver();
        fruits1.pay("apple", 2, 10000);
        fruits1.deliver();
        fruits1.income("apple", 5);
        fruits1.addFruits("peach", 1100, 1000);

        System.out.println("\n--- 새 객체 생성 후 과일 목록 확인 ---");
        Fruits_2 fruits2 = new Fruits_2(store); // peach도 보임
    }
}