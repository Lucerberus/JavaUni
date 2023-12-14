package eser7.ese2;

public class Studente extends Persona
{
    private String dataIscrizione;
    private int matricola;
    private String CorsoDiLaurea;
    private double Contributo;

    public Studente(String Nome, String Cognome, int Eta,String Indirizzo, int matricola, String dataIscrizione, String CorsoDiLaurea, double Contributo)
    {
        super(Nome, Cognome, Eta, Indirizzo);
        setMatricola(matricola);
        setdataIscrizione(dataIscrizione);
        setCorsoLaura(CorsoDiLaurea);
        setContributo(Contributo);
    }

    //set
    public void setMatricola(int mat)
    {
        this.matricola=mat;
    }
    public void setdataIscrizione(String d)
    {
        this.dataIscrizione=d;
    }
    public void setCorsoLaura(String c)
    {
        this.CorsoDiLaurea=c;
    }
    public void setContributo(double c)
    {
        this.Contributo=c;
    }
    //get

    public int getMatricola()
    {
        return this.matricola;
    }
    public String getDataIscrizione()
    {
        return this.dataIscrizione;
    }
    public String getCorsoLaurea()
    {
        return this.CorsoDiLaurea;
    }
    public double getContributo()
    {
        return this.Contributo;
    }
    //tostring
    public String toString()
    {
        return super.toString()+"\nMatricola: "+getMatricola()+"\nData Iscrizione: "+getDataIscrizione()
                               +"\nCorso di Lurea: "+getCorsoLaurea()+"\nContributi: "+getContributo();
    }
}