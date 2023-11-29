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
            System.out.println("l'id dell'abbonato non è valido");
    }
    public void add(AbbonatoPremium p)
    {   
        boolean com=true;   
        for(AbbonatoPremium i : Abp)
        {
            if(i.getId() == p.getId())
                com=false;
        }
        if(com)
            Abp.add(p);
        else
            System.out.println("l'id dell'abbonato non è valido");
    }

    public double Acquista(double importo, int id)
    {   
        boolean abpb=true, abnb=true;//due FLAG che mi permettono di capire in quale lista è presente l'id dell'abbonato
        for(Abbonato i : Abn)//se lo trovo qui escludo il controllo della lista abbonati premium
        {
            if(i.getId() == id)
                abpb=false;
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
            System.out.println("questo abbonato non esiste");
            return 0;
        }
        else if(abnb)
        {   //aplico lo sconto perl'abbonato comune
            for(Abbonato i : Abn)
            {
                if(i.getId() == id)
                    {
                       
                        double sconto = (importo/100)*i.getSconto();
                        importo = importo-sconto; 
                    }
            }
        }else if(abpb)
        {   //aplico lo sconto per abbonato premium
            for(AbbonatoPremium i : Abp)
            {
                if(i.getId() == id)
                    {  
                        if(i.ifSconto(importo))
                        {   //aplico lo sconto + bonus
                            double sconto = (importo/100)*i.getSconto();
                            importo = importo-sconto-5;   
                        }else
                        {   //aplico lo sconto normale
                            double sconto = (importo/100)*i.getSconto();
                            importo = importo-sconto; 
                        }
                        
                    }
            }
        }
        return importo;
    }

    public Abbonato getAbbonato(int id)
    {
        for(Abbonato i : Abn)
        {
            if(i.getId() ==  id)
                return i;
        }
        System.out.println("non esiste nessun abbonato con id = "+id);
        return null;
    }
    
    public AbbonatoPremium getAbbonatoPremium(int id)
    {   
        for(AbbonatoPremium i : Abp)
        {
            if(i.getId() == id)
                return i;
        }
        System.out.println("non esiste nessun abbonato premium con id = "+id);
        return null;
    }

    public int getLengthAN()
    {
        return Abn.size();
    }

    public int getLengthAB()//numero degli abbonati totale
    {
        return Abp.size();
    }



}