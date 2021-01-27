import java.util.Scanner;

public class Uri1014{
    public static void main(String argsg[]){
        Scanner teclado = new Scanner(System.in);
        
        int X;
        double Y, TOTAL;

        // entrada de dados
        X = teclado.nextInt();
        Y = teclado.nextDouble();

        // processamento
        
        TOTAL = X / Y;
        
        // saída
        System.out.printf("%.3f km/l\n", TOTAL);
        
        }
}
