import java.util.Scanner;

public class Exercicio1021{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.output.println("Digite o valor total de dinheiro:");

        int total, notas_cem,notas_cinq,notas_vinte,notas_dez,notas_cinco,notas_dois,moeda_um,moeda_cinq,moeda_vinte,moeda_dez,moeda_cinco,moeda_um_cent;

        int resto_cem,resto_cinq,resto_vinte,resto_dez,resto_cinco,resto_dois;

        int resto_moeda_um,resto_moeda_cinq,resto_moeda_vinte,resto_moeda_dez,resto_moeda_cinq,resto_moeda_cinco,resto_moeda_um_cent;


        total = input.nextInt();

        notas_cem = total / 100;

        resto_cem = total % 100;

        notas_cinq = resto_cem / 50;

        resto_cinq = resto_cem % 50;

        notas_vinte = resto_cinq / 20;

        resto_vinte = resto_cinq % 20;

        notas_dez = resto_vinte / 10;

        resto_dez = resto_vinte % 10;

        notas_cinco = resto_dez / 5;

        resto_cinco = resto_dez % 5;

        notas_dois = resto_cinco / 2;

        resto_dois = resto_cinco % 2;

        moeda_um = resto_dois / 1;

        resto_moeda_um = resto_dois % 1;

        moeda_cinq = resto_moeda_um / 0.5;

        resto_moeda_cinq = resto_moeda_um % 0.5;

        moeda_vinte = resto_moeda_cinq / 0.25;

        resto_moeda_vinte = resto_moeda_cinq % 0.25;

        moeda_dez = resto_moeda_vinte / 0.1;

        resto_moeda_dez = resto_moeda_vinte % 0.1;

        moeda_cinco = resto_moeda_dez / 0.05;

        resto_moeda_cinco = resto_moeda_dez % 0.05;

        moeda_um_cent = resto_moeda_cinco / 0.01;
    
        resto_moeda_um_cent = resto_moeda_cinco % 0.01;

        System.out.println("NOTAS:");
        System.out.println(notas_cem + "nota (s) de R$ 100.00");
        System.out.println(notas_cinq + "nota (s) de R$ 50.00");
        System.out.println(notas_vinte + "nota (s) de R$ 20.00");
        System.out.println(notas_dez + "nota (s) de R$ 10.00");
        System.out.println(notas_cinco + "nota (s) de R$ 5.00");
        System.out.println(notas_dois + "nota (s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(moeda_um + "moeda (s) de R$ 1.00");
        System.out.println(moeda_cinq + "moeda (s) de R$ 0.50");
        System.out.println(moeda_vinte + "moeda (s) de R$ 0.25");
        System.out.println(moeda_dez + "moeda (s) de R$ 0.10");
        System.out.println(moeda_cinco + "moeda (s) de R$ 0.05");
        System.out.println(moeda_um_cent + "moeda (s) de R$ 0.01");
        

    }



}

