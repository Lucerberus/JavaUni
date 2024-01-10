package eser8.ese1;

public class Main 
{
    public static void main(String[] args) 
    {
        Bicicletta b = new Bicicletta(0, 0, 0, 0, 2, 0.1,"bmx");
        Automobile a = new Automobile(0, 0, 0, 0, 6, 0, 1980, "CG 000 YA");//targa presa casualmente
        Ciclomotore c = new Ciclomotore(0, 0, 0, 0, 4, 1, 99, 20331209);

        for(double t=0; t<20; t=t+2)
        {
            b.muovi(t);
            a.muovi(t);
            c.muovi(t);
            System.out.println("\nbici: "+b.toString()+"\n\nauto : "+a.toString()+"\n\nmoto : "+c.toString());
        }
    }
}
