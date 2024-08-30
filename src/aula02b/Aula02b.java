package aula02b;

public class Aula02b {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bravo";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 100;

//        c1.status();
        c1.destampar();
        c1.rabiscar();

        System.out.println("-----------");

        Caneta c2 = new Caneta();
        c2.modelo = "BIC";
        c2.cor = "Preta";
        c2.ponta = 0.5f;
        c2.carga = 99;

//        c2.status();
        c2.tampar();
        c2.rabiscar();
    }
}