import java.util.Scanner;

public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double consumo_medio, distancia, quant_litros, tempo_viag, avg_speed;
        
        System.out.println("Digite a velocidade media:");
        avg_speed = teclado.nextDouble();
        System.out.println("Digite o tempo da viagem:");
        tempo_viag = teclado.nextDouble();
        
        consumo_medio = 12;
        
        distancia = avg_speed*tempo_viag;

        quant_litros = distancia/consumo_medio;
        
        System.out.printf("a) A distancia percorrida foi de = %.3f\n", distancia);
        System.out.printf("b) Foram utilizados em litros = %.3f\n", quant_litros);
        //System.out.printf("c) O valor em reais a ser pago com desconto eh = %.2f\n", valor_desc);


    }
}