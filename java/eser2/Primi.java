package eser2;
//ese 6: trovare i numeri primi minori di 100
public class Primi {
    public static void main(String[] args){
        System.out.println("Numeri primi minori di 100");
        for (int i = 2; i < 100; i++) {
            if (primo(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean primo(int num) {
        if (num == 2) {     //controllo se è 2 
            return true;
        }
        if (num % 2 == 0) { //controllo se il num è divisibile per 2, allora non è un primo 
            return false;
        }

        int sqrt = (int) Math.sqrt(num);//prendo la radice quandra del num
        for (int i = 3; i <= sqrt; i += 2) { //e controllo se il num è divisibile per qualsiasi numero tra 3 e la radice quadrata del num
            if (num % i == 0) {
                return false;
            }
        }//se arrivo qui di base il numero è primo
        return true;
    }
    
}
