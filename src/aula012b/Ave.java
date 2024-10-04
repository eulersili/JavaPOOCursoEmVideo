package aula012b;

public class Ave extends Animal {

    private String corPena;

    public void fazerNinho() {
        System.out.println("Fazendo Ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitir Som: Ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
