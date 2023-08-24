import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean sair = false;
        int op;
        ListaDeTarefas lista = new ListaDeTarefas();
        int num;

        while(!sair){
            System.out.println("\n1 - Adicionar tarefa\n2 - Excluir tarefa\n3 - Listar tarefas\n0 - sair");
            op = scan.nextInt();
            switch(op){
                case 1:
                    Tarefa tarefa = new Tarefa();
                    lista.adiciona(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;
                case 2:
                    System.out.println("Digite o numero da tarefa a ser excluida: ");
                    num = scan.nextInt();
                    lista.exclui(num - 1);
                    System.out.println("Tarefa excluida!");
                    break;
                case 3:
                    lista.imprime();
                    break;
                case 0:
                    sair = true;
                    break;
                default:
                    System.out.println("Opcao invalida, digite novamente: ");
            }
        }
    }
}