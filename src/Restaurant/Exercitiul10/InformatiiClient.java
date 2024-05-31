package Restaurant.Exercitiul10;

public class InformatiiClient {
    private String nume;
    private String telefon;
    private String email;

    // Constructor privat pentru a preveni crearea de noi instanțe din exterior
    private InformatiiClient(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
    }

    // Metodă statică pentru a obține instanța Singleton
    private static InformatiiClient instance;

    public static InformatiiClient getInstance(String nume, String telefon, String email) {
        if (instance == null) {
            instance = new InformatiiClient(nume, telefon, email);
        }
        return instance;
    }

    // Getters pentru informațiile clientului
    public String getNume() {
        return nume;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getEmail() {
        return email;
    }
}
