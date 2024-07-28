package aula05a;

public class Aula05a {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Euler");
        p1.abrirConta("CC");
        p1.depositar(100);
        p1.sacar(20);
        p1.estadoActual();

        System.out.println("--------------||--------------");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Eliane");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(1000);
        p2.estadoActual();
    }
}
