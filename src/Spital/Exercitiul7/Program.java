package Spital.Exercitiul7;

public class Program {
    public static void main(String[] args) {
        RezultatLaborator rezultat = new RezultatLaborator();
        rezultat.printeaza();

        DecoratorRezultat decoratorRezultat = new DecoratorRezultatLaborator(rezultat);
        decoratorRezultat.printeaza();
        decoratorRezultat.trimiteRezultat("dumitrescu.mariana@gmail.com");
    }
}
