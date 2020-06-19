import java.util.Scanner;

public class Exercicio1060{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        int count = 0;
        
        for(int i = 1; i <=6 ; i++){
            float num = input.nextFloat();
            if(num > 0){
                count += 1;
            }
        }
        System.out.println(count + " valores positivos");
           
    }
}