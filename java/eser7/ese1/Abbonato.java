package eser7.ese1;

public class Abbonato extends Persona{
    private int sconto;

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
