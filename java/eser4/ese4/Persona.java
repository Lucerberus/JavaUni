package eser4.ese4;

public class Persona {
    public String Nome;
    public String Cognome;
    public int Eta;
    //costruttore
    public Persona(String Nome, String Cognome, int Eta)
    {
        this.Nome=Nome;
        this.Cognome=Cognome;
        this.Eta=Eta;
    }
    //metodi set e get

    public String getNome()
    {
        return this.Nome;
    }
    public void setNome(String NuovoNome)
    {
        this.Nome=NuovoNome;
    }
    public String getCognome()
    {
        return this.Cognome;
    }
    public void setCognome(String NuovoCognome)
    {
        this.Cognome=NuovoCognome;
    }
    public int getEta()
    {
        return this.Eta;
    }
    public void setEta(int NuovaEta)
    {
        this.Eta=NuovaEta;
    }
    //toSring modificato.
    public String toString()
    {
        return "Nome: "+Nome+"\nCognome: "+Cognome+"\nEta: "+Eta;
    }
    
}
