package eser6.ese5;
//si come sono storto, visualizzo l'eq del piano
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

    private double DET(double a, double d, double c, double b)
    {
        return (a*d) -(c*b);
    }

    public void setEQ(Point3D A,Point3D B, Point3D C)
    {   //formule prese da: https://www.youmath.it/forum/algebra-lineare/55740-equazione-del-piano-per-3-punti-non-allineati.html
        eq="";
        boolean compatibile=true; 
        double[] AB = {B.getX()-A.getX(), B.getY()-A.getY(), B.getZ()-A.getZ()};//creo vettore AB
        double[] AC = {C.getX()-A.getX(), C.getY()-A.getY(), C.getZ()-A.getZ()};//crep vettore AC 
        //mi calcolo i determinanti della matrice associata ad vettori AB e AC, quindi una matrice 2*3
        //mi calcolo tutti i possibili minori
        double det1 = DET(AB[0], AC[1], AB[1], AC[0]);//minore 1 = c
        double det2 = DET(AB[1], AC[2], AB[2], AC[1]);//minore 2 = a
        double det3 =-DET(AB[0], AC[2], AB[2], AC[0]);//minore 3 = b, ho messo il meno davanti perché usero il determinante già calcolato
        //come il parametro a,b,c della eq del piano cioè ax+by+cz+d=0;

        if(det1 == 0) //controllo se la matrice con i vettori AB e AC ha il rango massimo
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
        {   //arrivato a questo punto  ho: det2(x-xA) +det3(y-yA) + det1(z-zA)=0
            //moltiplico: det2*x -det2*xA + det3*y -det3*yA +det1*z -det1*zA = 0 
            double d = ((-det2*A.getX()) + (-det3*A.getY()) +(-det1*A.getZ()));//mi calcolo la d con i termini noti 
            eq="("+det2+")x + ("+det3+")y + ("+det1+")z + ("+d+") = 0";//assemblo l'eq
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
        return this.eq;
    }
    public Point3D getP1() 
    {
        return this.p1;
    }
    public Point3D getP2() 
    {
        return this.p2;
    }
    public Point3D getP3() 
    {
        return this.p3;
    }

    public String toString() 
    {
        return this.eq;
    }

}
