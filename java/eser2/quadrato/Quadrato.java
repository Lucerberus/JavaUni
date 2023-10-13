package eser2.quadrato;//senza il package funziona nel terminale
//ese2: creare classe quadrato e definire i metodi, poi creare test quadtrato ed usarli
public class Quadrato {
    public int lato;

    public Quadrato(int lato)
    {
        this.lato=lato;
    } 
    
    
    /** 
     * @return int
     */
    public int Perimetro()
    {
        return 4*lato;
    }
    public int Area()
    {
        return lato*lato;
    }
}