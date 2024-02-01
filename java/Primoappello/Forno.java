package Primoappello;


import java.util.Scanner;

public class Forno extends Eletrodomestico
{
    private Integer Temp;
    
    public Forno(Integer id, String modello, Boolean stato, Integer temeperatura)
    {
        super(id, modello, stato);

    }
    public void setTemp(Integer Temp)
    {
        this.Temp=Temp;
    }
    public Integer getTemp()
    {
        return this.Temp;
    }
    public String toString()
    {
        return super.toString()+" Temperatura: "+this.Temp;
    }
    public void pulisci() throws ExceptionsElet //suppongo 1-5 livelli di pulizia
    {   
        int tipo=0;
        if(getStato())
            throw new ExceptionsElet("L'eletrodomestico è acceso");
        else
        {   
            Scanner ino = new Scanner(System.in);
            System.out.println("livelli di pulizia 1-5");
            System.out.print("Inserire il livello  di pulizia: ");
            tipo = ino.nextInt();
            
            if(tipo>0 && tipo<6)
                System.out.println("Avvio Pulizia livello "+tipo+" ...");
            else
                throw new IllegalArgumentException("Hai inserito un parametro illegale");

        }
    }

}
