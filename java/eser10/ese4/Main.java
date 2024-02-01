package eser10.ese4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Persona> list = new ArrayList<>();
        list.add(new Persona(0, "pipppo", "pluto", 15));
        list.add(new Persona(1, "giammarco", "arcibale", 15));
        list.add(new Persona(2, "ipocrate", "cornuto", 15));
        list.add(new Persona(3, "pipo", "conpluto", 15));
        list.add(new Persona(4, "pizzo", "calabro", 15));
        list.add(new Persona(5, "mafia", "banane", 15));
        list.add(new Persona(6, "jeremy", "amio", 15));
        list.add(new Persona(7, "pluto", "ehehehhe", 15));
        list.add(new Persona(8, "u", "a", 15));
        
        System.out.println("\necco la list prima il sort secono cognome");
        for(Persona i:list)
        {
            System.out.print(" "+i.toString()+"\n\n");
        }
        System.out.println("\n\tecco la list dopo il sort");

        Collections.sort(list);
        
        for(Persona i:list)
        {
            System.out.print(" "+i.toString()+"\n\n");
        }

        System.out.println("\n\n\tecco la list prima il sort secodno il nome");
        for(Persona i:list)
        {
            System.out.print(" "+i.toString()+"\n\n");
        }
        System.out.println("\n\tecco la list dopo il sort secondo il nome");

        Collections.sort(list, new CompaNome());

        for(Persona i:list)
        {
            System.out.print(" "+i.toString()+"\n\n");
        }
    }
}
