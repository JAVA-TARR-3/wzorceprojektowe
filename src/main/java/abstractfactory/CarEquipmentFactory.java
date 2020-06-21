package abstractfactory;

public interface CarEquipmentFactory {

    Engine createEngine();
    Light createLight();
    Tire createTire();
}
