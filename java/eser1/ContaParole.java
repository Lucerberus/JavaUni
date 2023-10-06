package eser1;

public class ContaParole {
    public static void main(String args[])
    {   
        String c=args[0];
        for(int i=1; i<args.length; i++)
        {
            if(c.equals(args[i]))
                System.out.println("hai inserito 2 parole uguali di seguito");
            
            c=args[i];
        }
        
    }
    
}
