package ProvaEsame1;

public class SmartPhone extends Eletronica{
    private String os;

    public SmartPhone(int id, int costo, String desc, int tensione, String os)
    {
        super(id, costo, desc, tensione);
        setOs(os);
    }
    public void setOs(String os) 
    {
        this.os = os;
    }
    public String getOs() 
    {
        return os;
    }

    public String toString()
    {
        return super.toString()+" os:"+os;
    }

}