package eser8.ese2;

import java.util.Scanner;

public class Main {
    public static void print(Object j)// era troppo lungo
    {
        System.out.println(j);
    }
    public static void main(String[] args) {
        boolean cond = true;
        GestoreAbb gestore = new GestoreAbb();
        Scanner input = new Scanner(System.in);
        //dichiaro alcuni clienti di base
        gestore.add(new AbbonatoPremium(5, "franco", "Gioia", 56, 4));
        gestore.add(new Abbonato(2, "francesco", "matera", 20, 3));
        gestore.add(new Abbonato(3, "pippo", "pluto", 10, 10));
        gestore.add(new AbbonatoPremium(8, "Ninja", "Sudoku", 20, 8));
        //una sorta di menu
        while (cond) {
            print("1) inserire AbbonatoPremium");
            print("2) Inserire Abbonato");
            print("3) Pagamento");
            print("4) lista Abbonati");
            print("5) rimozione Abbonato");
            print("6) chiudere il programma");
            //variabbili di comodo
            int comodo=input.nextInt();
            int id=0, eta=0, sconto=0;
            double  totale=0;
            String nome=null, cognome=null;
            switch (comodo) {
                case 1:
                    print("inserire l'id del'AbbonatoPremium");
                    id=input.nextInt();
                    print("inserire il nome dell'abbonatoPremium");
                    nome=input.next();
                    print("Inserire il cognome di "+nome);
                    cognome= input.next();
                    print("inserire l'età di "+nome+" "+cognome);
                    eta=input.nextInt();
                    print("inserire lo sconto dell'abbonatoPremium");
                    sconto=input.nextInt();

                    print("inserimento dentro il db");
                    gestore.add(new AbbonatoPremium(id, nome, cognome, eta, sconto));
                    break;
                case 2:
                    print("inserire l'id del'Abbonato");
                    id=input.nextInt();
                    print("inserire il nome dell'abbonato");
                    nome=input.next();
                    print("Inserire il cognome di "+nome);
                    cognome= input.next();
                    print("inserire l'età di "+nome+" "+cognome);
                    eta=input.nextInt();
                    print("inserire lo sconto dell'abbonato");
                    sconto=input.nextInt();

                    print("inserimento dentro il db");
                    gestore.add(new Abbonato(id, nome, cognome, eta, sconto));
                    break;
                case 3:
                    do{
                    print("inserire il totale da pagare, se si vuole uscire dal'operazione digitare: -1");
                    totale= input.nextDouble();
                    if(totale==-1)
                        break;
                    print("inserire l'id del cliente");
                    id=input.nextInt();
                    totale=gestore.Acquista(totale, id);
                    }while (totale == -1);
                    if(totale != -1)
                        print("ECCO IL PREZZO DA PAGARE: "+totale);
                    break;
                case 4:
                    print(gestore.toString());
                    break;
                case 5:
                    print("inserire l'id dell'abbonato da eliminare");
                    id=input.nextInt();
                    gestore.RemAbbonato(id);
                case 6:
                    print("stai chidendo il programma, addio");
                    cond=false;
                default:
                    print("hai inserito un numero non valido,riprova");
                    break;
            }
        }


        input.close();
    }
}
