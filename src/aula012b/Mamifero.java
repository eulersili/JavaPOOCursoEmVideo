package aula012b;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void locomover() {
        System.out.println("Correndo!");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitir Som: Mamífero");
    }


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
