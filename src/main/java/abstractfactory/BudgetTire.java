package abstractfactory;

public class BudgetTire implements Tire {
    @Override
    public void produce() {
        System.out.println("opony budżetowe");
    }
}
