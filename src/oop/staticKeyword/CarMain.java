package staticKeyword;

public class CarMain {

    public static void main(String[] args) {
//        System.out.println(Car.numberOfCar);// without creating an object we can directly use static keyword.
        Car audi=new Car("audiEngine","audi");
        System.out.println(audi);

        Car marcedes=new Car("benzEngine","marchedes");
        System.out.println(audi);



    }
}
