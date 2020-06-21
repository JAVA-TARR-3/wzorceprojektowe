package abstractfactory;

public class LedLight implements Light {
    @Override
    public void produce() {
        System.out.println("światła LED");
    }
}
