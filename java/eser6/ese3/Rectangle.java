package eser6.ese3;

public class Rectangle extends Shape {
    private double width;
    private double lenght;

    public Rectangle(String color, boolean filled, double width, double lenght)
    {
        super(color, filled);
        setLenght(lenght);
        setWidth(width);
    }

    public void setLenght(double lenght) 
    {
        this.lenght = lenght;
    }
    
    public void setWidth(double width) 
    {
        this.width = width;
    }

    public void setColor(String color) 
    {
        super.setColor(color);
    }
    public void setFilled(boolean filled) 
    {
        super.setFilled(filled);
    }

    public double getLenght() 
    {
        return this.lenght;
    }
    public double getWidth() 
    {
        return this.width;
    }
    
    public String getColor() 
    {
        return super.getColor();
    }
    
    public boolean getFilled() 
    { 
        return super.getFilled();
    }

    public double Area()
    {
        return this.lenght*this.width;
    }

    public double Perimeter()
    {
        return 2*this.lenght+2*this.width;
    }
    
    public String toString() 
    {
        return super.toString()+"width="+this.width+"\nlenght="+this.lenght+"\n";
    }
}
