package strategia;

public class KaczkaProgram {

    public static void main(String[] args) {

//        DzikaKaczka dzikaKaczka = new DzikaKaczka();
//        dzikaKaczka.plyn();
//        dzikaKaczka.kwacz();
//        dzikaKaczka.lec();
//
//        DzikaKaczka gumowaKaczka = new DzikaKaczka();

        Kaczka dzikaKaczka = new Kaczka(new LatamBoMamSkrzydla(), new Plywam(), new KwaczeBoMamDziob());
        dzikaKaczka.kwacz();
        dzikaKaczka.lec();
        dzikaKaczka.plyn();

        Kaczka gumowaKaczka = new Kaczka(new NieLatam(), new Plywam(), new Piszcze());
        gumowaKaczka.kwacz();
        gumowaKaczka.lec();
        gumowaKaczka.plyn();
    }
}
