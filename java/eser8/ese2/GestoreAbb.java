package eser8.ese2;

import java.util.ArrayList;

public class GestoreAbb
{
    private ArrayList<Abbonato> Ab;

    public GestoreAbb()
    {
        Ab = new ArrayList<Abbonato>();
        
    }

    public void add(Abbonato n)
    {
        boolean com=true;   
        for(Abbonato i : Ab)
        {
            if(i.getId() == n.getId())
                com=false;
        }
        if(com)
            Ab.add(n);
        else
            System.out.println("l'id dell'abbonato non è valido");
    }
    public void add(AbbonatoPremium n)
    {
        boolean com=true;   
        for(Abbonato i : Ab)
        {
            if(i.getId() == n.getId())
                com=false;
        }
        if(com)
            Ab.add(n);
        else
            System.out.println("l'id dell'abbonato non è valido");
    }

    public double Acquista(double importo, int id)
    {   
        double sconto;
        for(Abbonato i : Ab)
        {
            if(i.getId() == id)
                if(i instanceof AbbonatoPremium)
                    if(i.ifSconto(importo))
                    {   //aplico lo sconto + bonus
                        sconto = (importo/100)*i.getSconto();
                        importo = importo-sconto-5;   
                    }else
                    {   //aplico lo sconto normale
                        sconto = (importo/100)*i.getSconto();
                        importo = importo-sconto; 
                    }
                else
                    {
                        sconto = (importo/100)*i.getSconto();
                        importo = importo-sconto; 
                    }
        }

        return importo;
    }
    //qui ci sono vari metodi che potreberò essere utili
    public Abbonato getAbbonato(int id)
    {
        for(Abbonato i : Ab)
        {
            if(i.getId() ==  id)
                return i;
        }
        System.out.println("non esiste nessun abbonato con id = "+id);
        return null;
    }
    
    public int getLengthAN()
    {
        return Ab.size();
    }

  
    //metodi che servono puramente per il main
    public void RemAbbonato(int id)
    {
        for(Abbonato i : Ab)
        {
            if(i.getId() ==  id)
            {   
                Ab.remove(i);
                break;
            }
        }
    }
    
    // classico to string
    public String toString()
    {
        String s="ecco gli Abbonati {\n ";
        for(Abbonato i: Ab)
        {
            s=s+i.toString()+"\n";
        }
        
        return s+" }";
    }


}