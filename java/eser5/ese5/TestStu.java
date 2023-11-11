package eser5.ese5;

public class TestStu {
    public static void print(String str)//mi scoccio scrivere system.out.println
    {
        System.out.println(str);
    }
    public static void main(String[] args) {
        Studente s1 = new Studente("Franco", "Franco", new Data(98, "Giugno", 103), 0763170);

        print(""+s1.toString());

    }
    
}
