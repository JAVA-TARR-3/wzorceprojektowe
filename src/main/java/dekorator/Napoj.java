package dekorator;

public abstract class Napoj {

    protected String opis = "Nieznany napój";

    public String getOpis() {
        return opis;
    }

    public abstract float getKoszt();
}
