package Agostino;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;

public class Contenitore 
{
    private Map<Integer,Produzione> map;

    public Contenitore()
    {
        map = new HashMap<>();
    }
    
    public void add(Produzione p) throws Eccezioni
    {
        if(map.get(p.getId())==null)
            {
                map.put(p.getId(), p);
            } 
        else
            throw new Eccezioni("Esiste gia un oggetto con questo id!!");
    }

    public void remove(int id) throws Eccezioni
    {
        if(map.isEmpty())
            throw new Eccezioni("La map è vuota, non puoi eliminare niente");
        else if(map.get(id)==null)
            throw new Eccezioni("Non cerano ogetti con questa chiave");
        else
        {
            map.remove(id);
            System.out.println("Eliminato con successo!!");
        }
        
    }
    public void StampaId(int id) throws Eccezioni
    {   
        Produzione p=map.get(id);
        if(p==null)
            throw new Eccezioni("Non ci sono ogetti con questa chiave");
        else
            System.out.println(p.toString());
    }
    public void OrdineProduzione()
    {
        ArrayList<Produzione> list = new ArrayList<>(map.values());
        Collections.sort(list, new CompProd());
        StampaLista(list);
    }
    public void OrdineTitolo()
    {
        ArrayList<Produzione> list = new ArrayList<>(map.values());
        Collections.sort(list, new CompTit());
        StampaLista(list);
    }
    private void StampaLista(ArrayList<Produzione> list)
    {
        for(Produzione p: list)
        {
            System.out.println(p.toString());
        }
    }
    public String toString()
    {   
        String s="";
        for(int i: map.keySet())
        {
            s=s+(map.get(i)).toString()+"\n";
        }
        return s;
    }
}   
