package eser3.ese12;

public class SommaMatrici {
    
    public static void main(String[] args)
    {
        double mat1[][] = new double[3][5];
        double mat2[][] = new double[3][5];
        double som[][] = new double[3][5];

        for(int i=0; i<3; i++)//riempio con numeri randomici le due matrici
        {   
            for(int j=0; j<5; j++)
                {
                    mat1[i][j]=Math.random()*100;
                    mat2[i][j]=Math.random()*100;
                }
        }
        for(int i=0; i<3; i++)//sommo le matrici 
        {
            for(int j=0; j<5;j++)
            {
                som[i][j]=mat1[i][j] + mat2[i][j];
            }
        }
        //visualizzo il risultato
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print(som[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
