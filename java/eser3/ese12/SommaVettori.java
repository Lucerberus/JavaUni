package eser3.ese12;
//ese1: dati due vettori double, fornire in output la somma dei vettori.
public class SommaVettori {
    public static void main(String[] args)
    {
        double vettore1[] = new double[10];
        double vettore2[] = new double[10];
        int somma[] = new int[10];

        for(int i=0; i<10; i++)//riempio con numeri randomici i due array
        {
            vettore1[i]=Math.random()*1000;
            vettore2[i]=Math.random()*1000;
        }
        for(int i=0; i<10; i++)//sommo i vettori
        {
            somma[i]=(int) vettore1[i] + (int) vettore2[i];
        }
        //visualizzo il risultato
        System.out.print("Somma[10]={");
        for(int i: somma)
        {
            System.out.print(i+" ");
        }
        System.out.println("}");
    }
    
}
