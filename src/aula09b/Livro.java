package aula09b;

public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaActual;
    private boolean aberto;
    private Pessoa leitor;

    // @Override
    public String detalhes() { // toString
        return "Livro {\n" +
                "titulo = '" + titulo + "\',\n" +
                "autor = '" + autor + "\',\n" +
                "totalPaginas = " + totalPaginas + "\n" +
                "aberto = " + aberto + "\n" +
                "paginaActual = " + paginaActual + "\n" +
                "leitor = " + leitor.getNome() + "\n" +
                "idade = " + leitor.getIdade() + "\n" +
                "sexo = " + leitor.getSexo() + "\n" +
                '}';
    }

    public Livro(String titulo, String autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.aberto = false;
        this.paginaActual = 0;
        this.leitor = leitor;
    }

        @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) { // p => página
        if (p > totalPaginas) {
            this.paginaActual = 0;
        }
        else {
            this.paginaActual = p;
        }
    }

    @Override
    public void avancarPagina() {
        this.paginaActual++;
    }

    @Override
    public void voltarPagina() {
        this.paginaActual--;
    }
}
