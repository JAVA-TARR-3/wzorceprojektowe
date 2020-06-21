package abstractfactory;

public class CarEquipmentFactoryProgram {

    public static void main(String[] args) {
        createEquiopment(new EconomyCarEquipmentFactory());
        System.out.println();
        createEquiopment(new PremiumCarEquipmentFactory());
    }

    private static void createEquiopment(CarEquipmentFactory factory) {

        Engine engine = factory.createEngine();
        engine.produce();

        Light light = factory.createLight();
        light.produce();

        Tire tire = factory.createTire();
        tire.produce();
    }
}
