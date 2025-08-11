package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullpath = "C:\\temp\\test.txt";
		
		//폴더 내의 파일 리스트 출력하는법 어떻게 하지????
		
		try {
			InputStream is = new FileInputStream(fullpath);
//			System.out.println(is); 자바언어로 나옴 :  java.io.FileInputStream@5ca881b5
			int data;
			while ((data = is.read()) != -1) { // 파일의 끝까지 읽기
                System.out.print((char) data); // 읽은 바이트를 문자로 변환하여 출력
            	}
			
			
			
			}	catch(FileNotFoundException e) {
					e.printStackTrace();
			}	catch (IOException e) {
					e.printStackTrace();
			}
	}

}
