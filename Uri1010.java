import java.util.Scanner;

public class Uri1010{
    public static void main(String argsg[]){
        Scanner teclado = new Scanner(System.in);
        
        int CODIGO, QUANTIDADE;
        double VALOR, TOTAL;

        // entrada de dados
        CODIGO = teclado.nextInt(); QUANTIDADE = teclado.nextInt(); VALOR = teclado.nextDouble();
        TOTAL = QUANTIDADE * VALOR;
        CODIGO = teclado.nextInt(); QUANTIDADE = teclado.nextInt(); VALOR = teclado.nextDouble();
        TOTAL = TOTAL + QUANTIDADE * VALOR;

        // saída
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", TOTAL);
        
        }
}