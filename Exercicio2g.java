import java.util.Scanner;

public class Exercicio2g{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float lado, area;
        System.out.println("Digite o valor do lado do cubo:");
        lado = teclado.nextFloat();
        area = lado*lado*lado;
        System.out.println("O valor da area eh = " + area);
    }
}