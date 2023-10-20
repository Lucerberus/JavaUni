package eser2;
//ese1: una sorta di calcolatrice, giusto per praticare le conversioni tra tipi di dati
public class calcolatrice {
    public static void main(String args[]){
        int a=5, b=3;
        float r1=(float)a/(float)b;
        System.out.println("5/3="+r1);

        char c='a';
        short s=5000;
        int r2=c*s;
        System.out.println("'a'*5000="+r2);
        
        int i=6;
        float f=3.14F;
        float r3 = i+f;
        System.out.println("6+3.14f="+r3);

        float r4=r1-r2-r3;
        System.out.println("1.666666... - 485000- 9.14="+r4);
    }
    
}
