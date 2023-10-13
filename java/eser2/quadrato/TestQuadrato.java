package eser2.quadrato;
//fun fact stesso codice tramite IDE funziona ma senza no, da errore del tipo: cannot find symbol
public class TestQuadrato {
    public static void main(String[] args)
    {
        Quadrato q =new Quadrato(5);
        //q.lato=5;
        System.out.println("il perimetro del quandrato: "+q.Perimetro());
        System.out.println("il perimetro del quandrato: "+q.Area());

    }
}
