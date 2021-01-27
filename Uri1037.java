import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor;
                
        // entrada de dados
        valor = teclado.nextFloat();
        
        // processamento
        if (valor >= 0 && valor <= 25) {
            System.out.println ("Intervalo [0,25]");
        }
        else if (valor >= 50 && valor <= 75) {
            System.out.println ("Intervalo [50,75]");
        }
        else if (valor >= 75 && valor <= 100) {
            System.out.println ("Intervalo [50,75]");
        }
        else{
            System.out.println("Fora de intervalor");
        }
    }
}