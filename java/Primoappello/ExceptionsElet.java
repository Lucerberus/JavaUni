package Primoappello;

public class ExceptionsElet extends Exception 
{
    public ExceptionsElet(String s)
    {
        super("C'è stata un eccezione:"+s);
    }    
}
