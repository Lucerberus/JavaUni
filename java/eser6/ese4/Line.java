package eser6.ese4;

public class Line {

    private Point2D p1;
    private Point2D p2;
    private String eq;

    public Line(Point2D p1, Point2D p2)
    {
        setEQ(p1, p2);
        setP1(p1);
        setP2(p2);
    }

    public void setP1(Point2D p1) 
    {
        this.p1 = p1;
    }
    public void setP2(Point2D p2) 
    {
        this.p2 = p2;
    }
    public Point2D getP1() 
    {
        return p1;
    }
    public Point2D getP2() 
    {
        return p2;
    }

    public void setEQ(Point2D p1, Point2D p2)
    {
        if(p1.dequals(p2))
        {
            double x2x1 = p2.getX() - p1.getX();
            double y2y1 = p2.getY() - p1.getY();
            double com= -((p1.getX()*y2y1)/x2x1) +p1.getY();
            this.eq="y=("+y2y1+"x/"+x2x1+") + ("+com+")";
            //this.eq="y=("+y2y1+"x/"+x2x1+") - ("+p1.getX()*y2y1+"/"+x2x1+") + "+p1.getY();
        }else if(p1.equalsX(p2))
        {
            eq="x="+p1.getX();
        }else if(p1.equalsY(p1))
        {
            eq = "y="+p1.getY();
        }else
        {
            System.out.println("ha passato 2 punti uguali, per un punto passano infinite rette");
        }
        
    }

    public String getEQ()
    {
        return this.eq;
    }

    public String toString() 
    {
        return this.eq;
    }

}
