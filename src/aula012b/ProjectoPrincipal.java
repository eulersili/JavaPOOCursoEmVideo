package aula012b;

public class ProjectoPrincipal {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        mamifero.setPeso(85.3f);
        mamifero.setIdade(6);
        mamifero.setMembros(4);
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();
        System.out.println(mamifero.toString());

        System.out.println("----------------");

        Reptil reptil = new Reptil();
//        reptil.locomover();
//        reptil.alimentar();
//        reptil.emitirSom();
//        System.out.println(reptil.toString());

        System.out.println("----------------");

        Peixe peixe = new Peixe();
//        peixe.soltarBolhas();
//        peixe.locomover();
//        peixe.alimentar();
//        peixe.emitirSom();

        System.out.println("----------------");

        Ave ave = new Ave();

        System.out.println("----------------");

        Canguru canguru = new Canguru();
        canguru.setPeso(33.4f);
        canguru.locomover();
        canguru.alimentar();
        canguru.emitirSom();
        System.out.println(canguru.toString());

        System.out.println("----------------");

        Cachorro cachorro = new Cachorro();
        cachorro.locomover();

        System.out.println("----------------");

        Cobra cobra = new Cobra();

        System.out.println("----------------");

        Tartaruga tartaruga = new Tartaruga();

        System.out.println("----------------");

        Goldfish goldfish = new Goldfish();

        System.out.println("----------------");

        Arara arara = new Arara();
    }
}
