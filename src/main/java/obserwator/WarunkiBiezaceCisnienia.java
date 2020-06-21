package obserwator;

public class WarunkiBiezaceCisnienia implements DanePogodoweObserwator {

    private DanePogodowePodmiot podmiot;
    private float cisnienie;

    public WarunkiBiezaceCisnienia(DanePogodowePodmiot podmiot) {
        this.podmiot = podmiot;
        podmiot.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.cisnienie = cisnienie;

        System.out.println("Aktualne ciśnienie: " + cisnienie + "%");
    }
}
