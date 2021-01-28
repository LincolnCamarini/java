import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;
        valor = teclado.nextInt();

            if (valor %2 ==0){
            valor++;
        }
        for (int impar =1; impar <=6; impar++){
            System.out.println(valor);
            valor+=2;
        }
    }
}