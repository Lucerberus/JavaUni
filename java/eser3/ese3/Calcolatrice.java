package eser3.ese3;

public class Calcolatrice {
    public double[] generaArray(int l)
    {
        double[] array=new double[l];
        for(int i=0; i<l; i++)
        {
            array[i]=Math.random()*1000;
        }
        return array;
    }
    
}
