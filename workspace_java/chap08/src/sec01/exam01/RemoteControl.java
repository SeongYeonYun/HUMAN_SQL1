package sec01.exam01;

//new못함
public interface RemoteControl {
	
	public static final int MAX_VOLUME = 10;
	//final로 상수를 선언할경우는 모두 대문자, 모든 필드는 static final이다, 그래서 생략 가능하다
	public int MIN_VOLUME = 0;
	
	
	public abstract void turnOn();
	//기본적으로 메서드는 추상 메소드라 기본적으로 생략 가능하다
	public void turnOff();
	
	public void setVolume(int vol);
	
	void powerOn();
	
	
}
