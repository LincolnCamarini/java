import java.util.Scanner;

public class Uri1004{
    public static void main(String argsg[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, PROD;

        // entrada de dados
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento
        PROD = A * B;

        // saída
        System.out.println("PROD = " + PROD);
        
        }
}
