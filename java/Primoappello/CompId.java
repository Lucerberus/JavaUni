package Primoappello;

import java.util.Comparator;

public class CompId implements Comparator<Eletrodomestico> 
{
    @Override
    public int compare(Eletrodomestico e1, Eletrodomestico e2)
    {
        return Integer.compare(e1.getId(), e2.getId());
    }    
}
