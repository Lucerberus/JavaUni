package eser7.ese2;



public class StudenteMagistrale extends Studente 
{
    private int CFU=0;
    private String CorsoProv;
    
    public StudenteMagistrale(String Nome, String Cognome, int Eta,String Indirizzo, int matricola, String dataIscrizione, String CorsoDiLaurea, double Contributo, String CorsoProv)
    {
        super(Nome, Cognome, Eta, Indirizzo, matricola, dataIscrizione, CorsoDiLaurea, Contributo);
        setCorsoProv(CorsoProv);

    }
    public void setCorsoProv(String c)
    {
        this.CorsoProv=c;
    }

    public String getCorsoProv() 
    {
        return this.CorsoProv;
    }
    
    public void AggiuntaCFU(int cfu)
    {
        if(this.CFU+cfu>120)
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
        return super.toString()+"\nCFU: "+getCFU()+"\nScuola di Provenienza: "+getCorsoProv();
    }
}
