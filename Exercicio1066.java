import java.util.Scanner;

public class Exercicio1066{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        
        int countpar = 0;
        int countimpar = 0;
        int countpositivo = 0;
        int countnegativo = 0;

        for(int i = 1; i <=5 ; i++){
            float num = input.nextFloat();
            if(num > 0){
                countpositivo += 1;                                   
            }
            else if (num != 0){
                countnegativo += 1;
            }
            if(num % 2 == 0){
                countpar += 1;                                   
            }
            else{
                countimpar += 1;
            }
        }
        System.out.println(countpar + " valor(es) par(es)");
        System.out.println(countimpar + " valor(es) impar(es)");
        System.out.println(countpositivo + " valor(es) positivo(s)");
        System.out.println(countnegativo + " valor(es) negativo(s)");       

    }
}