package Restaurant.Exercitiul16;

public class Client implements Observer {
    private String nume;
    private String numarTelefon;
    private String adresaEmail;

    public Client(String nume, String numarTelefon, String adresaEmail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public void update(String message) {
        if (numarTelefon != null) {
            // Trimite notificare prin SMS
            System.out.println("Notificare SMS pentru " + nume + ": " + message);
        } else if (adresaEmail != null) {
            // Trimite notificare prin email
            System.out.println("Notificare email pentru " + nume + ": " + message);
        } else {
            // Trimite notificare managerului
            System.out.println("Nu există date de contact pentru " + nume + ". Notificare către manager.");
        }
    }
}
