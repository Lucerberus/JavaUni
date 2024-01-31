package eser9.ese2;

import java.util.Scanner;

public class UsoR {
    public static void print(Object o)//mi scoccio scrivere system.out.println
    {
        System.out.println(o);
    }
    public static void main(String[] args) {
        int n, d;
        Razionale r1, r2;
        Scanner in=new Scanner(System.in);
        print("inserire il num del primo elemento: ");
        n=in.nextInt();
        print("inserire il den del primo elemento: ");
        d=in.nextInt();
        try {
            r1=new Razionale(n, d);
        } catch (Exception e) {
            r1=null;
            print(e);
        }
        
        print("inserire il num del secondo elemento: ");
        n=in.nextInt();
        print("inserire il den del secondo elemento: ");
        d=in.nextInt();
        try {
            r2=new Razionale(n, d);
        } catch (Exception e) {
            r2=null;
        }
        if(r1 != null && r2 != null)
        {
            print((r1.Somma(r2)).toString());
            print((r1.Sotrai(r2)).toString());
            print((r1.Moltiplica(r2)).toString());
            print((r1.Dividi(r2)).toString());
        }else
            print("entrambi elemenenti non esistono");

        in.close();
    }
    
}
