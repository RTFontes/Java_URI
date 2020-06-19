
public class MaqRefrigerante{
    
    private double credito;      
    private Refrigerante lista[];
    
    public MaqRefrigerante(){
        this.credito = 0.0;
        this.lista = new Refrigerante[4];
        this.lista[0] = new Refrigerante("Coca ",2.5,5);
        this.lista[1] = new Refrigerante("Fanta ",2,5);
        this.lista[2] = new Refrigerante("Sprite ",2,5);
        this.lista[3] = new Refrigerante("Pepsi ",1.8,5);
    }
    
    public void adicionarCredito(double valor){
        this.credito += valor;
    }
    public double pegarTroco(){
        double troco = this.credito;
        this.credito = 0.0;        
        return troco;
    }
    public String obterDisplay(){
        return "Credito R$ " + this.credito + "\n"+
        "[0] - " + lista[0].getNome() + " R$" + lista[0].getPreco() + "\n" +
        "[1] - " + lista[1].getNome()+" R$"+lista[1].getPreco()+"\n" +
        "[2] - " + lista[2].getNome()+" R$"+lista[2].getPreco()+"\n" +
        "[3] - " + lista[3].getNome()+" R$"+lista[3].getPreco()+"\n";
    }
}

