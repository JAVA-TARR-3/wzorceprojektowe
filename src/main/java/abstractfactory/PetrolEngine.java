package abstractfactory;

public class PetrolEngine implements Engine {
    @Override
    public void produce() {
        System.out.println("silnik benzynowy");
    }
}
