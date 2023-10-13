package eser2.quadrato;
//ese2: creare classe quadrato e definire i metodi, poi creare test quadtrato ed usarli
public class Quadrato {
    public int lato;

    public Quadrato(int lato)
    {
        this.lato=lato;
    }
    
    public int Perimetro()
    {
        return 4*lato;
    }
    public int Area()
    {
        return lato*lato;
    }
}