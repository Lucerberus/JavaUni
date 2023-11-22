package eser6.ese5;

import java.util.Scanner;

public class Main {
    public static void print(Object obj)
    {
        System.out.println(obj);
    }
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        double x=0, y=0, z=0;
        print("inserisci x e y e z dell primo punto");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        Point3D p1 = new Point3D(x, y, z);
        print("inserisci x e y e z dell secondo punto");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        Point3D p2 = new Point3D(x, y, z);
        print("inserisci x e y e z dell terzo punto");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
        Point3D p3 = new Point3D(x, y, z);

        Plane p = new Plane(p1, p2, p3);

        print(p);
        sc.close();
    }
    
}
