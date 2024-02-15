package AgostinoPt2;

import java.util.HashSet;
import java.util.Set;

public class GestoreClimatizzatore {
    private Set<Climatizzatore> set;

    public GestoreClimatizzatore()
    {
        set = new HashSet<>();
    }

    public void inserisci(Climatizzatore c) {
        if (!set.contains(c)) {
            set.add(c);
        } else {
            throw new IllegalArgumentException("Il climatizzatore è già presente nel set.");
        }
    }

    public void stampaClimatizzatori() {
        for (Climatizzatore c : set) {
            System.out.println(c.toString());
        }
    }

    public void getClimatizzatoriAriston() {
        for(Climatizzatore c : set)
        {
            if(c.getModello().equals("Ariston"))
                System.out.println(c.toString());
        }
    }
    public Climatizzatore getClimatizzatore(String ID) {
        for(Climatizzatore c : set)
        {
            if(c.getID().equals(ID))
                return c;
        }
        throw new IllegalArgumentException("Nessun climatizzatore con l'ID specificato trovato.");
    }

    public void riduciTemperature() {
        for (Climatizzatore c : set) {
            c.riduci();
        }
    }

    public void aumentaTemperaturaByID(String ID) {
        for (Climatizzatore c : set) {
            if (c.getID().equals(ID)) {
                c.aumenta();
                return;
            }
        }
        throw new IllegalArgumentException("Nessun climatizzatore con l'ID specificato trovato.");
    }
}
