import java.util.Scanner;

public class Exercicio4{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double salario_liq, valor_hora, quant_hora, desconto_inss;
        
        System.out.println("Digite o valor da hora trabalhada:");
        valor_hora = teclado.nextDouble();
        System.out.println("Digite o valor da quantidade horas trabalhadas:");
        quant_hora = teclado.nextDouble();
        System.out.println("Digite o valor do desconto do INSS em %:");
        desconto_inss = teclado.nextDouble();

        //desconto_inss = 0,275;

        salario_liq = (1-(desconto_inss/100))*(valor_hora*quant_hora);

        System.out.printf("a) O valor da hora trabalhada eh = %.2f\n", valor_hora);  
        System.out.printf("a) A quantidade de hora trabalhada eh = %.2f\n", quant_hora);
        System.out.printf("a) O valor do desconto do INSS eh = %.3f\n", desconto_inss);
        System.out.printf("a) O salario liquido eh = %.2f\n", salario_liq);
        

    }
}