package eser4.ese2;
//ese2 usando la classe persona creata nell'esercitazione precedente, creare una lista di persone e svolgere alcune operazioni con la lista
import java.util.ArrayList;

public class Principale {
    public static void main(String[] args)
    {
        ArrayList <Persona> Lista = new ArrayList<>(); 
        Persona p1=new Persona("Pippo", "Pluto", 15);
        Persona p2=new Persona("Topolino", "Micky", 12);
        Persona p3=new Persona("Minnie", "Mouse", 8);
        Lista.add(p1);
        Lista.add(p2);
        Lista.add(p3);

        for(Persona i:Lista)
        {
            System.out.println(i.toString());
        }
        System.out.println((Lista.get(1)).getCognome());
        Lista.remove(2);
        System.out.println("la grandezza della lista dopo la rimozione di un elemento:"+Lista.size());
        Lista.clear();
        System.out.println("la grandezza della lista dopo aver eseguito il clear:"+Lista.size());
    }
    
}
