import java.util.Scanner;

public class Exercicio1115{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        int x,y;

        System.out.println("Digite a coordenada X:");
        x = input.nextInt();
        System.out.println("Digite a coordenada Y:");
        y = input.nextInt();

        if (x > 0 && y > 0){
            System.out.println("primeiro");
        }            
        else if (x < 0 && y > 0){
            System.out.println("segundo");
        }       
        else if (x < 0 && y < 0){
            System.out.println("terceiro");
        }
        else if (x > 0 && y < 0){
            System.out.println("quarto");
        }
        else{
            System.out.println("NULL");
        }
           
    }
}