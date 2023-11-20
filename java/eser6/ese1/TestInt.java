package eser6.ese1;

public class TestInt {
    public static void main(String[] args) {
        IntegerSet v1 =new IntegerSet();
        IntegerSet v2 =new IntegerSet();
        
        for(int i=0; i<100; i=i+3)
        {
            v1.insertInt(i);
        }
        for(int i=0; i<100; i=i+5)
        {
            v2.insertInt(i);
        }
        System.out.println("v1 e poi v2");
        System.out.println(v1);
        System.out.println(v2.toString());

        IntegerSet v3 = v1.intersectionOfIntegerSet(v2);
        IntegerSet v4 = v2.unionOfIntegerSet(v1);
        System.out.println("v3 e poi v4");
        System.out.println(v3);
        System.out.println(v4.toString());
    }
    
}
