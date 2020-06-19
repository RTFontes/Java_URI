public class AppEmpregado{
    public static void main(String args[]){
        // apenas declarei as referencias
        Empregado e1, e2, e3;
        
        // aqui vou criar os objetos
        e1 = new Empregado("Rodrigo, ","Engenheiro, ", 9000);
        e2 = new Empregado("Matheus, ","Medico, ", 8000);
        e3 = new Empregado("Ci, ","Publicitaria, ", 10000);

        System.out.println(e1.imprimir());
        System.out.println(e2.imprimir());
        System.out.println(e3.imprimir());

        System.out.println(e1.getNome());
        System.out.println("Salario atual = "+e1.getSalario());
        e1.aumentarSalario(10);      
        System.out.println("Salario novo = "+e1.getSalario());

    }
}
