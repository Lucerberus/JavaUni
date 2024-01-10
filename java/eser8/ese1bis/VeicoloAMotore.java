package eser8.ese1bis;

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

    @Override
    public void muovi(double t) 
    {
        double new_x = (getPos()).getX()+getV0x()*t + getA0x()*t*t;
        double new_y = (getPos()).getY()+getV0y()*t + getA0y()*t*t;
        setPos(new_x, new_y); 
    }
     
}