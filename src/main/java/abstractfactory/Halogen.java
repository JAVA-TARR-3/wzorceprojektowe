package abstractfactory;

public class Halogen implements Light {
    @Override
    public void produce() {
        System.out.println("światła halogenowe");
    }
}
