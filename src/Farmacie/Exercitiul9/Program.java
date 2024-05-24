package Farmacie.Exercitiul9;

public class Program {
    public static void main(String[] args) {
        Medicament proxy = new ProxyStocMedicamente();
        proxy.cumpara("reteta123456");
        proxy.cumpara(null);
        proxy.cumpara("123");
    }
}
