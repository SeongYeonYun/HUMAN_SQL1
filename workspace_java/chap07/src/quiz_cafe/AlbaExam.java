package quiz_cafe;

public class AlbaExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		backdabang back = new backdabang();
		Starbucks star = new Starbucks();
		Alba backalba = new Alba();
	
		System.out.println("-----------백다방 테스트----------");
        // 알바가 주문 받고 재고 처리만 담당
		backalba.open_alarm(back);
        backalba.processOrder(back, "americano", 2000);
      
        // 확인
        System.out.println("back 주문 목록: " + back.order_list);
        System.out.println("back 남은 비품: " + back.product_list);
//        System.out.println("back 남은 비품: " + back.product_list[1]);
		System.out.println("백다방 주소 :"+  back.address);
		backalba.close_alarm(back);
		System.out.println("-----------백다방끝 ----------");
		
		
		
		System.out.println("-----------스벅 테스트----------");
        // 알바가 주문 받고 재고 처리만 담당
		backalba.open_alarm(star);
        backalba.processOrder(star, "americano", 2000);
      
        // 확인
        System.out.println(star.menu_list);
        System.out.println("star 주문 목록: " + star.order_list);
        System.out.println("star 남은 비품: " + star.product_list);
	 ///////////////////////////////////////////
	///                                     ///
   ///	비품목록 백다방과 달라서 에러 발생       ///
  ///									   ///
 ////////////////////////////////////////////
        //        System.out.println("star 남은 비품: " + back.product_list[1]);
		System.out.println("스벅 주소 :"+  star.address);
		backalba.close_alarm(star);
		System.out.println("-----------스벅 끝 ----------");
		
		
	}

}
