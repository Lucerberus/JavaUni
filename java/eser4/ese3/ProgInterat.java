package eser4.ese3;
//ese1 creare un programma iterativo che ha una blacklist di parole e se l'utente inserisce in input una di quelle parole
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class ProgInterat {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//uso scanner per prendere input
        String instring="";//                      ⇊ serve ad inizializzare la lista tramite un array
        ArrayList <String> Lista = new ArrayList<>(Arrays.asList("alfa","beta", "gamma", "delta", "epsilon", "kappa", "lambda", "sigma", "omega"));
        System.out.println("Digita qualcosa e batti enter, oppure scrivi \"fine\" per terminare il programma"); //un messaggio per l'utente
        while(!(instring=scanner.next()).equals("fine"))
        {
            if(!Lista.contains(instring))
            {
                System.out.println("Hai digitato: "+instring+"!!!!");
            } 
        }
        scanner.close();
    }
    
}
