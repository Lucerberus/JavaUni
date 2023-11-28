package eser6bis;
//Classe Filgia di RECTANGLE, length=width 
public class Square extends Rectangle {

    public Square(int id,String color, boolean filled, double width)
    {
        super(id, color, filled, width, width);
    }
    
    public void setColor(String color) 
    {    
        super.setColor(color);
    }
    
    public void setFilled(boolean filled) 
    {    
        super.setFilled(filled);
    }

    public void setWidth(double width) 
    {
        super.setWidth(width);
    }

    public String getColor() 
    {   
        return super.getColor();
    }
    
    public boolean getFilled() 
    {    
        return super.getFilled();
    }
    
    public double getWidth() 
    {    
        return super.getWidth();
    }
    
    public double Area()
    {
        return getWidth()*4;
    }

    public double Perimeter()
    {
        return Math.pow(getWidth(),2);
    }

    public String toString() 
    {
        return super.toString();
    }

}
