import  java.util.ArrayList;

// Representa uma lista de tarefas usando um ArrayList de objetos Tarefa
public class ListaDeTarefas {
    private ArrayList<Tarefa> lista;

    //construtor
    public ListaDeTarefas(){
        lista = new ArrayList<>();
    }

    //métodos para manipulação da lista
    public void adiciona(Tarefa tarefa){
        lista.add(tarefa);
    }
    public void exclui(int indice){
        lista.remove(lista.get(indice));
    }
    public void imprime(){
        System.out.println("\nLista de tarefas");
        for(int i=0; i<lista.size(); i++){
            System.out.printf("%d - " + lista.get(i).getTitulo() + " (%s)\n", i+1, lista.get(i).getData());
        }
    }
}
