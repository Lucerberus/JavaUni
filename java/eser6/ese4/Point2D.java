package eser6.ese4;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y)
    {
        setX(x);
        setY(y);
    }

    public void setX(double x) 
    {
        this.x = x;
    }

    public void setY(double y) 
    {
        this.y = y;
    }

    public double getX()
    {
        return this.x;
    }

    public double getY()
    {
        return this.y;
    }

    public String toString()
    {
        return "<"+this.x+"><"+this.y+">";
    }

    public boolean equalsX(Point2D p1) 
    {
        if( this.getX() == p1.getX())
            return true;
        else
            return false;
    }

    public boolean equalsY(Point2D p1) 
    {
        if( this.getY() == p1.getY())
            return true;
        else
            return false;
    }

    public boolean equals(Point2D p1)
    {
        if((this.getX() == p1.getX()) && (this.getY() == p1.getY()))
            return true;
        else
            return false;
    }
    public boolean dequals(Point2D p1)
    {
        if((this.getX() != p1.getX()) && (this.getY() != p1.getY()))
            return true;
        else
            return false;
    }
}
