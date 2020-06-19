import java.util.Scanner;

public class Exercicio1040{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        float N1,N2,N3,N4,NE;
        float W1,W2,W3,W4;
        float AVG,AVGE;

        W1 = 2;
        W2 = 3;
        W3 = 4;
        W4 = 1;

        System.out.println("Digite a primeira nota:");
        N1 = input.nextFloat();
        System.out.println("Digite a segunda nota:");
        N2 = input.nextFloat();
        System.out.println("Digite a terceira nota:");
        N3 = input.nextFloat();
        System.out.println("Digite a quarta nota:");
        N4 = input.nextFloat();

        AVG = (N1*W1 + N2*W2 + N3*W3 + N4*W4)/(W1+W2+W3+W4);
        System.out.printf("Media: %.1f\n" , AVG);

        AVGE = 0f;

        if(AVG < 5f){
            System.out.printf("Aluno reprovado...");
        }
        else{
            if(AVG <= 6.9f){
                System.out.printf("Aluno em exame \n");
            }
            else{
                System.out.printf("Aluno aprovado!");
            }
            
        }

        if(AVG > 5f && AVG <= 6.9f){
            System.out.println("Digite a nota do exame:");
            NE = input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n" , NE);
            AVGE = (AVG + NE)/2f;
        }

        if(AVGE >= 5f){
            System.out.printf("Aluno aprovado! \n");
            System.out.printf("Media final: %.1f\n" , AVGE);
        }
          
        
    }
}