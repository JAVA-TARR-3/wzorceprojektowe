package factorymethod;

public class FactoryMethodProgram {

    public static void main(String[] args) {

        CarManufacture manufacture = new EuropeanCarManufacture();
        manufacture.manufactureCar("Audi");

        manufacture = new AmericanCarManufacture();
        manufacture.manufactureCar("Fso");
    }
}
