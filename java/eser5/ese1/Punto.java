package eser5.ese1;
//classe punto con metodi e incapsulamento
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y)
    {
        this.x=x;
        this.y=y;
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    
    public void setX(double x)
    {
        this.x=x;
    }
    public void setY(double y)
    {
        this.y=y;
    }

    public String toString()
    {
        return "x:"+this.x+" y:"+this.y;
    }
    public boolean equals(Punto p)
    {
        if(this.x == p.getX() && this.y == p.getY())
            return true;
        else
            return false;
    }

    public double Distanza(Punto p)
    {   //                        ⇊differenza tra le x            ⇊differenza tra le y  
        return Math.sqrt(Math.pow(this.x-p.getX(), 2)+Math.pow(this.y-p.getY(), 2));//restituisce la distanza tra i due punti
    }   //      ⇈radice quadrata                    ⇈elevato a 2                   ⇈elevato a 2

    public Punto PuntoMed(Punto p)
    {   
        double xx=(this.x+p.getX())/2;//la formula pre prendere il punto medio delle x
        double yy=(this.y+p.getY())/2;//per le y
        Punto r=new Punto(xx, yy);
        return r;
    }

}