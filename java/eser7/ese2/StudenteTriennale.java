package eser7.ese2;


public class StudenteTriennale extends Studente 
{
    private int CFU=0;
    private String ScuolaProv;

    public StudenteTriennale(String Nome, String Cognome, int Eta,String Indirizzo, int matricola, String dataIscrizione, String CorsoDiLaurea, double Contributo, String ScuolaProv)
    {
        super(Nome, Cognome, Eta, Indirizzo, matricola, dataIscrizione, CorsoDiLaurea, Contributo);
        setScuolaProv(ScuolaProv);
    }
    
    public void setScuolaProv(String s)
    {
        this.ScuolaProv=s;
    }

    public String getScuolaProv()
    {
        return this.ScuolaProv;
    }

    public void AggiuntaCFU(int cfu)
    {
        if(this.CFU+cfu>180)
            System.out.println("Hai superato il limite");
        else
            this.CFU=this.CFU+cfu;
    }
    public int getCFU()
    {
        return this.CFU;
    }

    public String toString()
    {
        return super.toString()+"\nCFU: "+getCFU()+"\nScuola di Provenienza: "+getScuolaProv();
    }
}
