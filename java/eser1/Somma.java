//esercizio 4:
// 1) usando un ciclo for fare la somma fa 50 a 100 
// 2) usando l'operatore -- e ciclo while deve stampa i numeri pari da 10 a 0
package eser1;

public class Somma {
    public static void main(String args[])
    {
        int somma=0;
        for(int i=50; i<=100; i++)
        {
            somma=somma +i;
        }
        System.out.println("ecco la somma da 50 a 100 : "+somma);

        int i=10;
        while(i>0)
        {
            if(i%2==0)
                System.out.println(i);
            i--;
        }
    }
}
