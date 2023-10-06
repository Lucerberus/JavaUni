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

        for(int i=10; i>0; i--)
        {
            if(i%2==0)
                System.out.println(i);
        }
    }
}
