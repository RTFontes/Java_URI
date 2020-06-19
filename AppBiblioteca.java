
import java.util.Scanner;

public class AppBiblioteca{
    public static void main(String args[]){
        // apenas declarei as referencias

        // Ideal fazer ARRAY: Biblioteca livros[];
        // livros = new Biblioteca[5];
        // livros[0] = new Biblioteca("Calculo I, ","Guidorizzi, ","Matematica, ", 1980, 5, 2, true);
        // livros[1] = new Biblioteca("Calculo II, ","Guidorizzi, ","Matematica, ", 1981, 5, 3, false);
        
        Biblioteca l1, l2, l3, l4, l5;
        Scanner input = new Scanner(System.in);
        String busca;
        int reflivro = 0;
        boolean aux = false;
        int confirma;
        // aqui vou criar os objetos
        l1 = new Biblioteca("Calculo I, ","Guidorizzi, ","Matematica, ", 1980, 5, 2, true);
        l2 = new Biblioteca("Calculo II, ","Guidorizzi, ","Matematica, ", 1981, 5, 3, false);
        l3 = new Biblioteca("Calculo III, ","Guidorizzi, ","Matematica, ", 1982, 5, 4, false);
        l4 = new Biblioteca("Calculo IV, ","Guidorizzi, ","Matematica, ", 1983, 5, 5, false);
        l5 = new Biblioteca("Calculo V, ","Guidorizzi, ","Matematica, ", 1984, 5, 6, false);

        //System.out.println(l1.imprimir());
        //System.out.println(l2.imprimir());
        //System.out.println(l3.imprimir());
        //System.out.println(l4.imprimir());
        //System.out.println(l5.imprimir());

        System.out.println("Digite o titulo do livro: ");
        busca = input.nextLine();

        if(busca.equals("Calculo I")){
            reflivro = 1;
            aux = l1.getEmprestimo();
            System.out.println("Livro disponivel: " +aux);
        }
        else if(busca.equals("Calculo II")){
            reflivro = 2;
            aux = l2.getEmprestimo();
            System.out.println("Livro disponivel: " +aux);
        }
        else if(busca.equals("Calculo III")){
            reflivro = 3;
            aux = l3.getEmprestimo();
            System.out.println("Livro disponivel: " +aux);
        }
        else if(busca.equals("Calculo IV")){
            reflivro = 4;
            aux = l4.getEmprestimo();
            System.out.println("Livro disponivel: " +aux);
        }
        else if(busca.equals("Calculo V")){
            reflivro = 5;
            aux = l5.getEmprestimo();
            System.out.println("Livro disponivel: " +aux);
        }
        else{
            System.out.println("Livro nao encontrado");
        } 
        if(!aux){
            System.out.println("Gostaria de empresta-lo? 1-SIM, 2-NAO");
            confirma = input.nextInt();
                if(confirma == 1){
                    switch(reflivro){
                        case 1:
                            l1.setEmprestimo(true);
                            break;
                        case 2:
                            l2.setEmprestimo(true);
                            break;
                        case 3:
                            l3.setEmprestimo(true);
                            break;
                        case 4:
                            l4.setEmprestimo(true);
                            break;
                        default:
                            l5.setEmprestimo(true);
                            break;
                    }
                }
                else{
                    System.out.println("Obrigado!");
                }   
        }
        else{
            System.out.println("Livro ja emprestado!");
        }
        System.out.println(l1.imprimir());
        System.out.println(l2.imprimir());
        System.out.println(l3.imprimir());
        System.out.println(l4.imprimir());
        System.out.println(l5.imprimir());
    }
}
