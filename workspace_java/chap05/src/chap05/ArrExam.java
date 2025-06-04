package chap05;

import java.util.Arrays;

public class ArrExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1 = new int[6];
		int a2 [][] = new int[5][10];
		int a3 [][] = new int[5][10];
		
		String [] s1;
		
		//배열 변수는 참조타입이라서  null값을 가질수 있디.
		int score_0  = 90;
		int score_1  = 80;
		int score_02 = 75;
		for (int x = 0;x<=5;x++) {
			a1[x] = 90-x;
		
		}
		
		a2[0][0] = 10;
		a2[0][1] = 5;
		System.out.println(Arrays.toString(a1)); //1차원 배열 출력 , Arrays import
		
		System.out.println(Arrays.deepToString(a2)); //2차원 배열 출력
		System.out.println(a2[0][1] == a2[0][0]); 
		
		int[] score = new int[3];
		score[0] = 90;
		score[1] = 85;
		score[2] = 70;
		System.out.println("score : " + score[1]);
		System.out.println("a1 : " + a1[1]);
		//System.out.println("a1 : " + a1[1]);
		
		int[] i1 = new int[] {90,80,75};
		int [] i2 = null;
		i2 = new int[] {90,80,75};
		//선언과 동시에 초기화 하는경우 new생략 가능
		int[] i3 = {90,80,75};
		
		System.out.println("score_length = "+a2.length);
		
		//2차원 배열의 경우 먼저 2차원 안 1차원에 속하는 배열들이 먼저 heap메모리에 할당되고, 
		//할당된 배열을 찹조하는 다른 배열이 순차적인 메모리 값을 가진다고 하는데 글험 누가 어떤값을 가지는가??
		
		int [] aaa = new int[10]; 
		for(int i = 1 ; i<= 10; i++) {
			aaa[i-1] = i;
			System.out.println(aaa[i-1]);
			}
		
		System.out.println(Arrays.toString(aaa));
		
		
		
	}

}


