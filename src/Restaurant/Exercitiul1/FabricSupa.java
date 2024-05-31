package Restaurant.Exercitiul1;

public class FabricSupa {
    public Supa creazaSupa(String tip) {
        if (tip.equalsIgnoreCase("legume")) {
            return new SupaLegume();
        } else if (tip.equalsIgnoreCase("ciuperci")) {
            return new SupaCiuperci();
        }


        return null; // Sau aruncăm o excepție pentru un tip necunoscut
    }
}
