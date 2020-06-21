package obserwator;

public class WarunkiBiezace implements DanePogodoweObserwator {

    private DanePogodowePodmiot podmiot;

    private float temperatura;
    private float wilgotnosc;

    public WarunkiBiezace(DanePogodowePodmiot podmiot) {
        this.podmiot = podmiot;
        podmiot.zarejestrujObserwatora(this);
    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;

        System.out.println("Warunki bieżące " + temperatura + " stopni C oraz " + wilgotnosc + " % wilgotności");
    }
}
