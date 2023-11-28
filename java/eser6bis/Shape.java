package eser6bis;
//classe PADRE con i metodi classici 
public abstract class Shape implements Drawable, Scalable {
    private String color;
    private boolean filled;
    private int id;

    public Shape(int id){
		this(id, "black", true);
	}

    public Shape(int id ,String color, boolean filled)
    {
        setFilled(filled);
        setColor(color);
        setId(id);
    }

    public int getId() 
    {
        return this.id;
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
    public void setId(int id) 
    {
        this.id = id;
    }

    public String toString()
    {
        return "color="+color+"\nfilled="+filled+"\n";
    }
}
