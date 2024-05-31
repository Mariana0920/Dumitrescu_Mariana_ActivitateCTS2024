package Restaurant.Exercitiul1;

public class Main {
    public static void main(String[] args) {
        FabricSupa fabricaSupa = new FabricSupa();

        // Creăm supa de legume
        Supa supaLegume = fabricaSupa.creazaSupa("legume");
        supaLegume.serveste();

        // Creăm supa de ciuperci
        Supa supaCiuperci = fabricaSupa.creazaSupa("ciuperci");
        supaCiuperci.serveste();

        // Adăugăm un nou tip de supă fără a modifica codul existent
        Supa supaNoua = fabricaSupa.creazaSupa("nou");
        if (supaNoua != null) {
            supaNoua.serveste();
        } else {
            System.out.println("Tip de supă necunoscut.");
        }
    }
}
