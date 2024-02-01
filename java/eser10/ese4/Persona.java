package eser10.ese4;

public class Persona implements Comparable<Persona>{
    private String Nome;
    private String Cognome;
    private int Eta;
    private int id;
    //costruttore
    public Persona(int id, String Nome, String Cognome, int Eta)
    {   
        setId(id);
        setNome(Nome);
        setCognome(Cognome);
        setEta(Eta);
    }
    //metodi set e get

    public int getId() 
    {
        return this.id;
    }
    public void setId(int id) 
    {
        this.id = id;
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
        return "id: "+id+"\nNome: "+Nome+"\nCognome: "+Cognome+"\nEta: "+Eta;
    }
    
    @Override
    public int compareTo(Persona p1)
    {   //compare in base al cognome
        return (this.Cognome).compareTo(p1.Cognome);
    }
}
