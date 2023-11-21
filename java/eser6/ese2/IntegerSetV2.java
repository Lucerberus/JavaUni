package eser6.ese2;

import java.util.ArrayList;

public class IntegerSetV2{

    private ArrayList<Integer> vint;
    //costruttore
    public IntegerSetV2()
    {
        vint = new ArrayList<>();
    }

    public int getInt(int pos) //get
    {
        return vint.get(pos);
    }

    public int getLenght()// get della grandezza della lista
    {
        return vint.size();
    }

    public void insertInt(int val)//sarebbe il set
    {
        vint.add(val);
    }

    public void deleteInt(int pos)//delete
    {
        vint.remove(pos);
    }
    
    public IntegerSetV2 unionOfIntegerSet(IntegerSetV2 v2)//unione, copio elementi del oggetto chiamante
    {                                                    //poi quelli di v2
        IntegerSetV2 v3= new IntegerSetV2();
        for(int i=0; i<this.getLenght(); i++)
        {
            v3.insertInt(this.getInt(i));
        }
        for(int i=0; i<v2.getLenght(); i++)
        {
            v3.insertInt(v2.getInt(i));
        }
        return v3;
    }

    public IntegerSetV2 intersectionOfIntegerSet(IntegerSetV2 v2)//intersezione: tratto le liste come se fosse una matrice
    {                                                           //controllo se 2 elementi sono uguali, e quindi lo aggiungo al nuovo insieme
        IntegerSetV2 v3= new IntegerSetV2();
        for(int i=0; i<this.getLenght(); i++)
        {
            for(int j=0; j<v2.getLenght(); j++)
            {
                if(v2.getInt(j) == this.getInt(i))
                    v3.insertInt(v2.getInt(j));
            }
        }
        return v3;
    }

    public String toString()//fatto da me
    {
        String s="Insime={";
        for(int i=0; i<this.getLenght(); i++)
        {
            s=s+""+this.getInt(i)+" "; 
        }
        s=s+"}";
        return s;
    }

    public String toStrings()//sfruttando il metodo della classe ArrayList
    {
        return vint.toString();
    }
    
}
