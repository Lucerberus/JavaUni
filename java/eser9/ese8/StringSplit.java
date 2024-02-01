package eser9.ese8;

import java.util.SortedMap;
import java.util.TreeMap;

public class StringSplit 
{
    public void split(String a)
    {
        SortedMap<String, Integer> map =  new TreeMap<>();
        String [] s = a.split(" ");

        for(String i: s)
        {
            if(map.get(i)==null)
                map.put(i, 1);
            else
                map.put(i, map.get(i)+1);
        }
        

        for(String i: map.keySet())
        {
            System.out.println(i+" "+map.get(i));
        }
        System.out.println("\n\n\n" + map.keySet());
    }   
}
