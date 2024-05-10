package Farmacie.Exercitiul9;

public class ProxyStocMedicamente implements Medicament{
    private StocDeMedicamente stocDeMedicamente;

    public void cumpara(String reteta)
    {
        if(VerificareReteta.verificareReteta(reteta))
        {
            if(stocDeMedicamente==null)
            {
                stocDeMedicamente= new StocDeMedicamente();

            }
            else {
                System.out.println("Nu puteti cumpara medicamente fara o reteta valida.");
            }
        }
    }
}
