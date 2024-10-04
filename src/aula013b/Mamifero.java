package aula013b;

public class Mamifero extends Animal {

    private String corPelo;

    @Override
    public void reagir() {
        System.out.println("Mamífero reagindo");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
