import java.util.Scanner;

public class Uri1114{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int SENHA;

        do {
            SENHA = teclado.nextInt();

            if (SENHA == 2002){
                System.out.println("Acesso Permitido");
            }    
            else {System.out.println("Senha Invalida");
            }
        }
            while (SENHA != 2002);
    }
} 