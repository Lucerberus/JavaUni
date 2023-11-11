package eser5.ese4;

public class TestData {
    public static void main(String[] args) {
        Data d1 = new Data(36, 2009);
        Data d2 = new Data(8, "Grjdsio", 1934);
        Data d3 = new Data(11, 11, 120);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        System.out.println(d1.equals(d1)+" o "+d1.equals(d1));
        

    }
}
