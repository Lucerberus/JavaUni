package eser7.ese3;
//classe votante che contiene info sul numero e quante volte ha votato
public class Votante {
    private String numero;
    private int nvot;

    public Votante(String numero, int nvot)
    {
        setNumero(numero);
        setNvot(nvot);
    }

    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    public String getNumero()
    {
        return this.numero;
    }
    public void setNvot(int nvot)
    {
        this.nvot=nvot;
    }
    public int getNvot()
    {
        return this.nvot;
    }
    public boolean IncrNvot()//verifico se il votante abbia superato il limite dei voti
    {
        if(this.nvot+1 > 5)
        {
            System.out.println("questo numero non può più votare");
            return false;
        }
        else
        {
            this.nvot+=1;
            return true;
        }
    }

    public String toString()
    {
        return "[tel: "+getNumero()+"\tNumero di Voti: "+getNvot()+"]";
    }
}