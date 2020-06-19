import java.util.Scanner;

public class Exercicio1064{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        int count = 0;
        float avg = 0;
        float soma = 0;

        for(int i = 1; i <=6 ; i++){
            float num = input.nextFloat();
            if(num > 0){
                count += 1;
                soma += num;                    
            }
        }
        System.out.println(count + " valores positivos");
        System.out.println(soma/count);       

    }
}