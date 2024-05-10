package Farmacie.Exercitiul9;

public class VerificareReteta {
    public static boolean verificareReteta(String reteta)
    {
        return reteta!= null && reteta.length() >= 6;
    }
}
