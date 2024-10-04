package aula015b;

public class Gafanhoto extends Pessoa {

    private String username;
    private int totalAssistido;

    public void viuMaisUm() {
        this.totalAssistido++;
    }

    public Gafanhoto(String nome, int idade, String sexo, String username) {
        super(nome, idade, sexo);
        this.username = username;
        this.totalAssistido = 0;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +
                "\n\t" + super.toString() +
                "\n\tusername='" + username + '\'' +
                "\n\ttotalAssistido=" + totalAssistido +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
}
