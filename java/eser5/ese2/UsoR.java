package eser5.ese2;

import java.util.Scanner;

public class UsoR {
    public static void print(String str)//mi scoccio scrivere system.out.println
    {
        System.out.println(str);
    }
    public static void main(String[] args) {
        int n, d;
        Scanner in=new Scanner(System.in);
        print("inserire il num del primo elemento: ");
        n=in.nextInt();
        print("inserire il den del primo elemento: ");
        d=in.nextInt();
        Razionale r1=new Razionale(n, d);
        print("inserire il num del secondo elemento: ");
        n=in.nextInt();
        print("inserire il den del secondo elemento: ");
        d=in.nextInt();
        Razionale r2=new Razionale(n, d);

        print((r1.Somma(r2)).toString());
        print((r1.Sotrai(r2)).toString());
        print((r1.Moltiplica(r2)).toString());
        print((r1.Dividi(r2)).toString());
        in.close();
    }
    
}
