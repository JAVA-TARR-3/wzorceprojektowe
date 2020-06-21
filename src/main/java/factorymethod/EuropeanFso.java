package factorymethod;

public class EuropeanFso implements Car {
    @Override
    public void start() {
        System.out.println("European Fso start");
    }

    @Override
    public void accelerate() {
        System.out.println("European Fso accelerate");
    }

    @Override
    public void stop() {
        System.out.println("European Fso stop");
    }
}
