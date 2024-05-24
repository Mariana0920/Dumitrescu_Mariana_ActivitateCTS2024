package Farmacie.Exercitiul1;

public class Medicament {
    private String denumire;
    private double pret;
    private Categorie categorie;

    public Medicament(String denumire, double pret, Categorie categorie) {
        this.denumire = denumire;
        this.pret = pret;
        this.categorie = categorie;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                ", categorie=" + categorie +
                '}';
    }
}
