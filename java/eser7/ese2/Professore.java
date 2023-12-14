package eser7.ese2;


public class Professore extends Persona
{   
    private int codDocente;
    private String dataAssunzione;
    private String Ruolo;
    private String DipartimentoProv;
    private double Stipendio;
 
    public Professore(String Nome, String Cognome, int Eta,String Indirizzo, int codDocente, String dataAssunzione, String Ruolo, String DipartimentoProv, double Stipendio)
    {
        super(Nome, Cognome, Eta, Indirizzo);
        setcodDocente(codDocente);
        setdataAssunzione(dataAssunzione);
        setRuolo(Ruolo);
        setDipartimentoProv(DipartimentoProv);
        setStipendio(Stipendio);
    }
    //set
    public void setcodDocente(int c)
    {
        this.codDocente = c;
    }
    
    public void setdataAssunzione(String d)
    {
        this.dataAssunzione=d;
    }

    public void setRuolo(String r)
    {
        this.Ruolo = r;
    }

    public void setDipartimentoProv(String d)
    {
        this.DipartimentoProv = d;
    }

    public void setStipendio(double s)
    {
        this.Stipendio = s;
    }
    //get
    public int getcodDocente()
    {
        return this.codDocente;
    }
    
    public String getdataAssunzione()
    {
        return this.dataAssunzione;
    }

    public String getRuolo()
    {
        return this.Ruolo;
    }

    public String getDipartimentoProv()
    {
        return this.DipartimentoProv;
    }

    public double getStipendio()
    {
        return this.Stipendio;
    }
    //tostring

    public String toString()
    {
        return super.toString()+"\nCodiceDocente: "+getcodDocente()+"\nDataAssunzione: "+getdataAssunzione()+"\nRuolo: "+getRuolo()
                +"\nDipartimento di provenienza: "+getDipartimentoProv()+"\nStipendio: "+getStipendio();
    }
}   