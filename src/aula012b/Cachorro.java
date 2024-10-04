package aula012b;

public class Cachorro extends Mamifero {

    public void enterrarOsso() {
        System.out.println("Osso enterrado!");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }

    @Override
    public void locomover() {
        System.out.println("Andando");
    }
}
