package Spital.Exercitiul1;

public class PatientBuilder implements IBuilder {
    private Patient patient;

    public PatientBuilder()
    {
        patient=new Patient(false, false,false,false);

    }

    public Patient build()
    {
        return patient;
    }

    public PatientBuilder setPatRabatabil (boolean patRabatabil)
    {
        this.patient.setPatRabatabil(patRabatabil);
        return this;
    }
    public PatientBuilder setMicDejun (boolean micDejun)
    {
        this.patient.setMicDejun(micDejun);
        return this;
    }

    public PatientBuilder setPapuci (boolean papuci)
    {
        this.patient.setPapuci(papuci);
        return this;
    }

    public PatientBuilder setHalat( boolean halat)
    {
        this.patient.setHalat(halat);
        return this;

    }



}
