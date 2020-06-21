package singleton;

public class Singleton1 {

    // eager - żarliwy
    private static Singleton1 instance = new Singleton1();

    private Singleton1() {
        ///

    }

    public static Singleton1 getInstance() {
        return instance;
    }
}
