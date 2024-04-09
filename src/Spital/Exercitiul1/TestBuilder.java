package Spital.Exercitiul1;

public class TestBuilder {

    public static void main(String[] args)
    {
        PatientBuilder builder= new PatientBuilder();
        Patient patient= builder.setPatRabatabil(true).setHalat(false).setMicDejun(true).setPapuci(false).build();

        System.out.println(patient);
    }
}
