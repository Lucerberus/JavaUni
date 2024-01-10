package eser8.ese1;

public class Bicicletta extends Veicolo
{
    private String modello;

    public Bicicletta(double Px, double Py, double V0x, double V0y, double A0x, double A0y, String modello)
    {
        super(Px, Py, V0x, V0y, A0x, A0y);
        setModello(modello);
    }

    public void setModello(String m)
    {
        this.modello=m;
    }
    public String getModello()
    {
        return this.modello;
    }

    public String toString()
    {
        return super.toString()+"\nmodello = "+getModello();
    }
}
