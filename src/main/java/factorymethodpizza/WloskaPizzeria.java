package factorymethodpizza;

public class WloskaPizzeria extends Pizzeria {


    @Override
    public Pizza utworzPizza(String type) {

        if (type.equals("serowa")) {
            return new WloskaPizzaSerowa();
        } else {
            throw new IllegalArgumentException("Unknown pizza type " + type);
        }
    }
}
