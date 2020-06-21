package obserwator;

import java.util.ArrayList;
import java.util.List;

public class DanePogodowe implements DanePogodowePodmiot {

    private List<DanePogodoweObserwator> obserwators = new ArrayList<>();

    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    @Override
    public void zarejestrujObserwatora(DanePogodoweObserwator obserwator) {
        obserwators.add(obserwator);
    }

    @Override
    public void usunObserwatora(DanePogodoweObserwator obserwator) {

        int index = obserwators.indexOf(obserwator);
        if (index >= 0) {
            obserwators.remove(index);
        }
    }

    @Override
    public void powiadomObserwatorow() {
        for (DanePogodoweObserwator obserwator : obserwators) {
            obserwator.aktualizacja(temperatura, wilgotnosc, cisnienie);
        }
    }

    public void ustawStan(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;

        powiadomObserwatorow();
    }
}
