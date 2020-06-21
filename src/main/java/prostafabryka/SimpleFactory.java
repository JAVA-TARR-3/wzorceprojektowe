package prostafabryka;

public class SimpleFactory {

    public static Car create(String type) {
        if (type.equals("Audi")) {
            return new Audi();
        } else if (type.equals("Volvo")) {
            return new Volvo();
        } else if (type.equals("Fso")) {
            return new Fso();
        } else {
            throw new IllegalArgumentException("Unknow car " + type);
        }
    }
}
