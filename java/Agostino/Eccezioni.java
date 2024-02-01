package Agostino;

public class Eccezioni extends Exception 
{
    public Eccezioni(String s)
    {
        super("C'è stata un eccezione: "+s);
    }   
}
