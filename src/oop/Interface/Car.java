package Interface;

public class Car implements Engine, Media {
    @Override
    public void start() {
        System.out.println("simple Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Engine stop");
    }

    @Override
    public void acc() {
        System.out.println("I am normal acc");
    }
}
