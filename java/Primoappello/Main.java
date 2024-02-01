package Primoappello;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main {
    public static void menu()
    {
        System.out.println("""
            1)Inserire un nuovo forno
            2)Inserire una nuova macchina del caffé
            3)Pulire un elettrodomestico per ID
            4)Accendere o spegnere un elettrodomestico per ID
            5)Cancellare per id un elettrodomestico
            6)Ordinare per ID
            7)Ordinare per Modello
            8)Stampare la lista dove verranno memorizzati gli elettrodomestici
            9)Uscire dal programma
            """);

    }
    public static void main(String[] args) throws ExceptionsElet 
    {
        Scanner in = new Scanner(System.in);
        List<Eletrodomestico> list = new ArrayList<>();
        int scelta=-1;
        boolean var=false;
        while (var) 
        {   
            in.nextLine();



            Integer id=0; 
            String modello="";
            Boolean stato=false;
            Integer AcTemp=0;//unica variabbile per livello acqua e temperatura
            Boolean flag=true;
            menu();
            scelta=in.nextInt();
            
            switch (scelta) {
                case 1:
                    System.out.println("inserire l'id del forno");
                    id=in.nextInt();
                    System.out.println("inserire il modello del forno");
                    modello=in.next();
                    System.out.println("inserire lo stato del forno");
                    stato=in.nextBoolean();
                    System.out.println("inserire la temperatura del forno");
                    AcTemp=in.nextInt();

                    for(Eletrodomestico p: list)
                    {
                        if(p.getId() == id)
                        {
                            flag=false;
                            break;
                        }
                    }
                    if(flag)
                    {
                        list.add(new Forno(id, modello, stato, AcTemp));
                        System.out.println("Forno aggiunto con il successo");
                    }else{
                        System.out.println("Id è gia occupato, riprovare");
                    }
                    break;
                case 2:
                    System.out.println("inserire l'id della nuova macchina del caffé");
                    id=in.nextInt();
                    System.out.println("inserire il modello della nuova macchina del caffé");
                    modello=in.next();
                    System.out.println("inserire lo stato della nuova macchina del caffé");
                    stato=in.nextBoolean();
                    System.out.println("inserire il livello dell'acqua della nuova macchina del caffé");
                    AcTemp=in.nextInt();

                    for(Eletrodomestico p: list)
                    {
                        if(p.getId() == id)
                        {
                            flag=false;
                            break;
                        }
                    }
                    if(flag)
                    {
                        list.add(new Macchina_Caffe(id, modello, stato, AcTemp));
                        System.out.println("la macchina del caffé aggiunta con il successo");
                    }else{
                        System.out.println("Id è gia occupato, riprovare");
                    }
                    break;
                case 3:
                    System.out.println("inserire l'id della macchina da pulire ");
                    id=in.nextInt();
                    try {
                        for(Eletrodomestico p: list)
                        {
                            if(p.getId() ==id)
                            {
                                p.pulisci();
                                flag=true;
                                break;
                            }
                        }
                    } catch (Exception e) 
                    {
                        System.err.println(e);
                        flag=true;
                    }
                    
                    if(!flag)
                        System.out.println("hai inserito un id non valido, riprova");
                    break;
                case 4:
                    System.out.println("inserire l'id della macchina da accendere/spengere ");
                    id=in.nextInt();
                    for(Eletrodomestico p: list)
                    {
                        if(p.getId() ==id)
                        {
                            p.AccendiSpegni();
                            flag=false;
                            break;
                        }
                    }
                    if(!flag)
                        System.out.println("hai inserito un id non valido, riprova");
                    break;
                case 5:
                    System.out.println("inserire l'id della macchina da eliminare ");
                    id=in.nextInt();
                    for(Eletrodomestico p: list)
                    {
                        if(p.getId() ==id)
                        {
                            list.remove(p);
                            flag=false;
                            break;
                        }
                    }
                    if(!flag)
                        System.out.println("hai inserito un id non valido, riprova");
                    break;
                case 6:
                    Collections.sort(list, new CompId());
                    System.out.println("lista ordinata per id");
                    break;
                case 7:
                    Collections.sort(list, new CompModello());
                    System.out.println("lista ordinata per Modello");
                    break;
                case 8:
                    String s="";
                    for(Eletrodomestico p: list)
                    {
                        s=s+p.toString()+"\n";
                    }
                    System.out.println(s);
                    break;
                case 9:
                    System.out.println("hai scelto la chiusura del programma, tutti i dati inseriti verrano cancellati!!!");
                    var=false;
                    break;
                default:
                    System.out.println("hai inserito un numero fuori dal menu, riprova");
                    break;
            }
        }
        in.close();
    }

}
