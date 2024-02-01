package eser10.ese1;

import java.util.SortedMap;
import java.util.TreeMap;

public class VotiStud {
    private SortedMap<String, String> map = new TreeMap<>();
    
    public VotiStud(String nome, String voto) throws StudException
    {
        add(nome, voto);
    }
    public VotiStud(){}

    public void add(String nome, String voto) throws StudException
    {
        try {
            if(map.get(nome)==null)
                map.put(nome, voto);
            else
                throw new StudException();
        } catch (StudException e) {
            System.out.println(e.toString());
        }
    }
    public int numeroStud()
    {
        return map.size();
    }
    public void remove(String nome) throws StudException
    {   
        boolean flag = true;
        try {
            if(map.isEmpty())
                throw new StudException();
        } catch (StudException e) {
            System.out.println(e.emptyMap());
            flag= false;
        }
        if(map.remove(nome)==null && flag)
            System.out.println("non esiste questo studente");
    }
    
    public void modify(String nome, String voto) throws StudException
    {
        try {
            if(map.get(nome)==null)
                throw new StudException();
            else
                map.replace(nome, map.get(nome), voto);
        } catch (StudException e) {
            System.out.println(e.noStud());
        }
    }
    @Override
    public String toString()
    {   
        String s="";
        for(String i: map.keySet())
        {
            s=s+i+" "+map.get(i)+"\n";
        }

        return s;
    }
    
}
