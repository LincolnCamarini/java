import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float x;
        float y;
        
        // entrada de dados
        x = teclado.nextFloat();
        y = teclado.nextFloat();

        // processamento
        if (x == 0.0 && y == 0.0) {//ponto de origem
            System.out.println ("Origem");
        }
        else if (x < 0.0 && y < 0.0) {//Quadrante Q3
            System.out.println("Q3");
        }
        else if (x > 0.0 && y < 0.0) {//Quadrante Q4
            System.out.println("Q4");
        }
        else if (x < 0.0 && y > 0.0) {//Quadrante Q2
            System.out.println("Q1");
        }
        else if (x > 0.0 && y > 0.0) {//Quadrante Q1
            System.out.println("Q2");
        }
        else if (x == 0.0 && (y < 0.0 || y > 0.0)) {//Eixo Y
            System.out.println("Eixo Y");
        }
        else if ((x > 0.0 || x < 0.0) && y == 0.0) {//Eixo X
            System.out.println("Eixo X");
        
        // else if (x==0 && y != 0)

        }
    }
}
