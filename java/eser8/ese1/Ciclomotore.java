package eser8.ese1;

public class Ciclomotore extends VeicoloAMotore 
{
    private long n_telaio;

    public Ciclomotore(double Px, double Py, double V0x, double V0y, double A0x, double A0y, int cc, long nt)
    {
        super(Px, Py, V0x, V0y, A0x, A0y, cc);
        setNt(nt);
    }

    public void setNt(long nt)
    {
        this.n_telaio = nt;
    }

    public long getNt()
    {
        return this.n_telaio;
    }

    public String toString()
    {
        return super.toString()+"\tnumero telaio = "+getNt();
    }
}
