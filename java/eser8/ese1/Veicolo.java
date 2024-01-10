package eser8.ese1;
import eser6.ese4.Point2D;
public class Veicolo {
    private Point2D pos;
    private double V0x, V0y;
    private double A0x, A0y;

    public Veicolo(double Px, double Py, double V0x, double V0y, double A0x, double A0y)
    {
        setPos(Px, Py);
        setV0x(V0x);
        setV0y(V0y);
        setA0x(A0x);
        setA0y(A0y);
    }

    public void setPos(double Px, double Py)
    {
        this.pos = new Point2D(Px, Py);
    }

    public void setV0x(double vx)
    {
        this.V0x = vx;
    }

    public void setV0y(double vy)
    {
        this.V0y = vy;
    }

    public void setA0x(double ax)
    {
        this.A0x = ax;
    }

    public void setA0y(double ay)
    {
        this.A0y=ay;
    }

    public Point2D getPos()
    {
        return this.pos;
    }

    public double getV0x()
    {
        return this.V0x;
    }

    public double getV0y()
    {
        return this.V0y;
    }

    public double getA0y()
    {
        return this.A0y;
    }

    public double getA0x()
    {
        return this.A0x;
    }

    public void muovi(double t)
    {
        double new_x = pos.getX()+getV0x()*t + getA0x()*t*t;
        double new_y = pos.getY()+getV0y()*t + getA0y()*t*t;
        pos.setX(new_x);
        pos.setY(new_y);
    }

    @Override
    public String toString() {
        
        return "x = "+pos.getX()+"\ty = "+pos.getY()+"\nv0x = "+getV0x()+"\tv0y = "+getV0y()+
                "\na0x = "+getA0x()+"\ta0y = "+getA0y();
    }


    
}
