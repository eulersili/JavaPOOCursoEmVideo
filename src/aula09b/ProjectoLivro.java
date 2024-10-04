package aula09b;

public class ProjectoLivro {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Euler", 20, "M");
        p[1] = new Pessoa("Eliane", 20, "F");

        l[0] = new Livro("Java for Beginner", "Peter", 300, p[0]);
        l[1] = new Livro("Chemistry for Engineers", "Maria", 700, p[1]);
        l[2] = new Livro("Advanced Java", "Endrick", 1400, p[0]);

        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPagina();
        System.out.println(l[0].detalhes());
    }
}
