package eser7.ese1;

public class Abbonato extends Persona{
    private int sconto;//in percentuale 0-100. presumo che tutti hanno sconti diversi
    //private static int sconto = 5;// sconto fisso di 5%

    public Abbonato(int id, String Nome, String Cognome, int Eta, int sconto)
    {
        super(id, Nome, Cognome, Eta);
        setSconto(sconto);
    }

    public void setSconto(int sc)
    {
        this.sconto=sc;
    }

    public int getSconto()
    {
        return this.sconto;
    }
    
    public String toString()
    {
        return super.toString()+"\nSconto: "+this.sconto+"%";
    }
}
