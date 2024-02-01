package ProvaEsame1;

public class Main {
    public static void main(String[] args)
    {
        Contenitore con=new Contenitore();
        con.add(new SmartPhone(1, 123, "peraphone5", 220, "Android"));
        con.add(new SmartPhone(2, 55, "nokia", 12, "Android"));
        con.add(new SmartPhone(3, 200, "iphone1", 24, "IOS"));
        con.add(new SmartPhone(4, 1223, "peraphone4", 220, "Android"));
        con.add(new SmartPhone(5, 1273, "peraphone3", 12, "Android"));
        con.add(new SmartPhone(6, 23, "iphone12", 110, "IOS"));
        con.add(new SmartPhone(7, 12, "peraphone2", 220, "Android"));
        con.add(new SmartPhone(8, 1253, "iphone11", 220, "IOS"));

        System.out.println("ecco il numero di IOS: " +con.ContaIOS());
        System.out.println("ecco il numero di 220v: " +con.Conta220v());

        System.out.println(con.toString());
        
        con.remove(6);

        System.out.println(con.toString());

        con.VisCosto();


    }
    
}
