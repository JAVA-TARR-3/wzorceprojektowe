package obserwator;

public class Statystyka implements DanePogodoweObserwator {

    private DanePogodowePodmiot podmiot;

    private float maxTemp = 200;
    private float minTemp = -200;
    private float sumTemp = 0;

    private int iloscOdczytow;

    public Statystyka(DanePogodowePodmiot podmiot) {
        this.podmiot = podmiot;
        podmiot.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        iloscOdczytow++;

        sumTemp += temperatura;

        if (temperatura > maxTemp) {
            maxTemp = temperatura;
        }

        if (temperatura < minTemp) {
            minTemp = temperatura;
        }

        System.out.println("średnia/maksymalna/minimalna temperatura = " + (sumTemp / iloscOdczytow) + " / " + maxTemp + " / " + minTemp);

        if (iloscOdczytow >= 2) {
            podmiot.usunObserwatora(this);
        }
    }
}
