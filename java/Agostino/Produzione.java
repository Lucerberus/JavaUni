package Agostino;

public class Produzione 
{
    private int id;
    private String titolo;
    private String prod;
    
    public Produzione(int id, String titolo, String prod)
    {
        setId(id);
        setProd(prod);
        setTitolo(titolo);
    }

    public void setId(int id)
    {
        this.id=id;
    }
    public void setTitolo(String titolo)
    {
        this.titolo=titolo;
    }
    public void setProd(String prod)
    {
        this.prod=prod;
    }
    public int getId()
    {
        return this.id;
    }
    public String getTitolo()
    {
        return this.titolo;
    }
    public String getProd()
    {
        return this.prod;
    }

    public String toString()
    {
        return "id: "+this.id+" titolo: "+this.titolo+" produzione: "+this.prod;
    }
}
