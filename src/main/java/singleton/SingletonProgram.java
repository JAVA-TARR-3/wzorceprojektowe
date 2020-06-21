package singleton;

public class SingletonProgram {

    public static void main(String[] args) {

        Singleton1 singleton = Singleton1.getInstance();
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        // ...

        Singleton7 singleton7 = Singleton7.INSTANCE;
        singleton7.cokolwiek();

        System.out.println(Singleton7.INSTANCE.zmienna);
    }
}
