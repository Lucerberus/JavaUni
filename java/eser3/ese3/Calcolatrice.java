package eser3.ese3; // è commentato perche con il terminale mi da errore, pero se si fa con un IDE funziona bene

public class Calcolatrice {
    public double[] generaArray(int l)//a) 
    {
        double[] array=new double[l];
        for(int i=0; i<l; i++)
        {
            array[i]=Math.random()*1000;
        }
        return array;
    }
    public double[] sommaVettori(double[] a, double[] b)//b)
    {
        if(a.length == b.length)
            {
                double[] somma=new double[a.length];
                for(int i=0; i<a.length; i++)
                {
                    somma[i]=a[i]+b[i];
                }
                return somma;
            }
        else
        {
            System.out.println("Non è possibile effeturare la somma tra 2 vettori,\nhanno le dimensioni diverse\nverra restituito il primo vettore passato");
            return a;
        } 
    }
    public double[] concatenaVettore(double[] a, double[] b)//c)
    {
        double[] c=new double[a.length+b.length];
        int i=0;
        for(;i<a.length; i++)//funziona, funziona anche cosi: for(;;)<-- è un ciclo infinito che non fa niente...
        {
            c[i]=a[i];
        }        
        for(int j=0;i<b.length+a.length; j++)
        {   
            c[i]=b[j];
            i++;
        }
        //in questo modo riesco a salvare la i, e continuare la concatenazione degli array.
        return c;
    }
    public void stampaVettore(double[] a)//d)
    {
        System.out.print("a["+a.length+"]={");
        for(double i: a)
        {
            System.out.print(i+" ");
        }
        System.out.println("}");
    }
    public double[][] generaMat(int r, int c)//e)
    {
        double[][] mat=new double[r][c];
        for(int i=0; i<r; i++)
        {   
            for(int j=0; j<c; j++)
                {
                    mat[i][j]=Math.random()*100;
                }
        }
        return mat;
    }
    public double[][] sommaMat(double[][] a, double[][] b)
    {
        if(a.length == b.length && a[0].length==b[0].length)//controllo se le righe e le colonne delle matrici coincidono
        {
            double[][] somma=new double[a.length][a[0].length];
            for(int i=0; i<a.length; i++)//sommo le matrici 
        
            for(int j=0; j<a[0].length;j++)
            {
                somma[i][j]=a[i][j] + b[i][j];
            }
            return somma;
        }
        else
        {
            System.out.println("Non è possibile effeturare la somma tra le matrici,\nhanno le dimensioni diverse\nverra restituita la prima matrice passata");
            return a;
        }

    }
    public void stampaMat(double[][] a)
    {
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[0].length; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
