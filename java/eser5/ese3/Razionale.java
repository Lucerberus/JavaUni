package eser5.ese3;

public class Razionale {
    private int n;
    private int d;

    public Razionale(int n, int d)
    {
        setD(d);
        setN(n);
    }
    //set
    public void setN(int n)
    {
        this.n=n;
    }
    public void setD(int d)
    {
        this.d=d;
    }
    //get
    public int getN()
    {
        return this.n;
    }
    public int getD()
    {
        return this.d;
    }
    //toString e equals
    public String toString()
    {
        return "numeratore/denominatore: "+this.n+"/"+this.d;
    }
    public boolean equals(Razionale r1)
    {
        if(this.n == r1.getN() && this.d == r1.getD())
            return true;
        else
            return false;
    }
    //operazioni semplici
    public Razionale Somma(Razionale r)
    {   // es  4/5 + 8/9 = (4*9 + 8*5)/9*5
        int den=this.d*r.getD();//qui mi calcolo il denominatore
        int num=this.n*r.getD()+r.getN()*this.d;// qui il numeratore
        Razionale r1= new Razionale(num, den);
        return r1;
    }
    public Razionale Sotrai(Razionale r)
    {   //stessta cosa della somma ma con il meno
        int den=this.d*r.getD();
        int num=this.n*r.getD()-r.getN()*this.d;
        Razionale r1= new Razionale(num, den);
        return r1;
    }
    public Razionale Moltiplica(Razionale r)
    {   //es 4/5 * 8/9 = 4*8/9*5
        int den=this.d*r.getD();
        int num=this.n*r.getN();
        Razionale r1= new Razionale(num, den);
        return r1; 
    }
    public Razionale Dividi(Razionale r)
    {   //es 4/5 / 8/9 = 4/5 * 9/8 = 4*9/5*8
        int den=this.d*r.getN();
        int num=this.n*r.getD();
        Razionale r1= new Razionale(num, den);
        return r1; 
    }
}
