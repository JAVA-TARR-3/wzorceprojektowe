package dekorator;

public class DekoratorProgram {

    public static void main(String[] args) {

        Napoj napoj = new Kawa();
        print(napoj);

        Napoj napoj2 = new Kawa();
        napoj2 = new Cukier(napoj2);
        napoj2 = new Cukier(napoj2);
        napoj2 = new Mleko(napoj2);
        print(napoj2);

        Napoj napoj3 = new Mleko(new Cukier(new Cukier(new Kawa())));
        print(napoj3);
    }

    private static void print(Napoj napoj) {
        System.out.println(napoj.getOpis() + " " + napoj.getKoszt() + " zł");
    }


}
