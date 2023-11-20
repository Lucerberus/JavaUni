package eser6.ese1;

import java.util.Arrays;
//valori tra 0 e 99
public class IntegerSet {
    private boolean [] vint;
    //costruttore
    public IntegerSet()
    {
        vint =new boolean[100];
        Arrays.fill(vint, false);//serve per riempire l'array con false
    }

    public boolean getInt(int val) //get
    {
        if(val>-1 && val<100)
        {
            return vint[val];
        }
        else
        {
            System.out.println("hai inserito un valore fuori dal insieme, sarà returnato false");
            return false;
        }
    }

    public void insertInt(int val)//sarebbe il set
    {
        if(val>-1 && val<100)
        {
            vint[val]=true;
        }
        else
        {
            System.out.println("hai inserito un valore fuori dal insieme");
        }
    }

    public void deleteInt(int val)//delete
    {
        if(val>-1 && val<100)
        {
            vint[val]=false;
        }
        else
        {
            System.out.println("hai inserito un valore fuori dal insieme");
        }
    }
    private boolean IsPresent(int i, IntegerSet v1, IntegerSet v2, boolean andor)//la funzione mi serve solamente per unione e intersezione
    {                                                                           // controlla se il valore passato è prensente negli insiemi
        if(andor)                                                              // il parametro andor serve differenziare i 2 casi
        {
            if(v1.getInt(i) && v2.getInt(i))//intersezione, prensente in entrambi
                return true;
            else
                return false;
        }
        else
        {
            if(v1.getInt(i) || v2.getInt(i))//unione, prensente in uno dei 2
                return true;
            else
                return false;
        }
        
    }

    public IntegerSet unionOfIntegerSet(IntegerSet v2)
    {
        IntegerSet v3= new IntegerSet();
        for(int i=0; i<100; i++)
        {
            if(IsPresent(i, this, v2, false))
            {
                v3.insertInt(i);
            }
        }

        return v3;
    }

    public IntegerSet intersectionOfIntegerSet(IntegerSet v2)
    {
        IntegerSet v3= new IntegerSet();
        for(int i=0; i<100; i++)
        {
            if(IsPresent(i, this, v2, true))
            {
                v3.insertInt(i);
            }
        }

        return v3;
    }

    public String toString()
    {
        String s="Insime={";
        for(int i=0; i<100; i++)
        {
            if(this.getInt(i))
                s=s+""+i+" ";
            
        }
        s=s+"}";
        return s;
    }
}
