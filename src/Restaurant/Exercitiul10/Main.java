package Restaurant.Exercitiul10;

public class Main {
    public static void main(String[] args) {
        // Obținem o instanță a informațiilor despre client folosind Singleton
        InformatiiClient client = InformatiiClient.getInstance("John Doe", "123456789", "john@example.com");

        // Creăm rezervări care folosesc aceleași informații despre client
        Rezervare rezervare1 = new Rezervare(client, 1, 4, "18:00");
        Rezervare rezervare2 = new Rezervare(client, 2, 2, "19:30");

        // Afisăm informațiile despre rezervări
        afiseazaInformatiiRezervare(rezervare1);
        afiseazaInformatiiRezervare(rezervare2);
    }

    private static void afiseazaInformatiiRezervare(Rezervare rezervare) {
        System.out.println("Rezervare pentru masa " + rezervare.getNumarMasa() + ":");
        System.out.println("  Nume client: " + rezervare.getInformatiiClient().getNume());
        System.out.println("  Telefon client: " + rezervare.getInformatiiClient().getTelefon());
        System.out.println("  Email client: " + rezervare.getInformatiiClient().getEmail());
        System.out.println("  Număr persoane: " + rezervare.getNumarPersoane());
        System.out.println("  Ora rezervare: " + rezervare.getOraRezervare());
        System.out.println();
    }
}

