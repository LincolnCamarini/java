import java.util.Scanner;

public class Uri1008{
    public static void main(String argsg[]){
        Scanner teclado = new Scanner(System.in);
        
        int NUMBER, HORAS;
        double VALOR, SALARIO;

        // entrada de dados
        NUMBER = teclado.nextInt();
        HORAS = teclado.nextInt();
        VALOR = teclado.nextDouble();

        // processamento
        SALARIO = HORAS * VALOR;

        // saída
        System.out.printf("NUMBER = %d\n", NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARIO);
        
        }
}