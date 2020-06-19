
public class Refrigerante{
    
    private String nome;      
    private double preco;
    private int    estoque;
    
    public Refrigerante(String nome, double preco, int estoque){
        this.nome    = nome;
        this.preco   = preco;
        this.estoque = estoque;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }
    public void setEstoque(int estoque){
        this.estoque = estoque;
    }
    public int getEstoque(){
        return this.estoque;
    }
    public void retirarEstoque(){
        this.estoque--;
    }
    public String imprimir(){
        return "Nome: "+this.nome+"Preco: "+this.preco+" Estoque: "+this.estoque;
    }
}
