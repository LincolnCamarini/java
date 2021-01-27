import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario;
        float reajuste;
        float Novosal;
        float percent;
                
        // entrada de dados
        salario = teclado.nextFloat();
                
        // processamento
        if (salario >= 0.00 && salario <= 400.00) {//reajuste 15%
            reajuste = salario * 0.15f;
            Novosal = reajuste + salario;
            percent = 0.15f * 100.00f;
                    System.out.printf("Novo salario: %.2f\n" , Novosal);
                    System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
                    System.out.printf("Em percentual: %.0f %%\n" , percent);
        }
        else if (salario >= 400.01 && salario <= 800.00) {//reajuste 12%
            reajuste = salario * 0.12f;
            Novosal = reajuste + salario;
            percent = 0.12f * 100.00f;
                    System.out.printf("Novo salario: %.2f\n" , Novosal);
                    System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
                    System.out.printf("Em percentual: %.0f %%\n" , percent);
        }
        else if (salario >= 800.01 && salario <= 1200.00) {//reajuste 10%
            reajuste = salario * 0.10f;
            Novosal = reajuste + salario;
            percent = 0.10f * 100.00f;
                    System.out.printf("Novo salario: %.2f\n" , Novosal);
                    System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
                    System.out.printf("Em percentual: %.0f %%\n" , percent);
        }
        else if (salario >= 1200.01 && salario <= 2000.00) {//reajuste 7%
            reajuste = salario * 0.07f;
            Novosal = reajuste + salario;
            percent = 0.07f * 100.00f;
                    System.out.printf("Novo salario: %.2f\n" , Novosal);
                    System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
                    System.out.printf("Em percentual: %.0f %%\n" , percent);
        }
        else if (salario >= 2000.00) {//reajuste 4%
            reajuste = salario * 0.04f;
            Novosal = reajuste + salario;
            percent = 0.04f * 100.00f;
                    System.out.printf("Novo salario: %.2f\n" , Novosal);
                    System.out.printf("Reajuste ganho: %.2f\n" , reajuste);
                    System.out.printf("Em percentual: %.0f %%\n" , percent);
        }
    }
}