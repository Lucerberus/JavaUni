package eser5.ese4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
public class Data {
    private int g;
    private int m;
    private int a;
    private String mm;
    //1) gg aaaa
    public Data(int g, int a)
    {   
        setG(g);
        setA(a);
    }
    //2) gg/mm/aa
    public Data(int g, int m, int a)
    {
        setG(g);
        setM2(m);
        setA2(a);
    }
    public void setM2(int m)//verifico se il mese è reale, altrimenti imposto il mese attuale
    {
        if((1<m && m<12))
        {
            this.m=m;
        }else{
            System.out.println("hai passato un valore fuori range dei mesi, 1-12, verra impostato mese attuale");
            LocalDate oggi = LocalDate.now();//prendo la data di oggi
            this.m = oggi.getMonthValue();//prendo il valore del mese, 1-12
        }
    }
    public void setA2(int a)//verifico se l'anno è nel formato giusto
    {
        
        if((0<=a && a<100))
        {
            this.a=a;
        }else{
            System.out.println("hai passato un valore fuori range dei anni, 0-99, verra impostato anno attuale");
            LocalDate oggi = LocalDate.now();
            this.a = (oggi.getYear() % 100); //prendo l'anno attuale  e tramite il modulo mi ricavo le ultime 2 cifre
        }
    }
    //classici metodi get
    public int getM2() 
    {
        return this.m;
    }
    public int getA2()
    {
        return this.a;
    }
    //3) gg/MMMM/aaaa
    public Data(int g, String mm, int a)
    {
        setG(g);
        setMM(mm);
        setA(a);
    }
    public void setMM(String mm)
    {   //mi creo una lista con i nomi dei mesi cosi da verificare se il mese passato è un mese veramente esistente
        ArrayList <String> Lista = new ArrayList<>(Arrays.asList("Gennaio","Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre", "Ottobre", "Novembre","Dicembre"));
        if(Lista.contains(mm))
        {
            this.mm=mm;
        }else{
            //altrimenti sempre tramite la lista e la data attuale, prendo il numero del mese, e tramite metodo get() delle liste
            //ottengo il nome del mese corrente
            System.out.println("hai passato un mese inesistente, verra impostato il mese corrente");
            LocalDate oggi = LocalDate.now();
            this.mm=Lista.get(oggi.getMonthValue()-1);
        }
    }
    //classico metodo get
    public String getMM()
    {
        return this.mm;
    }
    //metodi universali:
    public void setG(int g)//controllo se il giorno è valido, non controllo se per es: è il mese di febbraio, o il massimo di quel mese è 30
    {
        if((g>0 && g<32))
        {
            this.g=g;
        }else{
            System.out.println("hai passato un valore fuori range dei giorni, 1-31, verra impostato giorno attuale");
            LocalDate oggi = LocalDate.now();
            this.g = oggi.getDayOfMonth();
        }
    }
    public void setA(int a)//controllo se l'anno inserito è un anno valido altrimenti imposto l'anno attuale
    {   
        LocalDate oggi = LocalDate.now();
        if((a>0 && a<oggi.getYear()))
        {
            this.a=a;
        }else{
            System.out.println("hai passato un valore fuori range dei anni, 0-"+oggi.getYear()+", verra impostato anno attuale");
            this.a = oggi.getYear();
        }
    }
    //classici metodi get
    public int getG()
    {
        return this.g;
    }
    public int getA()
    {
        return this.a;
    }
    //to string
    public String toString()
    {   
        if(this.mm == null && this.m==0)
        {
            return "giorno/anno:\t "+this.g+" / "+this.a;
        }
        else if(this.mm == null)
        {
            return "giorno/mese/anno:\t "+this.g+" / "+this.m+" / "+this.a;
        }
        else
        {
            return "giorno/MESE/anno: \t"+this.g+" / "+this.mm+" / "+this.a;
        }
    }
    //allora per fare un equals a dovere cioè che mi permetta di conforntare i tre ogetti bisognerebbe fare delle cose complicate...
    //quindi confrontero solo il secondo tipo di data
    public boolean equals(Data d)
    {
        if(this.g == d.getG() && this.m==d.getM2() && this.a == d.getA2())
            return true;
        else
            return false;
    }
}
