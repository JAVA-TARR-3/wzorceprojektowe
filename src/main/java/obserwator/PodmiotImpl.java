package obserwator;

import java.util.ArrayList;
import java.util.List;

public class PodmiotImpl implements Podmiot {

    List<Obserwator> obserwators = new ArrayList<>();

    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwators.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        obserwators.remove(obserwator);
    }

    public void powiadomObserwatorow() {
        for (Obserwator obserwator : obserwators) {
            obserwator.aktualizacja();
        }
    }
}
