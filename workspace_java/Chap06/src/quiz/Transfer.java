package quiz;

public class Transfer {
	//하나로 매칭시켜 이중 배열로 연결하자
	//String배열의 인덱스 값을 반환해서 해당 인덱스 값을 이중 배열에 적용한후 반환하자
	String[][] dic;
	//String[] ko = {"사랑","증오","악마","천사"};
	Transfer(String[] en, String[] ko) {
		dic = new String[en.length][2];
		for(int x = 0; x< en.length; x++) {
			dic[x][1] = en[x];
			dic[x][0] = ko[x];			
		}
	}
	
	String translate(String word) {
		for(int i = 0; i<dic.length;i++) {
			if (dic[i][0].equals(word)) {
				//if(word !=null && world.equals(en[i])) nullpoint exception error
				System.out.println(dic[i][1]);
				return dic[i][1];
			} 
          }
		
		return "번역불가";
	}
	
//	boolean En2Ko(String en) {
//		
//		for(int x = 0; x< dic.length; x++) {			
//			System.out.println(ko[x]);
//			System.out.println(en.equals(ko[x]));
//			if(en.equals(ko[x]) == true) {
//				System.out.println(en + "+ =" + ko[x]);
//				return true;
//			} else {
//				return true;
//			}
//			
//		}
//		return false;
//	}
	

	

	}
	
	

