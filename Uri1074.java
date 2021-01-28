import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, VALOR;

        N = teclado.nextInt();

                
        for (int cont=1; cont <= N; cont++){
            VALOR = teclado.nextInt();

            if (VALOR %2 == 0 && VALOR > 0){
                System.out.println ("EVEN POSITIVE");
            }
            else if (VALOR %2 !=0 && VALOR > 0){
                System.out.println ("ODD POSITIVE");    
            }
            else if (VALOR %2 == 0 && VALOR < 0){
                System.out.println ("EVEN NEGATIVE");
            }
            else if (VALOR %2 !=0 && VALOR < 0){
                System.out.println ("ODD NEGATIVE");
            }
            else if (VALOR == 0){
                System.out.println ("NULL");
            }
        }
    }
}