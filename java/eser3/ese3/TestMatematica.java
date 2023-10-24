//package eser3.ese3; // è commentato perche con il terminale mi da errore, pero se si fa con un IDE funziona bene

public class TestMatematica {
    public static void main(String[] args)
    {
        Calcolatrice miaCalcolatrice=new Calcolatrice();
        double[] v1 =miaCalcolatrice.generaArray(3);
        double[] v2 =miaCalcolatrice.generaArray(3);
        double[] v3 =miaCalcolatrice.generaArray(5);
        System.out.println("somma tra v1 e v2:");
        miaCalcolatrice.stampaVettore(miaCalcolatrice.sommaVettori(v1, v2));
        System.out.println("somma tra v1 e v3:");
        miaCalcolatrice.stampaVettore(miaCalcolatrice.sommaVettori(v1, v3));
        System.out.println("concatenazione di v1 e v3:");
        miaCalcolatrice.stampaVettore(miaCalcolatrice.concatenaVettore(v1, v3));
        //matrici
        double[][] m1=miaCalcolatrice.generaMat(3, 5);
        double[][] m2=miaCalcolatrice.generaMat(3, 5);
        double[][] m3=miaCalcolatrice.generaMat(3, 3);
        System.out.println("somma tra m1 e m2:");
        miaCalcolatrice.stampaMat(miaCalcolatrice.sommaMat(m1, m2));
        System.out.println("somma tra m1 e m3:");
        miaCalcolatrice.stampaMat(miaCalcolatrice.sommaMat(m1, m3));
    }
}
