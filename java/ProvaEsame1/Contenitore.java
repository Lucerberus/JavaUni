package ProvaEsame1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contenitore {
    private List<Prodotto> list;
    
    public Contenitore()
    {
        list = new ArrayList<>();
    }

    public void add(Prodotto p)
    {
        list.add(p);
    }

    public void remove(int id)
    {
        for(Prodotto p: list)
        {
            if(p.getId()==id)
            {
                list.remove(p);
                break;
            }  

        }
    }
    public int Conta220v()
    {
        int Conta220v=0;
        for(Prodotto p: list)
        {
            if(p instanceof Eletronica)
            {
                Eletronica p2 = (Eletronica) p;
                if(p2.getTensione()==220)
                    Conta220v++;
            }
        }
        return Conta220v;
    }

    public int ContaIOS()
    {
        int ContaIOS=0;
        for(Prodotto p: list)
        {
            if(p instanceof SmartPhone)
            {
                SmartPhone p2 = (SmartPhone) p;
                if((p2.getOs()).equals("IOS"))
                    ContaIOS++;
            }
        }
        return ContaIOS;
    }

    public void VisCosto()
    {
        Collections.sort(list);
        System.out.println(toString());
    }

    public String toString()
    {
        String s=" ";
        for(Prodotto i:list)
        {
            s=s+i.toString()+"\n";
        }
        return s;
    }

}
