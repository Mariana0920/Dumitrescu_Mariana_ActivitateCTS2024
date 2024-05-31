package Restaurant.Exercitiul10;

public class Rezervare {
    private InformatiiClient informatiiClient;
    private int numarMasa;
    private int numarPersoane;
    private String oraRezervare;

    public Rezervare(InformatiiClient informatiiClient, int numarMasa, int numarPersoane, String oraRezervare) {
        this.informatiiClient = informatiiClient;
        this.numarMasa = numarMasa;
        this.numarPersoane = numarPersoane;
        this.oraRezervare = oraRezervare;
    }

    // Getters pentru informațiile rezervării
    public InformatiiClient getInformatiiClient() {
        return informatiiClient;
    }

    public int getNumarMasa() {
        return numarMasa;
    }

    public int getNumarPersoane() {
        return numarPersoane;
    }

    public String getOraRezervare() {
        return oraRezervare;
    }
}
