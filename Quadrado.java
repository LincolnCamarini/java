import java.util.Scanner;

public class Quadrado{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double lado, area;

        System.out.println("Digite o valor do lado:");
        lado = teclado.nextDouble();

        area = lado * lado;

        System.out.println("A area do quadrado vale = " + area);

        // e se quiser usar uma restrição no número de casas decimais?

        System.out.printf("A area do quadrado vale = %.4f\n", area);
    }
}