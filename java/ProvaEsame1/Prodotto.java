package ProvaEsame1;

public abstract class Prodotto implements Comparable<Prodotto>{
    private int id;
    private double costo;
    private String desc;

    public Prodotto(int id, int costo, String desc)
    {
        setId(id);
        setCosto(costo);
        setDesc(desc);
    }

    public void setId(int id)
    {
        this.id=id;
    }
    public void setCosto(double costo) throws IllegalArgumentException
    {   if(costo<0)
            throw new IllegalArgumentException("Il costo non può essere negativo");
        else
            this.costo=costo;
    }
    public void setDesc(String desc)
    {
        this.desc=desc;
    }
    public int getId()
    {
        return id;
    }
    public double getCosto()
    {
        return costo;
    }
    public String getDesc()
    {
        return desc;
    }
    public String toString()
    {
        return "id: "+id+" costo: "+costo+" desc: "+desc;
    }
    public boolean equals(Prodotto p)
    {
        return ((this.id == p.id) && (this.desc).equals(p.desc));
    }
    public boolean hashCode(Prodotto p)
    {
        int h1 = (this.desc).hashCode();
        int h2 = (p.desc).hashCode();
        return ((this.id == p.id) && (h1==h2));
    }

    @Override
    public int compareTo(Prodotto p)
    {
        return Double.compare(this.costo, p.costo);
    }

}
