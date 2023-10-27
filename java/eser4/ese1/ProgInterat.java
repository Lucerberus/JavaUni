package eser4.ese1;
//ese1 creare un programma iterativo che ha una blacklist di parole e se l'utente inserisce in input una di quelle parole
//il programma non le stampa.
import java.util.Scanner;
public class ProgInterat {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//uso scanner per prendere inout
        String instring="";
        boolean com=true;//variabile di comodo che uso in caso di ritrovamento della parola inserite dentro la blacklist
        String[] blacklist=new String[]{"alfa","beta", "gamma", "delta", "epsilon", "kappa", "lambda", "sigma", "omega"};
        System.out.println("Digita qualcosa e batti enter, oppure scrivi \"fine\" per terminare il programma"); //un messaggio per l'utente
        while(!(instring=scanner.next()).equals("fine"))
        {
            for(String i:blacklist)//for migliorato per gli array
            {
                if(i.equals(instring))
                {
                    com=false;
                    break;
                }
            }
            if(com)
            {
                System.out.println("Hai digitato: "+instring+"!!!!");
            }
            com=true;
        }
        scanner.close();
    }
    
}
