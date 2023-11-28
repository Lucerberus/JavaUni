package eser6bis;

import java.util.ArrayList;

public class GestoreFigure {
    private ArrayList<Circle> circles;
    private ArrayList<Square> squares;
    private ArrayList<Rectangle> rectangles;

    public GestoreFigure()
    {
        circles = new ArrayList<Circle>();
        squares = new ArrayList<Square>();
        rectangles = new ArrayList<Rectangle>();
    }

    public void add(Circle c)
    {
        circles.add(c);
    }

    public void add(Square c)
    {
        squares.add(c);
    }

    public void add(Rectangle c)
    {
        rectangles.add(c);
    }

    public void remove(int id)
    {
        for(int i=0; i<circles.size(); ++i){
			if(id == circles.get(i).getId()){
				System.out.println("Rimuovo circleso");
				circles.remove(i);
				break;
			}
		}
		for(int i=0; i<squares.size(); ++i){
			if(id == squares.get(i).getId()){
				System.out.println("Rimuovo quadrato");
				squares.remove(i);
				break;
			}
		}
		for(int i=0; i<rectangles.size(); ++i){
			if(id == rectangles.get(i).getId()){
				System.out.println("Rimuovo rettangolo");
				rectangles.remove(i);
				break;
			}
		}
    }

    public void draw()
    {
        for(Circle c : circles)
            c.draw();
        for(Rectangle r : rectangles)
            r.draw();
        for(Square s : squares)
            s.draw();
    }
}
