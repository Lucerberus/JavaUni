package AgostinoPt2;

public class PompaDiCalore extends Climatizzatore {
    public PompaDiCalore(String ID, String modello, double temperatura) {
        super(ID, modello, temperatura);
    }

    @Override
    public void aumenta() {
        setTemperatura(getTemperatura()+1);
    }

    @Override
    public void riduci() {
        setTemperatura(getTemperatura()-1);
    }
    @Override
    public int hashCode() {
        return (this.getID()).hashCode() + (this.getModello()).hashCode();
    }

    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
    public boolean equals(PompaDiCalore p) {
        if(this.getID().equals(p.getID()) && this.getModello().equals(p.getModello()) && this.getTemperatura() == p.getTemperatura())
            return true;
        else
            return false;
    }

    
}
