import java.util.Scanner;

public class Exercicio1002{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double area, pi, raio;
        
        System.out.println("Digite o raio da circunferencia:");
        raio = teclado.nextDouble();
        //System.out.println("Digite o tempo da viagem:");
        //tempo_viag = teclado.nextDouble();
        
        pi = 3.14159;
        area = pi*raio*raio;

        System.out.printf("A=%.4f\n",area);
        //System.out.printf("b) Foram utilizados em litros = %.3f\n", quant_litros);
        //System.out.printf("c) O valor em reais a ser pago com desconto eh = %.2f\n", valor_desc);


    }
}
