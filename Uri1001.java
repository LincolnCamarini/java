import java.util.Scanner;

public class Uri1001{
    public static void main(String argsg[]){
        Scanner teclado = new Scanner(System.in);
        int A, B, X;

        // entrada de dados
        A = teclado.nextInt();
        B = teclado.nextInt();

        // processamento
        X = A + B;

        // saída
        System.out.println("X = " +X);
    }
}
