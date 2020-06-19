// definição da classe empregado
public class Biblioteca{
    // definição dos atributos "blindados"/encapsulados
    // estes atributos só tem acesso dentro da classe
    private String titulo;      
    private String autor;
    private String categoria;
    private int ano;
    private int estante;
    private int prateleira;
    private boolean emprestimo;
    
    // método construtor para que eu, ao dar "new" num novo objeto,
    public Biblioteca(String titulo, String autor, String categoria, int ano, int estante, int prateleira, boolean emprestimo){
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ano = ano;
        this.estante = estante;
        this.prateleira = prateleira;
        this.emprestimo = emprestimo;
    }

    // métodos GET e SET para cada atributo 
    // GET = método para consultar, ou seja, retorna o valor armazenado no atributo
    // SET = método para alterar/atribuir novo valor
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }
    public void setEstante(int estante){
        this.estante = estante;
    }
    public int getEstante(){
        return this.estante;
    }
    public void setPrateleira(int prateleira){
        this.prateleira = prateleira;
    }
    public int getPrateleira(){
        return this.prateleira;
    }
    public void setEmprestimo(boolean emprestimo){
        this.emprestimo = emprestimo;
    }
    public boolean getEmprestimo(){
        return this.emprestimo;
    }
    // um método que já retorna uma STRING compondo todas as infos da pessoa
    public String imprimir(){
        return "Titulo: "+this.titulo+"Autor: "+this.autor+" Ano: "+this.ano+" Emprestimo: "+this.emprestimo;
    }
}
