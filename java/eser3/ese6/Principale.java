package eser3.ese6;

public class Principale {
    public static void main(String[] args)
    {
        Persona p1 = new Persona("Ciccio", "hp", 15);

        System.out.println(p1.toString());
        p1.setCognome("Caputo");
        p1.setEta(12);
        System.out.println(p1.toString());

    }
}
