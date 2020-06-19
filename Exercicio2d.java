import java.util.Scanner;

public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float diagonal1, diagonal2, area;
        System.out.println("Digite o valor da diagonal 1 do losango:");
        diagonal1 = teclado.nextFloat();
        System.out.println("Digite o valor da diagonal 2 do losango:");
        diagonal2 = teclado.nextFloat();
        area = (diagonal1*diagonal2);
        System.out.println("O valor da area eh = " + area);
    }
}