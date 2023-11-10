package eser5.ese1;

import java.util.Scanner;

public class UsoPunto {
    public static void print(String str)//mi scoccio scrivere system.out.println
    {
        System.out.println(str);
    }
    public static void main(String[] args) {
        double x, y;
        Scanner input=new Scanner(System.in);
        print("inserire la x del primo punto");
        x=input.nextDouble();
        print("inserire la y del primo punto");
        y=input.nextDouble();
        Punto p1=new Punto(x, y);
        print("inserire la x del secondo punto");
        x=input.nextDouble();
        print("inserire la y del secondo punto");
        y=input.nextDouble();
        Punto p2 = new Punto(x, y);
        if(!p1.equals(p2))// il "!" serve ad invertire il risutlato del metodo equals, perché mi scoccio sistemare il codice...
        {   //qundi se p1 == p2 il metodo restituira vero e con ! lo nego e diventa falso, e cosi al contrario...
            print("la distanza tra i due punti è: "+p1.Distanza(p2));
            print((p1.PuntoMed(p2)).toString());//in pratica tramite p1 uso il metodo PuntoMed e li passo p2
            //si come PuntoMed restituisce un ogetto di tipo Punto gli aplico il metodo toString, che restituisce una stringa
        }else
        {
            print("hai inserito 2 punti uguali quindi è inutile calcolare la distanza e il punto medio");
        }
        input.close();
    }
    
}
