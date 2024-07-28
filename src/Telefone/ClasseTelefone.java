package Telefone;

public class ClasseTelefone {

    String marca;
    String modelo;
    String sistemaOperacional;
    float versao;
    float preco;
    boolean chamar;

    void chamando(){
        // Or: if (this.chamar) - Because it's always true.
        if (this.chamar == true) {
            System.out.println("Telefone LIGADO. Está chamando!");
        }
        else {
            System.out.println("Telefone DESLIGADO. Não está chamando!");
        }
    }

    void telefoneLigado(){
        this.chamar = true;
    }

    void telefoneDesligado(){
        this.chamar = false;
    }

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
        System.out.println("Versão: " + this.versao);
        System.out.println("Preço: US$ " + this.preco);
    }
}


