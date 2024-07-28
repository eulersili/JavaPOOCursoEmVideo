package Telefone;

public class ObjectoTelefone {
    public static void main(String[] args) {

        ClasseTelefone iPhone = new ClasseTelefone();
        iPhone.marca = "Apple";
        iPhone.modelo = "iPhone 7";
        iPhone.sistemaOperacional = "iOS";
        iPhone.versao = 15.7f;
        iPhone.preco = 299.99f;
        iPhone.status();
        iPhone.telefoneLigado();
        iPhone.chamando();

        System.out.println("-------------------");

        ClasseTelefone Galaxy = new ClasseTelefone();
        Galaxy.marca = "Samsung";
        Galaxy.modelo = "Galaxy S10";
        Galaxy.sistemaOperacional = "Android";
        Galaxy.versao = 13;
        Galaxy.preco = 400;
        Galaxy.status();
        Galaxy.telefoneDesligado();
        Galaxy.chamando();

    }
}
