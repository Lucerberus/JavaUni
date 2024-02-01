package ProvaEsame1;

public abstract class Eletronica extends Prodotto {
    private int tensione;

    public Eletronica(int id, int costo, String desc, int tensione) {
        super(id, costo, desc);
        setTensione(tensione);
    }

    public void setTensione(int tensione)
    {   
        switch (tensione) {
            case 12:
                this.tensione = tensione;
                break;
            case 24:
                this.tensione = tensione;
                break;
            case 110:
                this.tensione = tensione;
                break;
            case 220:
                this.tensione = tensione;
                break;
        
            default:
                throw new IllegalArgumentException("Tensione non r");
                
        } 
    }

    public int getTensione()
    {
        return tensione;
    }

    public String toString()
    {
        return super.toString()+" tensione dell'alimentatore: "+tensione+"V";
    }
    
}
