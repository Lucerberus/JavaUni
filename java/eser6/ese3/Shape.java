package eser6.ese3;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled)
    {
        setFilled(filled);
        setColor(color);
    }

    public String getColor()
    {
        return this.color;
    }

    public boolean getFilled()
    {
        return this.filled;
    }
    
    public void setColor(String color)
    {
        this.color=color;
    }

    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }

    public String toString()
    {
        return "color="+color+"\nfilled="+filled+"\n";
    }
}
