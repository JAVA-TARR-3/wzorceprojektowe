package factorymethod;

public class AmericanCarManufacture extends CarManufacture {

    @Override
    protected Car create(String type) {
        if (type.equals("Audi")) {
            return new AmericanAudi();
        } else if (type.equals("Volvo")) {
            return new AmericanVolvo();
        } else if (type.equals("Fso")) {
            return new AmericanFso();
        } else {
            throw new IllegalArgumentException("Unknow car " + type);
        }
    }
}
