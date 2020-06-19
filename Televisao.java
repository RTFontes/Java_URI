public class Televisao{
    String marca;
    int tamanhoTela;
    int canal;
    int volume;
    boolean ligada;

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }
    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada ="+ligada);
    }

    void avancarCanal(){
        if(ligada == true && canal < 99){
            canal++;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            canal = 1;
            System.out.println("A TV = "+marca+" foi para o canal "+canal);
        }
    }

    void voltarCanal(){
        if(ligada == true && canal > 1){
            canal--;
            System.out.println("A TV "+marca+" esta no canal "+canal);
        }
        else{
            canal = 99;
            System.out.println("A TV = "+marca+" foi para o canal "+canal);
        }
    }

    void aumentarVolume(){
        if(ligada == true && volume < 10){
            volume++;
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            volume = 10;
            System.out.println("A TV = "+marca+" esta no volume maximo "+volume);
        }
    }

    void diminuirVolume(){
        if(ligada == true && volume > 0){
            volume--;
            System.out.println("A TV "+marca+" esta no volume "+volume);
        }
        else{
            volume = 0;
            System.out.println("A TV = "+marca+" esta no mute!");
        }
    }

    void mutar(){
        if(ligada == true){
            volume = 0;
            System.out.println("A TV "+marca+" eata no mute!");
        }
        else{
            //volume = 0;
            System.out.println("Ligue a TV = "+marca);
        }
    }
}