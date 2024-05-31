package Spital.Exercitiul5;

public class MedicamentSpital {
    public void achizitioneazaMedicament() {
        if (prezintaReteta()) {
            System.out.println("Medicament achizitionat pe baza de reteta.");
        } else {
            System.out.println("Reteta invalida.");
        }
    }

    public boolean prezintaReteta() {

        return true;
    }
}

