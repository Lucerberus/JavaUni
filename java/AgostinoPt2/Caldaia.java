package AgostinoPt2;

public class Caldaia extends Climatizzatore {
    private String tipo;

    public Caldaia(String ID, String modello, double temperatura, String tipo) {
        super(ID, modello, temperatura);
        setTipo(tipo);
    }

    @Override
    public void aumenta() {
        setTemperatura(getTemperatura()+0.5);
    }

    @Override
    public void riduci() {
        setTemperatura(getTemperatura()-0.5);
    }
    @Override
    public int hashCode() {
        return this.getID().hashCode() + this.getModello().hashCode() + this.tipo.hashCode();
    }
    // Metodi get e set per il tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+" tipo: "+tipo;
    }
   
}
