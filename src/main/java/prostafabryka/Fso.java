package prostafabryka;

public class Fso implements Car {
    @Override
    public void start() {
        System.out.println("Fso start");
    }

    @Override
    public void accelerate() {
        System.out.println("Fso accelerate");
    }

    @Override
    public void stop() {
        System.out.println("Fso stop");
    }
}
