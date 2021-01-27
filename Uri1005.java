import java.util.Scanner;

public class Uri1005{
    public static void main(String argsg[]){
        Scanner teclado = new Scanner(System.in);
        double A, B, MEDIA;

        // entrada de dados
        A = teclado.nextDouble();
        B = teclado.nextDouble();

        // processamento
        MEDIA = ((A*3.5f) + (B*7.5f))/11;

        // saída
        System.out.printf("MEDIA = %.5f\n", MEDIA);
        
        }
}