import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N;
        N = teclado.nextInt();
        
        for (int count=2; count <= N; count+=2){
            System.out.println(count+ "^2 = " +count * count );
            
        }
    }
}