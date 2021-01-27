import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, mI, hF, mF;
        int tempoI, tempoF, durTotal;
        int hT, mT;
    
        hI = teclado.nextInt();
        hF = teclado.nextInt();
        mI = teclado.nextInt();
        mF = teclado.nextInt();

        // converter para minutos
        tempoI = hI * 60 + mI
        tempoF = hF * 60 + mF

        if (durTotal <=0){
            durTotal = durTotal + 24*60; // somo 24h em minutos para mostrar que o dia "virou"
        }

        hT = durTotal / 60;
        mT = durTotal % 60;

        System.out.println("O JOGO DUROU" + hT)
        }
