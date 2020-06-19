import java.util.Scanner;

public class Exercicio20{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        float altura;
        int sexo;
        float peso;

        System.out.println("Digite sua altura:");
        altura = input.nextFloat();
        System.out.println("Digite seu sexo:");
        sexo = input.nextInt();

        if (sexo == 1){
            peso = (72.5f*altura)-58f;
        }
        else {
            peso = (62.1f*altura)-44.7f;
        }

        System.out.println("Seu peso ideal eh = " + peso);

    }

}
