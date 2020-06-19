public class AppQueUsaTv{
    public static void main(String args[]){
        Televisao t;
        
        t = new Televisao();
        
        t.marca = "Samsung";
        t.tamanhoTela = 42;
        t.ligada = true;
        t.canal = 5;
        t.volume = 10;

        Televisao x;
        
        x = new Televisao();

        x.marca = "LG";
        x.tamanhoTela = 55;
        x.ligada = true;
        x.canal = 54;
        x.volume = 0;

        //t.power();
        //x.power();

        x.voltarCanal();
        x.diminuirVolume();
        t.avancarCanal();
        t.aumentarVolume();

              

    }
}