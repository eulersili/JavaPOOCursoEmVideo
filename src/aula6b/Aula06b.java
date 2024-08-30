package aula6b;

// Essa é o nosso Objecto
public class Aula06b {
    public static void main(String[] args) {
        ControleRemote c = new ControleRemote();
//        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirMenu();
        c.fecharMenu();
    }
}

// Colocou-se os atributos e os métodos especiais como privado, para que não
// se possa modificar os seus respectivos valores no(s) Objecto(s) - sendo
// assim, apenas posso usar os métodos que estão disponíveis na interface.