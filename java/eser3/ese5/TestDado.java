package eser3.ese5; // è commentato perche con il terminale mi da errore, pero se si fa con un IDE funziona bene
//ese5: classe testdado con il metodo main
public class TestDado {
    public static void main(String[] args)
    {
        Dado d1=new Dado();
        Dado d2=new Dado();
        int com[] = new int[2]; //array di comodo
        int array[] = new int[13];//array dove metterò il numero delle volte che esce un risultato
        int j=1;
        for(int i=0; i<50; i++)
        {   
            com[0]=d1.Lancia();//in questo modo, mi salvo il risulato per dopo
            com[1]=d2.Lancia();
            if(com[0]==com[1])
            {
                System.out.println(j+") è uscito il 12");
                j++;
            }
            switch(com[0]+com[1])//extra: vedo quante volte è uscito un determinato numero
            {
                case 2: array[2]++;
                        break;
                case 3: array[3]++;
                        break;
                case 4: array[4]++;
                        break;
                case 5: array[5]++;
                        break;
                case 6: array[6]++;
                        break;
                case 7: array[7]++;
                        break;
                case 8: array[8]++;
                        break;
                case 9: array[9]++;
                        break;
                case 10: array[10]++;
                        break;
                case 11: array[11]++;
                        break;
                case 12: array[12]++;
                        break;
            }
        
        }
        System.out.println("numeri usciti tot volte:");
        for(int i=2; i<13; i++)
        {
            System.out.println(i+") "+array[i]);
        }
    }
    
}
