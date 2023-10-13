package eser2.Rettangolo;
//esercizio basato su quadrato, ma con il rettangolo 
public class Rettangolo {

    /**
     * @param h altezza
     * @param b base
     * 
     */
    public int b;
    public int h;
    
    public Rettangolo(int b, int h)
    {
        this.b=b;
        this.h=h;
    }
    /**
     * 
     * @return perimetro del rettangolo
     */
    public int Perimetro()
    {
        return (h+b)*2;
    }
    
    /**
     * 
     * @return area del rettangolo
     */
    public int Area()
    {
        return h*b;
    }
    
}
