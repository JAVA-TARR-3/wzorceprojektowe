package strategia;

public class Kaczka {

    private Latanie latanie;
    private Plywanie plywanie;
    private Kwakanie kwakanie;

    public Kaczka(Latanie latanie, Plywanie plywanie, Kwakanie kwakanie) {
        this.latanie = latanie;
        this.plywanie = plywanie;
        this.kwakanie = kwakanie;
    }

    public void plyn() {
        plywanie.plyn();
    }

    public void lec() {
        latanie.lec();
    }

    public void kwacz() {
        kwakanie.kwacz();
    }
}
