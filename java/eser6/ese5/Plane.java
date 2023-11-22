package eser6.ese5;

public class Plane {
    private Point3D p1;
    private Point3D p2;
    private Point3D p3;
    private String eq;
    
    public Plane(Point3D p1,Point3D p2, Point3D p3)
    {
        setEQ(p1, p2, p3);
        setP1(p1);
        setP2(p2);
        setP3(p3);
    }

    private double DET(double a, double b, double c, double d)
    {
        return (a*d) -(c*b);
    }

    public void setEQ(Point3D A,Point3D B, Point3D C)
    {   
        eq="";
        boolean compatibile=true;
        double[] AB = {A.getX()-B.getX(), A.getY()-B.getY(), A.getZ()-B.getZ()};
        double[] AC = {A.getX()-C.getX(), A.getY()-C.getY(), A.getZ()-C.getZ()};
        double det1=DET(AB[0], AB[1], AC[0], AC[1]);
        double det2=DET(AB[1], AB[2], AC[1], AC[2]);
        double det3=DET(AB[0], AB[2], AC[0], AC[2]);

        if(det1 == 0)
        {
            if(det2 == 0)
            {
                if (det3 == 0) 
                {
                    compatibile = false;    
                }
            }
        }
        if(compatibile)
        {
            double d = ((-det2*A.getX()) + (-det3*A.getY()) +(-det1*A.getZ()));
            eq="("+det2+")x + ("+det3+")y + ("+det1+")z + ("+d+") = 0";
        }
        else
        {
            System.out.println("hai passato dei punti che sono linearmente dipendeti, e quindi non si può costriure un piano");
            eq="ERROR";
        }
       
    }

    public void setP1(Point3D p1) 
    {
        this.p1 = p1;
    }
    public void setP2(Point3D p2) 
    {
        this.p2 = p2;
    }
    public void setP3(Point3D p3) 
    {
        this.p3 = p3;
    }
    public String getEq() 
    {
        return eq;
    }
    public Point3D getP1() 
    {
        return p1;
    }
    public Point3D getP2() 
    {
        return p2;
    }
    public Point3D getP3() 
    {
        return p3;
    }


    public String toString() 
    {
        return this.eq;
    }

}
