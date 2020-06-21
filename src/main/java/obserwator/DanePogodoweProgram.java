package obserwator;

public class DanePogodoweProgram {

    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezace warunkiBiezace = new WarunkiBiezace(danePogodowe);
        Statystyka statystyka = new Statystyka(danePogodowe);
        WarunkiBiezaceCisnienia warunkiBiezaceCisnienia = new WarunkiBiezaceCisnienia(danePogodowe);

        danePogodowe.ustawStan(80, 65, 30.4f);
        danePogodowe.ustawStan(82, 70, 29.2f);
        danePogodowe.ustawStan(78, 90, 30.4f);

        WarunkiBiezaceCisnienia warunkiBiezaceCisnienia1 = new WarunkiBiezaceCisnienia(danePogodowe);

        danePogodowe.ustawStan(78, 90, 30.4f);
    }
}
