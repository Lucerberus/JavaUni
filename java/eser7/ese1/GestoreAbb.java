package eser7.ese1;

import java.util.ArrayList;

public class GestoreAbb
{
    private ArrayList<Abbonato> Abn;
    private ArrayList<AbbonatoPremium> Abp;

    public GestoreAbb()
    {
        Abn = new ArrayList<Abbonato>();
        Abp = new ArrayList<AbbonatoPremium>();
    }

    public void add(Abbonato n)
    {
        boolean com=true;   
        for(Abbonato i : Abn)
        {
            if(i.getId() == n.getId())
                com=false;
        }
        if(com)
            Abn.add(n);
        else
            System.out.println("l'id dell'abbonato non è valido")
    }
    public void add(AbbonatoPremium p)
    {   
        boolean com=true;   
        for(Abbonato i : Abp)
        {
            if(i.getId() == p.getId())
                com=false;
        }
        if(com)
            Abp.add(p);
        else
            System.out.println("l'id dell'abbonato non è valido")
    }

    public double Acquista(double importo, int id)
    {   
        boolean abpb=true, abnb=true;
        for(Abbonato i : Abn)
        {
            if(i.getId() == id)
                abpb=false
        } 
        if(abpb)
        {   
            for(Abbonato i : Abp)
            {
                if(i.getId() == id)
                    abnb=false;
            }
        }
        if(abnb == false && abpb == false)
        {
            System.out.println("questo untente non esiste");
        }
        else if(abnb)
        {
            for(Abbonato i : Abn)
            {
                if(i.getId() == id)
                    {
                       double sconto = (importo/100)*i.getSconto():
                       double importo = importo-sconto; 
                    }
            }
        }

        return importo;
    }
}