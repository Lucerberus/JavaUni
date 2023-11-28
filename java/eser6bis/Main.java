package eser6bis;

public class Main {
    public static void main(String[] args) 
    {
        GestoreFigure gf = new GestoreFigure();
        Circle x = new Circle(1, "black", false, 2.5);
		gf.add(x);
		gf.add(new Square(2, "blue", true, 8));
		gf.add(new Rectangle(3, "red", false, 3, 4));
		gf.add(new Square(4, "brown", true, 5));
		gf.add(new Circle(5,"red", false,1));

        gf.draw();

		System.out.println("-----------------------");
		gf.remove(2);
		gf.draw();
		
		System.out.println("-----------------------");
		gf.remove(1);
		gf.draw();
    }
    
}
