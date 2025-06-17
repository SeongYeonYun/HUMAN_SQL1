package src.quiz;

public class Fruits {
	String[] fruits_name ={"apple", "banana", "cherry"};
	int [] fruits_price ={1000, 1500, 2000};
	int [] fruits_stock = {10, 20, 30};
	
	//과일 데이터 메소드. 값 입력 포함
	String [][][] fru = new String[3][3][3];
	String [][][] Fruits_info(){
//		fruits_name = new String[]{"apple", "banana", "cherry"};
//	    fruits_price = new int[]{1000, 1500, 2000};
//	    fruits_stock = new int[]{10, 20, 30};
	    for(int x = 0; x<fru.length;x++) {
	    	fru[x][x][0] = fruits_name[x];
	    	fru[x][x][1] = ""+fruits_price[x];
	    	fru[x][x][2] = ""+fruits_stock[x];
	    	System.out.println(fruits_name[x]+
	    			"는 "+fruits_price[x]+"원이고 "+
	    			fruits_stock[x]+"개있다" );
	    }
	    return fru;
	}
	
	Fruits(){
		 Fruits_info();
	 }

	
	public class Store{
		String[] store_name = new String[] {"천안","아산"};
		
	}
	 String ask(String name,int a) {
	        //Fruits_info(); // 데이터 초기화
	        
	        for (int x = 0; x < fruits_name.length; x++) {
	            if (fruits_name[x].equals(name)) {
	            	System.out.println(name + +a+"개의 가격은 " + (int)(fruits_price[x]*a) + "원입니다.");
	                return name + +a +"개의 가격은 " + ((int)(fruits_price[x])*a) + "원입니다.";
	            }
	        }
	        return "해당 과일은 존재하지 않습니다.";
	    }
	 
	 /**
	  * 
	  * @String name ; 과일 이름
	  * @int a ; 주문하는 개수
	  * @int b ; 낸 금액
	  * @return
	  */
	 
	 String pay(String name,int a,int b) {
		 //Fruits_info(); // 데이터 초기화
		 //돈이 부족할경우, 주문하는 개수보다 제곡가 적을경우
		 for (int x = 0; x < fruits_name.length; x++) {
			 if (fruits_name[x].equals(name)) {
				 if((b-((int)(fruits_price[x])*a))>0) {
					 System.out.printf(name + +a+"개를 사고 남은 거스름돈은 " +
						 	(b-((int)(fruits_price[x]*a))) + 
						 		"원입니다.(지불한 금액 %d)\n",b);					 
					 fruits_stock[x] = ((int)fruits_stock[x] - a);
					 System.out.println(fruits_stock[0]);
					 return name + +a +"개를 사고 남은 잔돈은 " +
					 		(int)(b-((int)(fruits_price[x])*a)) +
					 		"원입니다.(지불금액" + b +")";
			 }	else {
				 return "돈이 부족합니다.";
			 }
				 }
		 }
		 return "해당 과일은 존재하지 않습니다.";
	 }
	 
	 void getfruits() {
			 Fruits_info();
		 }
	 }
	 
	
	
	
	//가게 안에 있는 물건들은 모두 같은 가게 이름으로 출력되어야 한다
	//pandas pd, dataframe 마렵다.......
	
	
				
			
			
		
	
	
	

	


