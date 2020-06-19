import java.util.Scanner;

public class Exercicio2f{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float largura, profundidade,  altura, area;
        System.out.println("Digite o valor da largura do paralelepipedo:");
        largura = teclado.nextFloat();
        System.out.println("Digite o valor da profundidade do paralelepipedo:");
        profundidade = teclado.nextFloat();
        System.out.println("Digite o valor da altura do paralelepipedo:");
        altura = teclado.nextFloat();
        area = altura*profundidade*largura;
        System.out.println("O valor da area eh = " + area);
    }
}