package strategia;

public class PiesProgram {

    public static void main(String[] args) {

        Pies doberman = new Pies(new Biegam(), new Szczekam(), new Spie());
        doberman.ruszajSie();
        doberman.spij();
        doberman.szczekaj();

        Pies kiwajacyGlowaPies = new Pies(new KiwamGlowa(), new NieSzczekam(), new NieSpieBoNieZyje());
        kiwajacyGlowaPies.szczekaj();
        kiwajacyGlowaPies.spij();
        kiwajacyGlowaPies.ruszajSie();

        kiwajacyGlowaPies.setRuszanie(new Biegam());
        kiwajacyGlowaPies.szczekaj();
        kiwajacyGlowaPies.spij();
        kiwajacyGlowaPies.ruszajSie();
    }
}
