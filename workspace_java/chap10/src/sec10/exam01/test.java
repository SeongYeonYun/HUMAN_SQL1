package sec10.exam01;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String id = "sdadsad@nacer.com";
		
		String ssn = "123456-1234567";
		String a[] = ssn.split("-");
		System.out.println(a[1].charAt(0));
		
		if (a[1].charAt(0) % 2 !=0) {
			System.out.println("남자");
			}
			
		}

	}


