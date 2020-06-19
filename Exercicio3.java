import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario_min, energia_uni, energia_med, desconto, valor_uni, valor_desc, valor_pago;
        
        System.out.println("Digite o valor do salario minimo:");
        salario_min = teclado.nextDouble();
        System.out.println("Digite o valor da energia medida:");
        energia_med = teclado.nextDouble();
        
        energia_uni = 100;
        //energia_med = 0;
        //salario_min = 0;
        desconto = 0.1;
        valor_uni =(salario_min/7)/energia_uni;
        valor_pago = energia_med*valor_uni;
        valor_desc = (1-desconto)*valor_pago;
        
        System.out.printf("a) O valor em reais de cada kw eh = %.2f\n", valor_uni);
        System.out.printf("b) O valor em reais a ser pago eh = %.2f\n", valor_pago);
        System.out.printf("c) O valor em reais a ser pago com desconto eh = %.2f\n", valor_desc);


    }
}