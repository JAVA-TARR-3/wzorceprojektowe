package factorymethodpizza;

public class AmerykanskaPizzeria extends Pizzeria {
    @Override
    public Pizza utworzPizza(String type) {

        if (type.equals("serowa")) {
            return new AmerykanskaPizzaSerowa();
        } else {
            throw new IllegalArgumentException("Unknown pizza type " + type);
        }
    }
}
