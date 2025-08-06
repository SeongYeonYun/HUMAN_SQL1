package sec01.exam01;

public class Tv implements RemoteControl {
	//인터페이스가 인터페이스를 상속 받을떄는 extends 를 쓴다
    private int vol;  // 외부에서 접근 못 하게 private으로 변경

    @Override
    public void turnOn() {
        System.out.println("화면 on");
    }

    @Override
    public void turnOff() {
        System.out.println("화면 off");
    }

    @Override
    public void setVolume(int vol) {
        if (vol > MAX_VOLUME) {
            this.vol = MAX_VOLUME;
        } else if (vol < MIN_VOLUME) {
            this.vol = MIN_VOLUME;
        } else {
            this.vol = vol;
        }
        System.out.println("현재 볼륨: " + this.vol);
    }
    


    //게터 추가
    public int getVolume() {
        return this.vol;
    }

    @Override
    public void powerOn() {
        System.out.println("TV 전원 켜짐");
    }
}
