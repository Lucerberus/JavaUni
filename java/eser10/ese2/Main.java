package eser10.ese2;


public class Main {
    public static void main(String[] args) {
        String s = """
            Buongiorno disse gianluca
            sotto un albero di fico.
            Buongiorno disse l'arciduca 
            sotto un albero di pesco
            quel buongiorno dopo una nottata.
                """;
        Stack<String> stack = new Stack<>(0);//passando 0 si fara una lista senza limiti 
        String[] array = s.split(" ");

        for(String i: array)
        {
            if(!i.contains("."))
                stack.push(i);
            else
                break;
        }
        System.out.println(stack.toString());
    }
    
}
