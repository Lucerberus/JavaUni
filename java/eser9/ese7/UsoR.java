package eser9.ese7;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsoR {
    public static void print(Object o)//mi scoccio scrivere system.out.println
    {
        System.out.println(o);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Razionale> lista = new ArrayList<>();
        lista.add(new Razionale(1, 2));
        lista.add(new Razionale(45, 5));
        lista.add(new Razionale(7, 2));
        lista.add(new Razionale(90, 190));
        lista.add(new Razionale(0, 2));
        lista.add(new Razionale(11, 232));
        lista.add(new Razionale(3, 2));
        lista.add(new Razionale(65, 999));
        lista.add(new Razionale(3, 22));
        lista.add(new Razionale(188, 2));
        System.out.println("\necco la lista prima il sort");
        for(Razionale i:lista)
        {
            System.out.print(" "+i);
        }
        System.out.println("\necco la lista dopo il sort");

        Collections.sort(lista);
        
        for(Razionale i:lista)
        {
            System.out.print(" "+i);
        }

        System.out.println("\n\necco la lista prima il sort secodno il numeratore");
        for(Razionale i:lista)
        {
            System.out.print(" "+i);
        }
        System.out.println("\necco la lista dopo il sort secondo il numeratore");

        Collections.sort(lista, new CompNum());

        for(Razionale i:lista)
        {
            System.out.print(" "+i);
        }

        System.out.println("\n\necco la lista prima il sort secodno il denominatore");
        for(Razionale i:lista)
        {
            System.out.print(" "+i);
        }
        System.out.println("\necco la lista dopo il sort secondo il denominatore");

        Collections.sort(lista, new ComDem());

        for(Razionale i:lista)
        {
            System.out.print(" "+i);
        }
        in.close();
    }
    
}
