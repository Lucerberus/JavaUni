package Agostino;

public class SerieTV extends Produzione 
{
    private int numStagioni;
    
    public SerieTV(int id, String titolo, String prod, int numStagioni)throws Eccezioni
    {
        super(id, titolo, prod);
        steNumStagioni(numStagioni);
    }
    public void steNumStagioni(int numStagioni) throws Eccezioni
    {   
        if(numStagioni<0)
            throw new Eccezioni("Non ci possono essere stagioni Negative");
        else
            this.numStagioni=numStagioni;
    }
    public int getNumStagioni()
    {
        return this.numStagioni;
    }
    public String toString()
    {
        return super.toString()+" numeroStagioni: "+this.numStagioni;
    }
}
