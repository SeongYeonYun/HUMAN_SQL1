package sec06Exam06;

public class Car {
	private int speed;
	private boolean stop;
	
	//setter
	//보조 필름값을 ㅅ수정하는 기능
	void setSpeed(int speed) {
		this.speed = speed;
	}
	

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public int getSpeed() {
		return speed;
	}
}
