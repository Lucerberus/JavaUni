package eser6.ese5;

public class Point3D extends Point2D {
    private double z;
    
    public Point3D( double x, double y, double z)
    {
        super(x, y);
        setZ(z);
    }
    
    public void setX(double x) 
    {
        super.setX(x);
    }

    public void setY(double y)
    {
        super.setY(y);
    }

    public void setZ(double z)
    {
        this.z=z;
    }
    
    public double getX() 
    {
        return super.getX();
    }

    public double getY() 
    {
        return super.getY();
    }

    public double getZ() 
    {
        return z;
    }

    public String toString() 
    {
        return "<"+super.toString()+"("+this.z+")>";
    }
}
