package eser1;

public class Parser {
    public static void main(String args[])
    {
        for(int i=0; i<args.length; i++)
        {
            try{
                int num=Integer.parseInt(args[i]);
                System.out.println("il numero convertito è :"+num);
            }
            catch(Exception e)
            {
                System.out.println("l'argometno ("+args[i]+") non si può convertire in intero");
            }


        }
    }
    
    
}
