package Primoappello;

public class Eletrodomestico implements Pulizia{
    private Integer id;
    private String modello;
    private Boolean stato;

    public Eletrodomestico(Integer id, String modello, Boolean stato)
    {
        setId(id);
        setModello(modello);
        setStato(stato);
    }

    public void setId(Integer id)
    {
        this.id=id;
    }
    public void setModello(String modello)
    {
        this.modello=modello;
    }
    public void setStato(Boolean stato)
    {
        this.stato=stato;
    }
    public Integer getId()
    {
        return this.id;
    }
    public Boolean getStato()
    {
        return this.stato;
    }
    public String getModello()
    {
        return this.modello;
    }

    public String toString()
    {
        return "id: "+this.id+" modello: "+this.modello+" stato: "+(this.stato ? "on":"off");
    }


    @Override
    public void AccendiSpegni()
    {
        if(this.stato)
        {
            System.out.println("Spegnimento Eletrodomestico");
            this.stato=false;
        }
        else
        {
            System.out.println("Accensione Eletrodomestico");
            this.stato=true;
        }
    }
    public void pulisci() throws ExceptionsElet {}
}
