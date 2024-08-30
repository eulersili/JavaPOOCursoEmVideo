package aula04b1;

public class Aula04b {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.setModelo("Bravo");
//        c1.modelo = "Bravo";
        // 'modelo' has private access in 'aula04b.Caneta'

        c1.setPonta(0.5f);
//        c1.ponta = 0.5f;
        // 'ponta' has private access in 'aula04b.Caneta'

//        c1.status();
        System.out.printf("Tenho uma %s com ponta %.1f", c1.getModelo(), c1.getPonta());
    }
}