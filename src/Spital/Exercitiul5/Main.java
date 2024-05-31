package Spital.Exercitiul5;

public class Main {
    public static void main(String[] args) {
        MedicamentSpital medicamentSpital = new MedicamentSpital();
        MedicamentFarmacie medicamentFarmacie = new MedicamentAdapter(medicamentSpital);


        medicamentFarmacie.cumparaMedicament();
    }
}
