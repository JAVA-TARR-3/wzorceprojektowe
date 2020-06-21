package abstractfactory;

public class PremiumTire implements Tire {
    @Override
    public void produce() {
        System.out.println("opony premium");
    }
}
