package eser6bis;
//classe Figlia di SHAPE,aggiunge 1 parametro, radius , Area e Perimetro
public class Circle extends Shape {
    private double radius;

    public Circle(int id, String color, boolean filled, double radius)
    {
        super(id,color, filled);
        setRadius(radius);
    }

    public void setColor(String color) 
    {
        super.setColor(color);
    }

    public void setFilled(boolean filled) 
    {
        super.setFilled(filled);
    }
    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    public String getColor() 
    {
        return super.getColor();
    }
 
    public boolean getFilled() 
    {
        return super.getFilled();
    }
        
    public double getRadius()
    {
        return this.radius;
    }

    public double Area()
    {
        return Math.PI*Math.pow(this.radius, 2);
    }

    public double Perimeter()
    {
        return 2*Math.PI*this.radius;
        
    }
    
    public String toString()
    {
        return super.toString()+"radius="+this.radius+"\n";
    }

    @Override
    public void draw() 
    {
        System.out.println(toString());
    }

    public void scale(double factor)
    {
        this.radius =this.radius*factor; 
    }
}
