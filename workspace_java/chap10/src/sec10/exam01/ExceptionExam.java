package sec10.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("text");
		for(int i = 0; i<args.length ; i++) {
			System.out.println(i + ";" + args[i]);
			 //printStacktrace : 이거 꼭 해야함
			
		}
		
		
		try {
			FileInputStream fis = new FileInputStream("c:\\temp\\test.txt"); //file read하는법
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
		}
	
	

	}


