package Interface;

public class SmartCar {

   private Engine engine;// smart car has default engine
    private Media media;


    public SmartCar(){
       engine= new PowerEngine();  // as it is smart car thats why it has Power engine
        media=new CDPlayer(); // if we do not initialize the then we will be able to access method of media bcz CD player implemented it
    }

    public  SmartCar(Engine engine){
        this.engine=engine;
    }

    public void startEngine(){
        this.engine.start();
    }

    public void stoppedEngine(){
        this.engine.stop();
    }

    public void startAudio(){
        this.media.start();

    }
    public void stopAudio(){
        this.media.stop();

    }

    public void upgradeEngine(){
        engine= new ElectricEngine();
    }
}
