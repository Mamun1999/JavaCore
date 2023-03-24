package Interface;

public class Main {
    public static void main(String[] args) {

        SmartCar sm=new SmartCar();
        sm.startEngine();
        sm.startAudio();
        sm.stopAudio();
        sm.upgradeEngine();
        sm.startEngine();

    }
}
