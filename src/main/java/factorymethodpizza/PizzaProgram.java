package factorymethodpizza;

public class PizzaProgram {

    public static void main(String[] args) {

        Pizzeria wloskaPizzeria = new WloskaPizzeria();
        Pizza wloskaPizzaSerowa = wloskaPizzeria.zamow("serowa");
        System.out.println("Zamówiono: " + wloskaPizzaSerowa.getNazwa());
        System.out.println();

        Pizzeria amerykanskaPizzeria = new AmerykanskaPizzeria();
        Pizza amerykanskaPizzaSerowa = amerykanskaPizzeria.zamow("serowa");
        System.out.println("Zamówiono: " + amerykanskaPizzaSerowa.getNazwa());
    }
}
