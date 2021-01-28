import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Alcool=0;
        int Gasolina=0;
        int Diesel=0;

        int codigo = teclado.nextInt();

            while (codigo != 4) {
                switch (codigo) {
                caso 1:
                    Alcool++;
                    break;
                caso 2:
                    Gasolina++;
                    break;
                caso 3:
                    Diesel++;
                    break;
                }
                codigo = teclado.nextInt();
            }
            System.out.println("MUITO OBRIGADO");
        }
    }