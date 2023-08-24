import java.util.Scanner;

public class Tarefa{
    private String titulo;
    private int dia;
    private int mes;
    Scanner scan = new Scanner(System.in);

    public Tarefa(){
        System.out.println("Digite o titulo da tarefa: ");
        titulo = scan.nextLine();
        System.out.printf("Digite o prazo\nDia: ");
        dia = scan.nextInt();
        System.out.println("Mes: ");
        mes = scan.nextInt(); 
    }

    //getters
    public String getTitulo() {
        return titulo;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

}