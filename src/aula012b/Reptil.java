package aula012b;

public class Reptil extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo insectos!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitir Som: Réptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
