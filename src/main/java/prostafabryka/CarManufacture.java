package prostafabryka;

public class CarManufacture {

//    private SimpleFactory factory;
//
//    public CarManufacture(SimpleFactory factory) {
//        this.factory = factory;
//    }

    public void manufactureCar(String type) {

        Car car = SimpleFactory.create(type);

        car.start();
        car.accelerate();
        car.stop();

    }
}
