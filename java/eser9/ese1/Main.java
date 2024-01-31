package eser9.ese1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[] array = new double[5];
        for(int i=0;i<5; i++)
        {   
            
            try{
                System.out.print("inserire un numero double: ");
                array[i]=input.nextDouble();
            }
            catch(InputMismatchException e){
                input.nextLine();//per pulire il buffer dell'input
                System.out.println("errore nell'inserimento del numero");
                System.err.println(e);
            }
        }
        String s="ecco l'arrayt dei double: {";
        for(double i:array)
        {
            s=s+" "+i;
        }
        s=s+" }";
        System.out.println(s);
        input.close();
    }

}
