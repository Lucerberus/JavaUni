package eser10.ese1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws StudException {
        VotiStud voti = new VotiStud();
        Scanner Input = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Inserire un nuovo studente e il suo voto");
            System.out.println("2. Rimuovere uno studente");
            System.out.println("3. Modificare il voto di uno studente");
            System.out.println("4. Stampare tutti i voti degli studenti");
            System.out.println("5. Uscire");

            System.out.print("Scelta: ");
            int scelta = Input.nextInt();
            Input.nextLine();  // Consuma il newline residuo

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome dello studente: ");
                    String nome = Input.nextLine();
                    System.out.print("Inserisci il voto dello studente: ");
                    String voto = Input.nextLine();
                    voti.add(nome, voto);
                    break;
                case 2:
                    System.out.print("Inserisci il nome dello studente da rimuovere: ");
                    String nomeRimuovere = Input.nextLine();
                    voti.remove(nomeRimuovere);
                    break;
                case 3:
                    System.out.print("Inserisci il nome dello studente di cui modificare il voto: ");
                    String nomeModifica = Input.nextLine();
                    System.out.print("Inserisci il voto dello studente di cui modificare il voto: ");
                    String votoModifica = Input.nextLine();
                    voti.modify(nomeModifica, votoModifica);
                    break;
                case 4:
                    System.out.println("Elenco voti degli studenti:"+voti.toString());
                    break;
                case 5:
                    System.out.println("Uscita dal programma.");
                    Input.close();
                    return;
                default:
                    System.out.println("Scelta non valida. Riprova.");
            }
        }


    }
}
