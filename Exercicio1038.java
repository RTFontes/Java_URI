import java.util.Scanner;

public class Exercicio1038{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        int code,qtde;
        float total;

        System.out.println("Digite o codigo do produto:");
        code = input.nextInt();
        System.out.println("Digite quantidade:");
        qtde = input.nextInt();

        if(code == 1){
            total = qtde*4f;
        }
        else{
            if(code == 2){
                total = qtde*4.5f;
            }
            else{
                if(code == 3){
                    total = qtde*5f;
                }
                else{
                    if(code == 4){
                        total = qtde*2f;
                    }
                    else{
                        total = qtde*1.5f;
                    }
                }
            }
          System.out.printf("Total: R$ %.2f\n", total);  
        }
        


        
    }

}
