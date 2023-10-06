//ese5: consiste nel creare un programma che riceve input tramite gli argomenti d'avvio, conta quanti sono, e stampa quelli pari
package eser1;

public class Contatore {
    public static void main(String agrs[])
    {   

        System.out.println("ci sono "+agrs.length+" argomenti");
        System.out.println("ecco gli argomenti di posto pari");
        for(int i=0; i<agrs.length; i++)
        {
            if(i%2==0)
                System.out.println(agrs[i]);
        }
    }
    
}
