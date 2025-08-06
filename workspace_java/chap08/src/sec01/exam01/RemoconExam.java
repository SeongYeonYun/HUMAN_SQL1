package sec01.exam01;

public class RemoconExam {

    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.setVolume(100);
        System.out.println(tv.getVolume());
        RemoteControl rc1 = (RemoteControl)tv;
        RemoteControl rc2 = tv;
        
        rc1.powerOn();
        tv.powerOn();
        rc2.powerOn();
        
        
    }

}
