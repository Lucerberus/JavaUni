package eser7.ese3;
import java.util.Scanner;
//main, con il classico menu
public class Main 
{
    public static void print(Object o)
    {
        System.out.println(o);
    }
    public static void main(String[] args) 
    {   
        GestioneVoti g = new GestioneVoti();
        Scanner input =new Scanner(System.in);
        int t=10;
        while(t>=0)
        {
            print("1) nuovo voto");
            print("2) totali voti ricevuti");
            print("3) classifica dei cantantiì");
            print("4) lista dei votanti");
            print("5) stampa tutto");
            print("-1) chiudi il programma");

            t=input.nextInt();
            
            switch (t) {
                case 1:
                    print("inserire il numero del votante");
                    String num;
                    num=input.next();
                    print("inserire il numero del cantante");
                    int nCantante;
                    nCantante=input.nextInt();
                    g.addVoto(num, nCantante);
                    break;
                case 2:
                    print("ecco il numero totale dei voti: "+g.totVoti());
                    break;
                case 3:
                    print(g.ClassificaCantanti());
                    break;
                case 4:
                    print(g.ListaVotanti());
                    break;
                case 5:
                    print(g.toString());
                    break;
                case -1:
                    print("stai chiudento il programma");
                    break;
                default:
                    print("ha sbagliato a digitare, riprova");
                    t=50;
                    break;
            }
            
        }
        input.close();
    }
}
