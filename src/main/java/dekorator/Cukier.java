package dekorator;

public class Cukier extends SkladnikDekorator {

    private Napoj napoj;

    public Cukier(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public float getKoszt() {
        return napoj.getKoszt() + 0.99f;
    }

    @Override
    public String getOpis() {
        return napoj.getOpis() + ", Cukier";
    }
}
