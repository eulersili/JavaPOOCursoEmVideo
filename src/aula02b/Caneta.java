package aula02b;

public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        }
        else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }
}
// "this" é uma referência ao próprio objecto que chamou.
// Sempre que quiser modificar um atributo de uma classe, coloque
// à frente da linha que vai mexer o objecto.

// Todos os objectos da mesma classe, têm atributos e métodos comuns. O diferente
// é apenas o status ou valor de atributos.