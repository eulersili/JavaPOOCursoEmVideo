package aula013b;

public class ProjectoPrincipal {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        mamifero.reagir();

        System.out.println("----------------");

        Lobo lobo = new Lobo();
        lobo.reagir();

        System.out.println("----------------");

        Cachorro cachorro = new Cachorro();
        cachorro.reagir("Olá");
        cachorro.reagir("sai daqui!");
        cachorro.reagir(true);
        cachorro.reagir(false);
        cachorro.reagir(17, 4.9f);
        cachorro.reagir(17, 6f);
        cachorro.reagir(18, 4f);
        cachorro.reagir(18, 8f);
        cachorro.reagir(11, 59);
        cachorro.reagir(12, 30);
        cachorro.reagir(18, 0);
    }
}
