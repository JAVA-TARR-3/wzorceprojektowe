package factorymethodpizza;

public abstract class Pizzeria {

    public Pizza zamow(String type) {
        Pizza pizza = utworzPizza(type);

        pizza.przygotowanie();
        pizza.pieczenie();
        pizza.krojenie();
        pizza.pakowanie();

        return pizza;
    }

    // metoda fabrykująca
    public abstract Pizza utworzPizza(String type);
}
