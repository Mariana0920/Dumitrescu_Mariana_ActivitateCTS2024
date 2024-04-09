package Spital.Exercitiul2;

public class FactoryPersonalSpital {

    public static PersonalSpital creeazaPersonal( TipPersonal tipPersonal)
    {
        switch (tipPersonal)
        {
            case BRANCARDIER:
            {
                return new Brancardier();
            }
            case ASISTENT:
            {
                return new Asistent();
            }
            case MEDIC:
            {
                return new Medic();
            }
            default:throw new IllegalArgumentException("Tipul de personal specificat nu exista. ");
        }
    }
}
