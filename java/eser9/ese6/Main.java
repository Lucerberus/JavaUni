package eser9.ese6;

import java.util.EmptyStackException;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		Stack<String> stack = new Stack<String>(3);
        //      /\                        /\
        //      qui si puoò cambiare il tipo di dati

        boolean exit = false;
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
                case 2://               per evitare sconvenienti bisognerebbe fare il cast
                    try {//                 \/   
                        String el_rem = (String) stack.pop();
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
		
		
		input.close();
	}
}
