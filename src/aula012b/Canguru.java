package aula012b;

public class Canguru extends Mamifero {

    public void usarBolsar() {
        System.out.println("Usando a bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltando, saltando, saltando");
    }
}
