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
