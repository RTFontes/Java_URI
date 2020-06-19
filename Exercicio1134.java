import java.util.Scanner;

public class Exercicio1134{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        int fuel;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        do{    
            System.out.println("Digite o tipo de combustivel:");
            fuel = input.nextInt();
            
            switch(fuel){
                case 1:
                    count1 += 1;
                    break;
                case 2:
                    count2 += 1;
                    break;
                case 3:
                    count3 += 1;
                    break;
                default:
                    //System.out.println("End");
                    break;                                                           
            }    
        } while(fuel != 4);     
                
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + count1);
        System.out.println("Gasolina: " + count2);
        System.out.println("Diesel: " + count3);
    }
}
