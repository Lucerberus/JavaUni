package Primoappello;

import java.util.Comparator;

public class CompModello implements Comparator<Eletrodomestico> 
{
    @Override
    public int compare(Eletrodomestico e1, Eletrodomestico e2)
    {
        return (e1.getModello()).compareTo(e2.getModello());
    }    
}