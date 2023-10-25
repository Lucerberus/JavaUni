package eser3.ese5;  //è commentato perche con il terminale mi da errore, pero se si fa con un IDE funziona bene
//ese5: creazione classe dado con un medoto lancia che restituisce un intero tra 1 e 6
import java.util.Random;

public class Dado {
    public int Lancia()
    {
        Random ran=new Random();
        int dado=ran.nextInt(7);//tramite questo metodo della classe random posso avere i numeri randomici da 0 a 6
        if(dado==0)
            dado=1;// si come 0 non è presente sul dado, lo faro diventare 1, si in questo modo c'è la possibilità che esca più volte 1
        return dado; 
    }
    
}
