package Agostino;

import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("""
            1) rimovi id
            2) elenco per produtture
            3) elenco per titolo
            4) chiudere il programma
            """);
    }
    public static void main(String[] args) throws Eccezioni
    {
        Contenitore cont = new Contenitore();
        Scanner in= new Scanner(System.in);
        Produzione p1= null, p2 = null;
        SerieTV s1=null, s2=null;

        try {
            p1=new Produzione(1, "pizzo", "napoli");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
        try {
            p2=new Produzione(2, "malto", "roma");
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
        try {
            s2=new SerieTV(3, "calabria", "bari", 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
        try {
            s1=new SerieTV(4, "piacenza", "palermo", -1);
        }
        catch (Eccezioni e) {
            System.out.println(e);
        }
        try {
            cont.add(p1);
            cont.add(p2);
            //cont.add(s1);
            cont.add(s2);
        } catch (Eccezioni e) {
            System.out.println(e);
        }

        System.out.println(cont.toString());
        cont.StampaId(2);

        try {
            cont.StampaId(-1);
        } catch (Eccezioni e) {
            System.out.println(e);
        }
        boolean var=true;
        while (var) 
        {   
            int id=0;
            menu();
            int sel= in.nextInt();

            switch (sel) {
                case 1:
                    System.out.println("inserisci ");
                    id=in.nextInt();
                    try{
                        cont.remove(id);
                    }catch(Eccezioni e)
                    {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    cont.OrdineProduzione();
                    break;
                case 3:
                    cont.OrdineTitolo();
                    break;
                case 4:
                    var=false;
                    System.out.println("chiusura programma");
                default:
                    System.out.println("hai sbaglito a digitare riprova");
                    break;
            }

        }
        in.close();
    }
    
}
