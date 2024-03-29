package eser8.ese2;

public class AbbonatoPremium extends Abbonato {
    private double count=0;
    private boolean sc=false;

    public AbbonatoPremium(int id, String Nome, String Cognome, int Eta, int sconto)
    {
        super(id, Nome, Cognome, Eta, sconto);
        sc=false;
    }
    @Override
    public boolean ifSconto(double spesa)
    {   
        if(count+spesa >= 100)
        {
            count=0;
            sc=true;
        }
        else
        {
            count=count+spesa;
            sc=false;
        }
        return sc;
    }

    public void setCount(int count) 
    {
        this.count = count;
    }

    public String toString() 
    {
        return super.toString()+"\nProgresso sconto: "+count;
    }
}
