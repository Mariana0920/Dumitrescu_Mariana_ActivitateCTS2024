package Restaurant.Exercitiul16;

public class Main {
    public static void main(String[] args) {
        // Creăm un obiect pentru restaurant
        Restaurant restaurant = new Restaurant();

        // Adăugăm clienți cu diverse informații de contact
        Observer client1 = new Client("John", "123456789", null);
        Observer client2 = new Client("Alice", null, "alice@example.com");
        Observer client3 = new Client("Bob", null, null);

        // Adăugăm clienții în lista de observatori a restaurantului
        restaurant.adaugaClient(client1);
        restaurant.adaugaClient(client2);
        restaurant.adaugaClient(client3);

        // Trimitem o notificare
        restaurant.trimiteNotificare("Ofertă specială pentru masa de prânz!");

        // După trimiterea notificării, clienții vor primi mesajele corespunzătoare în funcție de datele lor de contact.
    }
}

