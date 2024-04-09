package Spital.Exercitiul2;

public class TestFactory {
    public static void main(String[] args) {
        PersonalSpital brancardier=FactoryPersonalSpital.creeazaPersonal(TipPersonal.BRANCARDIER);
        brancardier.descriere();
        PersonalSpital asistent= FactoryPersonalSpital.creeazaPersonal(TipPersonal.ASISTENT);
        asistent.descriere();
        PersonalSpital medic= FactoryPersonalSpital.creeazaPersonal(TipPersonal.MEDIC);
        medic.descriere();
    }
}
