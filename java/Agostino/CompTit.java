package Agostino;

import java.util.Comparator;

public class CompTit implements Comparator<Produzione> 
{
    public int compare(Produzione p1, Produzione p2)
    {
        return (p1.getTitolo()).compareTo(p2.getTitolo());
    }    
}
