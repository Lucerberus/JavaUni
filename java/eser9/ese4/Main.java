package eser9.ese4;
//qui vieni svolto esercizio 4 e 5
import java.util.EmptyStackException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		Stack stack = new Stack(3);
        Stack stack2 = new Stack(3);
        stack.push("hello");
        stack2.push("hello");
        stack.push("hello");
        stack2.push("hello");
        boolean exit = true;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Stampa Stack");
            System.out.println("4. Verifica se vuoto");
            System.out.println("5. Verifica se pieno");
            System.out.println("6. Esci");
            System.out.print("Scelta: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Inserisci elemento da push: ");
                    String element = input.next();
					try {
						stack.push(element);
					} catch (Exception e) {
						System.err.println(e);
					}
                    break;
                case 2:
                    try {
                        String el_rem = stack.pop();
                        System.out.println("Elemento rimosso: " + el_rem);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack vuoto, impossibile rimuovere elemento.");
                    }
                    break;
                case 3:
                    System.out.println(stack);
                    break;
                case 4:
                    System.out.println("Lo stack è vuoto? " + stack.isEmpty());
                    break;
                case 5:
                    System.out.println("Lo stack è pieno? " + stack.isFull());
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Scelta non valida.");
            }
        }
		if(stack.equals(stack2))
            System.out.println("si");
        else
            System.out.println("no");
		
		input.close();
	}
}
