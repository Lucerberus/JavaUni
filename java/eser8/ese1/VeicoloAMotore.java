package eser8.ese1;

public class VeicoloAMotore extends Veicolo
{
    private int cc;

    public VeicoloAMotore(double Px, double Py, double V0x, double V0y, double A0x, double A0y, int cc)
    {
        super(Px, Py, V0x, V0y, A0x, A0y);

    }

    public void setCC(int cc)
    {
        this.cc=cc;
    }

    public int getCC()
    {
        return this.cc;
    }

    public String toString()
    {
        return super.toString()+"\ncilindrata = "+getCC();
    }
     
}