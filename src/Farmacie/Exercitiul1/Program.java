package Farmacie.Exercitiul1;

public class Program {
    public static void main(String[] args) {
        Medicament med1= MedicamentFactory.creareMedicament("Paracetamol", 10.5, Categorie.DURERE);
        Medicament med2=MedicamentFactory.creareMedicament("Nurofen", 15.0, Categorie.RACEALA);

        System.out.println(med1);
        System.out.println(med2);
    }
}
