import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int tempo, velocidade;
        double distancia, consumo;

        // entrada de dados
        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();
        
        // processamento
        distancia = tempo * velocidade;
        consumo = distancia / 12;

        System.out.printf("%.3f\n", consumo);
           
        }
}