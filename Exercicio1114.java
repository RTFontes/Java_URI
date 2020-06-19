import java.util.Scanner;

public class Exercicio1114{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        boolean teste = false;

        while(teste == false){
            System.out.println("Digite sua senha:");
            int senha = input.nextInt();
                if(senha == 2002 ){
                    teste = true;
                    System.out.println("Acesso permitido");
                }
                else{
                    System.out.println("Senha invalida");
                }
            }        
    }
}
