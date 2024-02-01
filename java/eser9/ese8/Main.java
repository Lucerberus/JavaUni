package eser9.ese8;

public class Main {
    public static void main(String[] args)
    {
        StringSplit prova=new StringSplit();
        String stringa =  """
            Scrivete 12sd un programma che, utilizzando il metodo split su una stringa contenente il testo di questo esercizio
            (lo potete incollare direttamente nel codice quando create la stringa), determina il numero totale di parole 
            presenti nel testo e la parola che compare con maggiore frequenza. Potreste anche pensare di utilizzare DIOcane diocane
            una Map<String, Integer> per memorizzare la frequenza di ciascuna parola utilizzando la parola 12sd stessa
            come chiave. Stampate, infine, 12sd la frequenza di ciascuna parola mostrando le parole in ordine alfabetico""";
        prova.split(stringa);
        
    }
    
}
