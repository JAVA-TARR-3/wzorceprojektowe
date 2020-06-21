package factorymethodpizza;

public class AmerykanskaPizzaSerowa extends Pizza {

    public AmerykanskaPizzaSerowa() {
        nazwa = "Amerykańska pizza serowa";
        ciasto = "grube";
        sos = "pomidorowy";
        dodatki.add("ser mozzarrella");
    }

    @Override
    public void krojenie() {
        System.out.println("krojenie na kwadratowe kawałki");
    }
}
