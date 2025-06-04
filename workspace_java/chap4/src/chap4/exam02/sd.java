package chap4.exam02;

public class sd {
	public static void main(String[] args) {

        int[] data = {3, 5, 8, 12, 17};
        System.out.println(calc("5"));
        
        System.out.println(func(data, 0, data.length - 1));

    }

    static int func(int[] a, int st, int end) {
//st= 0, end = 4
        if (st >= end) return 0;

        int mid = (st + end) / 2;
//mid = (0+4)/2 = 2

      
        return a[mid] + Math.max(func(a, st, mid), func(a, mid + 1, end));
        	//func({3, 5, 8, 12, 17}, 0, 2)
        		//st = 0. end = 2
        		//mid = 1 ---------------------------------------------------
        			//func({3, 5, 8, 12, 17},0,1)
        				//st = 0, end = 1
        				//mid = 0
        				//-> return 0
        			//func({3, 5, 8, 12, 17},2,2)
        				//return 0
        
        	//func({3, 5, 8, 12, 17}, 3, 4)
        		//st = 3, end = 4, mid = 3-----------------------------------------
        		//func({3, 5, 8, 12, 17},3.3)
        			//return 0
        		//func({3, 5, 8, 12, 17}, 4,4)
        			//return 0
    }
    
    static int calc(int value) {
        if (value <= 1) return value;
        return calc(value - 1) + calc(value - 2);
      }
    
    //calc(4) + calc(2) = calc(4) +1
    //calc(3) + calc(2) + calc(2)
    //calc(4) = calc(3) + calc(2) = 3
    //calc(3) = calc(2) + calc(1) = 2
    //calc(2) = calc(1) + calc+(0) =1
    //calc(0) = 0
    //calc(1) = 1
    //피보나치 수열
    //calc(2) + calc(2) + calc(1) + calc(0) + calc(1) + calc(0)    
    
      static int calc(String str) {
        int value = Integer.valueOf(str);
        if (value <= 1) return value;
        return calc(value - 1) + calc(value - 3);
      }
      //calc(4) + calc(2)
      //정답 = 4
     
     

}
