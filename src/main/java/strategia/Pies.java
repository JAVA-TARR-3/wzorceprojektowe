package strategia;

public class Pies {

    private Ruszanie ruszanie;
    private Szczekanie szczekanie;
    private Spanie spanie;

    public Pies(Ruszanie ruszanie, Szczekanie szczekanie, Spanie spanie) {
        this.ruszanie = ruszanie;
        this.szczekanie = szczekanie;
        this.spanie = spanie;
    }

    public void ruszajSie() {
        ruszanie.ruszamSie();
    }

    public void szczekaj() {
        szczekanie.szczekam();
    }

    public void spij() {
        spanie.spie();
    }

    public void setRuszanie(Ruszanie ruszanie) {
        this.ruszanie = ruszanie;
    }

    public void setSzczekanie(Szczekanie szczekanie) {
        this.szczekanie = szczekanie;
    }

    public void setSpanie(Spanie spanie) {
        this.spanie = spanie;
    }
}
