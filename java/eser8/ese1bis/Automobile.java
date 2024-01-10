package eser8.ese1bis;

public class Automobile extends VeicoloAMotore
{
    private String targa;
    
    public Automobile(double Px, double Py, double V0x, double V0y, double A0x, double A0y, int cc, String targa)
    {
        super(Px, Py, V0x, V0y, A0x, A0y, cc);

    }

    public void setTarga(String t)
    {
        this.targa=t;
    }
    public String getTarga()
    {
        return this.targa;
    }

    public String toString()
    {
        return super.toString()+"\ttarga = "+getTarga();
    }
}
