package eser7.ese2;

public class Persona {
    private String Nome;
    private String Cognome;
    private int Eta;
    private String Indirizzo;
    //costruttore
    public Persona(String Nome, String Cognome, int Eta, String Indirizzo)
    {   
        
        setNome(Nome);
        setCognome(Cognome);
        setEta(Eta);
        setIndirizzo(Indirizzo);
    }
    //metodi set e get
    public void setIndirizzo(String Indirizzo)
    {
        this.Indirizzo= Indirizzo;
    }

    public String getIndirizzo()
    {
        return this.Indirizzo;
    }

    public String getNome()
    {
        return this.Nome;
    }
    public void setNome(String Nome)
    {
        this.Nome=Nome;
    }
    public String getCognome()
    {
        return this.Cognome;
    }
    public void setCognome(String Cognome)
    {
        this.Cognome=Cognome;
    }
    public int getEta()
    {
        return this.Eta;
    }
    public void setEta(int Eta)
    {
        this.Eta=Eta;
    }
    //toSring modificato.
    public String toString()
    {
        return "Nome: "+Nome+"\nCognome: "+Cognome+"\nEta: "+Eta+"\nIndirizzo: "+Indirizzo;
    }
    
}
