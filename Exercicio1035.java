import java.util.Scanner;

public class Exercicio1035{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Digite o valor A:");
        A = input.nextInt();
        System.out.println("Digite o valor B:");
        B = input.nextInt();
        System.out.println("Digite o valor C:");
        C = input.nextInt();
        System.out.println("Digite o valor D:");
        D = input.nextInt();

        if (B > C && D > A && C+D > A+B && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }

        //System.out.println("Seu peso ideal eh = " + peso);

    }

}
