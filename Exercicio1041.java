import java.util.Scanner;

public class Exercicio1041{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        float x,y;

        System.out.println("Digite a coordenada X:");
        x = input.nextFloat();
        System.out.println("Digite a coordenada Y:");
        y = input.nextFloat();
        
        if(x==0 && y==0){
            System.out.println("Origem");
        }
        else{
            if(x>0 && y>0){
                System.out.println("Q1");
            }
            else{
                if(x<0 && y<0){
                    System.out.println("Q3");
                }
                else{
                    if(x<0 && y>0){
                        System.out.println("Q2");
                    }
                    else{
                        if(x>0 && y<0){
                            System.out.println("Q4");
                        }
                        else{
                            if(x==0 && y!=0){
                                System.out.println("Eixo Y");
                            }
                            else{
                                System.out.println("Eixo X");
                            }
                        }
                        
                    }
                }
            }
        }


        //System.out.printf("Media: %.1f\n" , AVG);

        
    }
}