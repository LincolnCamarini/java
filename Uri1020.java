import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int idade, resto, ano, mes, dia;
        
        // entrada de dados
        idade = teclado.nextInt();
       
        // processamento
        
        ano = (idade/365);
        mes = (ano%365)/30;
        dia = (mes%30);
        
        // saída
        System.out.println("ano +", ano);
        System.out.println("mes +", mes);
        System.out.println("dia +", dia);
        
        }
}