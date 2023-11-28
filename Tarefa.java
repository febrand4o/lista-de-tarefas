import java.util.Scanner;

public class Tarefa{
    private String titulo;
    String data;
    Scanner scan = new Scanner(System.in);

    //construtor
    public Tarefa(){
        System.out.println("Digite o titulo da tarefa: ");
        titulo = scan.nextLine();
        System.out.printf("Digite a data de entrega (dd/MM): ");
        data = scan.nextLine();
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public String getData() {
        return data;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDia(String data) {
        this.data = data;
    }

}