package eser4.ese4;
import java.util.ArrayList;
//ese4 creare un programma iterativo con un menu che permette al utente di iteragire una lista di persone
import java.util.Scanner;
public class ProgInterat {
    public static void print(String str)//dopo un po mi scoccio scrivere system.out.println
    {
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//uso scanner per prendere input
        //variabbili di comodo
        String instring="";
        int eta=0;
        boolean c=true;
        String Nome;
        String Cognome;
        ArrayList <Persona> Lista = new ArrayList<>();
        //menu
        System.out.println("a. Inserire una nuova persona nella lista con dati inseriti dall'utente");
        System.out.println("b. Cercare una persona nella lista in base al nome");
        System.out.println("c. Stampare l'intera lista");
        System.out.println("d. Cancellare l'intera lista");
        System.out.println("e. Esci");
        while(!(instring=scanner.next()).equals("e"))
        {
            
            if(instring.equals("a"))
            {   
                System.out.println("inserisci il nome del utente ");
                Nome=scanner.next();
                System.out.println("inserisci il cognome del utente :");
                Cognome=scanner.next();
                System.out.println("inserisci l'eta del utente: ");
                eta=scanner.nextInt();
                Persona p1=new Persona(Nome, Cognome, eta);//in questo modo si creera un nuovo ogetto p1               
                Lista.add(p1);//e lo aggiungo alla lista
                instring="";//per sicurezza pulisco la stringa di input
                System.out.println("Aggiunto con sucesso");
            }else if(instring.equals("b"))
            {
                System.out.println("inserisci il nome del utente che si vuole cercare :");
                instring=scanner.next();
                for(Persona i : Lista)//scorro la lista 
                {
                    if((i.getNome()).equals(instring))
                    {
                        System.out.println(i.toString());
                        c=false;
                    }
                }
                if(c)//messaggio ci 
                {
                    System.out.println("Non ce un utente con questo nome: "+instring);
                    c=true;
                }
                instring="";
            }else if(instring.equals("c"))
            {   
                print("ecco tutte le persone dentro la Lista");
                for(Persona i:Lista)
                {
                    print(i.toString());
                }
            }else if(instring.equals("d"))
            {
                print("stai per cancellare l'itera lista, sei sicuro?");
                instring=scanner.next();
                if(instring.equals("si"))
                {
                    Lista.clear();
                }
                instring="";
            }
            System.out.println("a. Inserire una nuova persona nella lista con dati inseriti dall'utente");
            System.out.println("b. Cercare una persona nella lista in base al nome");
            System.out.println("c. Stampare l'intera lista");
            System.out.println("d. Cancellare l'intera lista");
            System.out.println("e. Esci");
        }
        scanner.close();
    }
    
}
