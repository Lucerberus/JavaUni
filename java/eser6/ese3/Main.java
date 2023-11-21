package eser6.ese3;

public class Main {
    public static void print(Object obj)
    {
        System.out.println(obj);
    }
    public static void main(String[] args) {
        Square sq = new Square("violet", true, 3);
        Circle ci = new Circle("blue", false, 9.8);
        Rectangle re = new Rectangle("red", true, 2, 1.5);

        print(sq);
        print(ci);
        print(re);
        print("area del cerchio="+ci.Area()+"\nperimetro="+ci.Perimeter());
        print("area del rettangolo="+re.Area()+"\nperimetro="+re.Perimeter());
        print("area del quadrato="+sq.Area()+"\nperimetro="+sq.Perimeter());
    }
    
}
