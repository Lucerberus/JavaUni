package eser7.ese3;
import java.util.ArrayList;
//classe che gestisce i voti
public class GestioneVoti 
{
    private ArrayList<Votante> list;//lista dei votanti
    private int[] cantanti;//array dei cantanti

    public GestioneVoti()
    {
        cantanti = new int[15];
        list = new ArrayList<Votante>();
    }
    //qui prima di aggiungere il voto faccio delle verifiche sul come
    public void addVoto(String votante, int Nartista)
    {   
        if(list.isEmpty())//se la lista è vuota
        {
            list.add(new Votante(votante, 1));
            cantanti[Nartista]+=1; 
            System.out.println("voto aggiunto");
        }
        else
        {   //prima controllo se il votante + presente dentro la lista
            int a=2;//flag
            //se si decremento il flag a 1
            for(Votante i: list)
            {
                if((i.getNumero()).equals(votante))
                { 
                    if(i.IncrNvot())//incremento il numero dei voti
                    {
                        System.out.println("voto aggiunto");
                        cantanti[Nartista]+=1; 
                        
                        break;
                    }
                    a=1;
                }

            }
            if(a==2)//se non ho trovato lo aggiungo nella lista
            {
                list.add(new Votante(votante, 1));
                cantanti[Nartista]+=1; 
                System.out.println("votot aggiunto");
            }
        }
    }
    //numero totale dei voti
    public int totVoti()
    {
        int cont=0;
        for(Votante i: list)
        {
            cont+=i.getNvot();
        }
        return cont;
    }
    //vari print
    public String ListaVotanti()
    {
        String s="ecco i votanti: {\n";
        for(Votante i: list)
        {
            s=s+i.toString()+"\n";
        }
        s=s+"}";
        return s;
    }

    public String ClassificaCantanti()
    {
        String s="\nEcco la classifica dei cantanti: ";
        for(int i=0; i<15; i++)
        {
            s=s+"\nCantante "+i+": "+cantanti[i];
        }
        return s;
    }

    public String toString() 
    {
        String s= ListaVotanti();
        s=s+ClassificaCantanti();
        return s;      
    }
}
