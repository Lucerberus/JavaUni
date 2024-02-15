package AgostinoPt2;

public abstract class Climatizzatore implements Riscaldamento {
    private String ID;
    private String modello;
    private double temperatura;

    public Climatizzatore(String ID, String modello, double temperatura) {
        this.ID = ID;
        this.modello = modello;
        this.temperatura = temperatura;
    }

    // Metodi get e set
    public String getID() {
        return ID;
    }

    public String getModello() {
        return modello;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "ID: "+ID+" Modello: "+modello+" Temperatura: "+temperatura;
    }
}
