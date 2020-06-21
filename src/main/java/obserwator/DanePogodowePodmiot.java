package obserwator;

public interface DanePogodowePodmiot {

    void zarejestrujObserwatora(DanePogodoweObserwator obserwator);

    void usunObserwatora(DanePogodoweObserwator obserwator);

    void powiadomObserwatorow();
}
