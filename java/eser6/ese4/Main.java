package eser6.ese4;

import java.util.Scanner;

public class Main {
    public static void print(Object obj)
    {
        System.out.println(obj);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double x=0, y=0;
        print("inserisci x e y dell primo punto");
        x=sc.nextDouble();
        y=sc.nextDouble();
        Point2D p1=new Point2D(x, y);
        print("inserisci x e y dell secondo punto");
        x=sc.nextDouble();
        y=sc.nextDouble();
        Point2D p2=new Point2D(x, y);

        Line l=new Line(p1, p2);

        print(l);
        sc.close();
    }
    
}
