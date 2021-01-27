import java.util.Scanner;

public class Uri1052{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int valor;

        // entrada de dados
        valor = teclado.nextInt();

        // processamento
        if (valor == 1) {//janeiro
            System.out.println("January");
        }
        else if (valor == 2) {// não é 1, pode ser 2, 3, 4, 5, 6, 7, 8 , 9 , 10, 11, 12
            System.out.println("February");
        }
        else if (valor == 3) {// não é 1, 2, pode ser 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
            System.out.println("March");
        }
        else if (valor == 4) {// não é 1, 2, 3 pode ser 4, 5, 6, 7, 8, 9, 10, 11, 12}
            System.out.println("April");
        }
        else if (valor == 5) {// não é 1, 2, 3, 4 pode ser 5, 6, 7, 8, 9, 10, 11, 12}
            System.out.println("May");
        }
         else if (valor == 6) {// não é 1, 2, 3, 4, 5 pode ser 6, 7, 8, 9, 10, 11, 12}
            System.out.println("June");
        }
        else if (valor == 7) {// não é 1, 2, 3, 4, 5, 6 pode ser 7, 8, 9, 10, 11, 12}
            System.out.println("July");
        }
        else if (valor == 8) {// não é 1, 2, 3, 4, 5, 6, 7 pode ser 8, 9, 10, 11, 12}
            System.out.println("August");
        }
        else if (valor == 9) {// não é 1, 2, 3, 4, 5, 6, 7, 8 pode ser 9, 10, 11, 12}
            System.out.println("September");
        }
        else if (valor == 10) {// não é 1, 2, 3, 4, 5, 6, 7, 8 ,9 pode ser 10, 11, 12}
            System.out.println("October");
        }
        else if (valor == 11) {// não é 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 pode ser 11, 12}
            System.out.println("November");
        }
        else if (valor == 12) {// não é 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 pode ser 12}
            System.out.println("December");
        }
    }
}