package eser10.ese1;

public class StudException extends Exception{
    public StudException()
    {
        super("Trovata un eccezione: ");
    }

    public String toString()
    {
        return getMessage()+"Studente esiste già.";
    }

    public String noStud()
    {
        return getMessage()+"Lo studente selezionato non esiste.";
    }

    public String emptyMap()
    {
        return getMessage()+"non ci sono studenti.";
    }
    
}
