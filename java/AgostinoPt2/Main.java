package AgostinoPt2;



public class Main {
    public static void main(String[] args) {
        // Test delle classi e dei metodi
        GestoreClimatizzatore gestoreClimatizzatore = new GestoreClimatizzatore();
        PompaDiCalore pompaDiCalore = new PompaDiCalore("PD123", "Modello1", 20.0);
        Caldaia caldaia = new Caldaia("C123", "Modello2", 25.0, "gas");
        gestoreClimatizzatore.inserisci(new Caldaia("ac21391","Ariston", 25, "metano"));
        gestoreClimatizzatore.inserisci(new Caldaia("bgas3203","Milano", 35, "carbone"));
        gestoreClimatizzatore.inserisci(new Caldaia("dsnofy832","Ariston", 20, "metano"));
        gestoreClimatizzatore.inserisci(new Caldaia("isory32","Palermo", 20, "GPL"));
        gestoreClimatizzatore.inserisci(new Caldaia("s8ryqw","Ariston", 20, "elettrica"));
        gestoreClimatizzatore.inserisci(new Caldaia("38yqd","Ariston", 0, "metano-bio"));
        gestoreClimatizzatore.inserisci(new PompaDiCalore("gpd", "Napoli", 20.0));
        gestoreClimatizzatore.inserisci(new PompaDiCalore("dsfu", "Ariston", 20.3));
        gestoreClimatizzatore.inserisci(new PompaDiCalore("fucih73", "Milano", 19.3));
        gestoreClimatizzatore.inserisci(pompaDiCalore);
        gestoreClimatizzatore.inserisci(caldaia);
        try {
            gestoreClimatizzatore.inserisci(caldaia);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("\n\nprima stampa:");
        gestoreClimatizzatore.stampaClimatizzatori();

        gestoreClimatizzatore.riduciTemperature();
        System.out.println("\n\n stampa dopo riduzione temperature:");
        gestoreClimatizzatore.stampaClimatizzatori();

        System.out.println("\nprima del aumento della temp "+gestoreClimatizzatore.getClimatizzatore("38yqd"));
        gestoreClimatizzatore.aumentaTemperaturaByID("38yqd");
        System.out.println("\ndopo aumeto della temp"+gestoreClimatizzatore.getClimatizzatore("38yqd"));
        try {
            gestoreClimatizzatore.aumentaTemperaturaByID("0000");
        } catch (Exception e) {
            System.out.println(""+e);
        }
        System.out.println("\necco i modelli ariston:");
        gestoreClimatizzatore.getClimatizzatoriAriston();
    }
}