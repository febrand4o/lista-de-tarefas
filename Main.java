import java.util.Scanner;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class Main {

    // Método que verifica se uma string de data está em um formato válido (dd/MM)
    public static boolean dataValida(String data){
        try{
            MonthDay.parse(data, DateTimeFormatter.ofPattern("dd/MM"));
            return true;
        }
        catch(DateTimeParseException ex){
            return false;
        }
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        boolean sair = false;
        int op;
        ListaDeTarefas lista = new ListaDeTarefas();
        int num;

        // Apresenta o menu de opções ao usuário
        while(!sair){
            try{
                System.out.println("\n1 - Adicionar tarefa\n2 - Excluir tarefa\n3 - Listar tarefas\n0 - sair\nDigite a opcao desejada:");
                op = scan.nextInt();
            
                switch(op){
                    case 1:
                        // Cria uma nova tarefa e a adiciona à lista, se a data for válida
                        Tarefa tarefa = new Tarefa();
                        if(dataValida(tarefa.getData())){
                        lista.adiciona(tarefa);
                        System.out.println("Tarefa adicionada!");
                        }
                        else{
                            System.out.println("Data invalida");
                        }
                        break;
                    case 2:
                        // Solicita o número da tarefa a ser excluída e a remove da lista
                        try{
                            System.out.println("Digite o numero da tarefa a ser excluida: ");
                            num = scan.nextInt();
                            lista.exclui(num - 1);
                            System.out.println("Tarefa excluida!");
                        }
                        catch(java.lang.IndexOutOfBoundsException ex){
                            System.out.println("Essa tarefa nao existe");
                        }
                        break;
                    case 3:
                        lista.imprime();
                        break;
                    case 0:
                        // Sai do loop e encerra o programa
                        sair = true;
                        break;
                    default:
                        System.out.println("Opcao invalida, digite novamente: ");
                }
            }
            // Trata exceção se o usuário inserir um tipo de dado incorreto
            catch(java.util.InputMismatchException ex){
                System.out.println("Algo deu errado! Tente novamente.");
                scan.nextLine();
            }
        }

    scan.close();
    }
}