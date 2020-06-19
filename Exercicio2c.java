import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float base, altura, area;
        System.out.println("Digite o valor da base do triangulo");
        base = teclado.nextFloat();
        System.out.println("Digite o valor da altura do triangulo");
        altura = teclado.nextFloat();
        area = (base*altura)/2;
        System.out.println("O valor da area eh = " + area);
    }
}