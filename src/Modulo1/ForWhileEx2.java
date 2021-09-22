package Modulo1;/*
_ Imprima todos o números pares até 100 utilizando o laço FOR.
_ Imprima todos os números primos até 150 utilizando o laço FOR.

 */


/*
public class Modulo1.ForWhileEx2 {

    public static void main(String args []){
        for(int cont = 0; cont < 101; cont++){
            int result = cont % 2;
           if (result == 0)
            System.out.printf("%d\n",cont );
        }

    }
}
 */

public class ForWhileEx2 {
    public static void main(String args []){
        int end = 150;

        for(int i = 2; i < end; i++){
            boolean primo = true;
            for( int p = 2; p < i; p++ ){
                if(i % p == 0){
                    primo = false;
                }
            }
            if(primo){
                System.out.println( i + " é primo" );
            }
        }
    }
}