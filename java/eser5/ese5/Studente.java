package eser5.ese5;

public class Studente {
    private String Nome;
    private String Cognome;
    private Data Nascita;
    private long mat;
    public Studente(String Nome, String Cognome, Data Nascita, long mat)
    {
        setNome(Nome);
        setCognome(Cognome);
        setNascita(Nascita);
        setMat(mat);
    }
    //set
    public void setNome(String Nome)
    {
        this.Nome=Nome;
    }
    public void setCognome(String Cognome)
    {
        this.Cognome=Cognome;
    }
    public void setMat(long mat)
    {
        this.mat=mat;
    }
    public void setNascita(Data Nascita)
    {
        this.Nascita=Nascita;
    }
    //get
    public String getNome()
    {
        return this.Nome;
    }
    public String getCognome()
    {
        return this.Cognome;
    }
    public Data getNascita()
    {
        return this.Nascita;
    }
    public long getMat()
    {
        return this.mat;
    }
    //toString
    public String toString()
    {
        return "{"+this.Nome+" "+this.Cognome+"\n Nato: "+Nascita.toString()+"\n Matricola: "+this.mat+"}";
    }
}
