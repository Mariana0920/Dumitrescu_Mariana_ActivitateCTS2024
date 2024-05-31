package Spital.Exercitiul7;

public class DecoratorRezultatLaborator extends DecoratorRezultat {
    public DecoratorRezultatLaborator(RezultatLaborator rezultatLaborator) {
        super(rezultatLaborator);
    }

    @Override
    public void trimiteRezultat(String email) {
        System.out.printf("Expedirere rezultate la adresa de email %s...\n", email);
    }
}
