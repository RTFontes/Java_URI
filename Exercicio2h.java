import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float raio, altura, volume;
        float pi;
        pi = 3.14f; // f forca variavel to float
        System.out.println("Digite o valor do raio do cilindro:");
        raio = teclado.nextFloat();
        System.out.println("Digite o valor da altura do cilindro:");
        altura = teclado.nextFloat();
        volume = pi*raio*raio*altura;
        //System.out.println("O valor da area eh = " + area);
        System.out.printf("O valor do volume eh = %.2f\n", volume);
    }
}