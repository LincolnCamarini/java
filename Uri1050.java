import java.util.Scanner;

public class Uri1050{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int DDD;

        // entrada de dados
        DDD = teclado.nextInt();

        // processamento
        if (DDD == 61) {//DDD de Brasília
            System.out.println("Brasilia");
        }
        else if (DDD == 71) {//DDD de Salvador}
            System.out.println("Salvador");
        }
         else if (DDD == 11) {//DDD de São Paulo}
            System.out.println("Sao Paulo");
        }
         else if (DDD == 21) {//DDD de Rio de Janeiro}
            System.out.println("Rio de Janeiro");
        }
         else if (DDD == 32) {//DDD de Juiz de Fora}
            System.out.println("Juiz de Fora");
        }
         else if (DDD == 19) {//DDD de Campinas}
            System.out.println("Campinas");
        }
        else if (DDD == 27) {//DDD de Vitória}
            System.out.println("Vitoria");
        }
        else if (DDD == 31) {//DDD de Belo Horizonte}
            System.out.println("Belo Horizonte");
        }
        else {System.out.println("DDD nao cadastrado");
        }
   }
}