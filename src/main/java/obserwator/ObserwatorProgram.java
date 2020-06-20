package obserwator;

public class ObserwatorProgram {

    public static void main(String[] args) {

        Podmiot podmiot = new PodmiotImpl();

        Obserwator obs1 = new ObserwatorImpl();
        Obserwator obs2 = new ObserwatorImpl();
        Obserwator obs3 = new ObserwatorImpl();

        podmiot.zarejestrujObserwatora(obs1);
        podmiot.zarejestrujObserwatora(obs2);
        podmiot.zarejestrujObserwatora(obs3);

        System.out.println();
        podmiot.powiadomObserwatorow();

        podmiot.usunObserwatora(obs2);

        System.out.println();
        podmiot.powiadomObserwatorow();
    }
}
