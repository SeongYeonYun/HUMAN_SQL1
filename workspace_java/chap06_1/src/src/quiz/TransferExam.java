package src.quiz;

public class TransferExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] en = {"love","hate","devil","angel"};
		String[] ko = {"사랑","증오","악마","천사"};
		Transfer trans = new Transfer(en,ko);
		trans.translate("악마");
		
//		trans.En2Ko("love");
		
	}

}
