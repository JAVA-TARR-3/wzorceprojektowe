package factorymethodpizza;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String nazwa;
    protected String ciasto;
    protected String sos;
    protected List<String> dodatki = new ArrayList<>();

    public void przygotowanie() {
        System.out.println("Przygotowanie: " + nazwa);
        System.out.println("Wyrabianie ciasta");
        // ...
    }

    public void pieczenie() {
        System.out.println("Pieczenie");
    }

    public void krojenie() {
        System.out.println("Krojenie pizzy na 8 kawałków");
    }

    public void pakowanie() {
        System.out.println("Pakowanie ...");
    }

    public String getNazwa() {
        return nazwa;
    }
}
