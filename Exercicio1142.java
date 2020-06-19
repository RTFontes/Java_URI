import java.util.Scanner;

public class Exercicio1142{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite N:");
        int N = input.nextInt();
        int aux1 = 1;
        int aux2 = 2;
        int aux3 = 3;      

        for(int i = 1; i <= N; i++){
            System.out.println(aux1 + " " + " " + aux2 + " " + " " + aux3 + " " + "PIM");
            aux1 += 4;
            aux2 += 4;
            aux3 += 4;
        }            
    }
}
