package factorymethod;

public class AmericanFso implements Car {
    @Override
    public void start() {
        System.out.println("American Fso start");
    }

    @Override
    public void accelerate() {
        System.out.println("American Fso accelerate");
    }

    @Override
    public void stop() {
        System.out.println("American Fso stop");
    }
}
