package src.sec05.exam02_static;

public class Singleton {
	private static Singleton Singleton = null;
	private Singleton() {
		
	}
	static Singleton getinstance() {
		if(Singleton == null) {
			Singleton = new Singleton();
			
		}
		return Singleton;
	}
}
