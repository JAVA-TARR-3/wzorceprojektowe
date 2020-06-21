package abstractfactory;

public class HybridEngine implements Engine {
    @Override
    public void produce() {
        System.out.println("silnik dybrydowy");
    }
}
