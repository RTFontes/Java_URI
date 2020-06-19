// definição da classe empregado
public class Empregado{
    // definição dos atributos "blindados"/encapsulados
    // estes atributos só tem acesso dentro da classe
    private String nome;      
    private String cargo;
    private double salario;
    //private char   sexo;

    // método construtor para que eu, ao dar "new" num novo objeto,
    // seja obrigado a passar as 4 informações para ele nesta sequencia
    // nome, sobrenome, idade e sexo
    public Empregado(String no, String cg, double vl){
        nome    = no;
        cargo   = cg;
        salario = vl;
    }

    // métodos GET e SET para cada atributo 
    // GET = método para consultar, ou seja, retorna o valor armazenado no atributo
    // SET = método para alterar/atribuir novo valor
    public void setNome(String no){
        nome = no;
    }
    public String getNome(){
        return nome;
    }
    public void setCargo(String cg){
        cargo = cg;
    }
    public String getCargo(){
        return cargo;
    }
    public void aumentarSalario(double percentual){
        salario = (1 + percentual/100) * salario;
    }
    public void setSalario(double vl){
        salario = vl;
    }
    public double getSalario(){
        return salario;
    }
    // um método que já retorna uma STRING compondo todas as infos da pessoa
    public String imprimir(){
        return nome+" "+cargo+" salario: "+salario;
    }
}