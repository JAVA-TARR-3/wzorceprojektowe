package factorymethod;

public class AmericanAudi implements Car {
    @Override
    public void start() {
        System.out.println("American Audi Start");
    }

    @Override
    public void accelerate() {
        System.out.println("American Audi accelerate");
    }

    @Override
    public void stop() {
        System.out.println("American Audi stop");
    }
}
