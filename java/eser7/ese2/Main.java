package eser7.ese2;



public class Main {
    public static void main(String[] args) 
    {
        StudenteTriennale st1 = new StudenteTriennale("pippo", "pluto", 85, "via delle cappelle 89", 468, "21/02/999", "Ing INF", 96, "liceo artistico delle mammelle");
        Professore p1 =new Professore("Pomello", "Arturo", 99, "via della parrochia", 8964684, "02/9/1855", "lava per terra", "strada", -9);

        System.out.println(st1.toString());
        System.out.println(p1);
        st1.AggiuntaCFU(190);
        st1.AggiuntaCFU(50);
        System.out.println(st1.toString());

    }
    
}
