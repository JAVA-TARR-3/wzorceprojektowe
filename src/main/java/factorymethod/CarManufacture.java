package factorymethod;

import prostafabryka.SimpleFactory;

public abstract class CarManufacture {

    public void manufactureCar(String type) {

        Car car = create(type);

        car.start();
        car.accelerate();
        car.stop();
    }

    // metoda fabrykująca
    protected abstract Car create(String type);
}
