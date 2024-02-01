package eser10.ese4;

import java.util.Comparator;

public class CompaNome implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2)
    {
        return (p1.getNome()).compareTo(p2.getNome());
    }
}
