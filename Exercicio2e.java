import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float base_maior, base_menor,  altura,area;
        System.out.println("Digite o valor da base maior do trapezio:");
        base_maior = teclado.nextFloat();
        System.out.println("Digite o valor da base menor do trapezio:");
        base_menor = teclado.nextFloat();
        System.out.println("Digite o valor da altura do trapezio:");
        altura = teclado.nextFloat();
        area = (base_maior+base_menor)*altura/2;
        System.out.println("O valor da area eh = " + area);
    }
}