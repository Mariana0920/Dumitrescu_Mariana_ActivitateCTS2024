package Farmacie.Exercitiul1;

public class MedicamentFactory {
    public static Medicament creareMedicament(String denumire, double pret, Categorie categorie)
    {
        return new Medicament(denumire, pret, categorie);
    }
}
