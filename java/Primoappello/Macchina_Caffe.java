package Primoappello;

import java.util.IllegalFormatException;
import java.util.Scanner;

public class Macchina_Caffe extends Eletrodomestico 
{
    private Integer LvL_acqua;

    public Macchina_Caffe(Integer id, String modello, Boolean stato, Integer LvL_acqua)
    {
        super(id, modello, stato);
        setLVL(LvL_acqua);
    }

    public void setLVL(Integer LvL_acqua)
    {
        this.LvL_acqua=LvL_acqua;
    }
    public Integer getLvL()
    {
        return this.LvL_acqua;
    }

    public String toString()
    {
        return super.toString()+" lvl dell'acqua: "+this.LvL_acqua;
    }

    @Override
    public void pulisci() throws ExceptionsElet //1 decalcificazione, 2 standard
    {
        int tipo=0;
        if(getStato())
            throw new ExceptionsElet("L'eletrodomestico è acceso");
        else
        {   try
            {
                Scanner in = new Scanner(System.in);
                System.out.println("1)decalcificazione\n2)standard");
                System.out.print("Inserire il tipo di pulizia: ");
                tipo = in.nextInt();
                
            }catch(IllegalFormatException e)
            {   
                System.err.println(e);
            }
            
            switch (tipo) {
                case 1:
                    System.out.println("Avvio Decalcificazione...");
                    break;
                case 2:
                    System.out.println("Avvio Pulizia Standard...");
                    break;
                default:
                    throw new IllegalArgumentException("Hai inserito un parametro illegale");
            }
        }
    }
}
