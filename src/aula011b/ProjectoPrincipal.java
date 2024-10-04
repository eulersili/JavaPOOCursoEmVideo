package aula011b;

public class ProjectoPrincipal {
    public static void main(String[] args) {

        // Pessoa p1 = new Pessoa();

//        Visitante v1 = new Visitante();
//        v1.setNome("Mingo");
//        v1.setIdade(22);
//        v1.setSexo("M");
//        System.out.println(v1.toString());

//        Aluno a1 = new Aluno();
//        a1.setNome("Mateus");
//        a1.setIdade(16);
//        a1.setSexo("M");
//        a1.setCurso("Informática");
//        a1.setMatricula(11111);
//        a1.pagarMensalidade();
//        System.out.println(a1.toString());

        Bolsista b1  = new Bolsista();
        b1.setNome("João");
        b1.setIdade(15);
        b1.setSexo("M");
        b1.setMatricula(11244);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();
        System.out.println(b1.toString());
    }
}
