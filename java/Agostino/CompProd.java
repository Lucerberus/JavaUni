package Agostino;
import java.util.Comparator;
public class CompProd implements Comparator<Produzione> 
{
    public int compare(Produzione p1, Produzione p2)
    {
        return (p1.getProd()).compareTo(p2.getProd());
    }    
}
