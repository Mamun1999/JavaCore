package staticKeyword;

public class Car {

    private String engine;
    private String carName;
    static int numberOfCar=0; // it will take the memory for one time// thats why it is memory efficient

    static {
        System.out.println("I am running of one time");

    }




    public Car(String engine, String carName) {
        this.engine = engine;
        this.carName = carName;
        Car.numberOfCar++;// we cant use this bcz static is independent from object/instance. here 'this' defines we are mentioning reference variable of object of that class. but static is independent it cant depends on object thats why it is showing alert.

    }
    public String toString(){
        return (engine+"/"+carName+"/"+numberOfCar);

    }
    static {
        System.out.println("im am the 2nd static block");
    }

}
