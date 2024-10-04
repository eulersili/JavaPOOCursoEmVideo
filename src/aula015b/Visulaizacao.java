package aula015b;

public class Visulaizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visulaizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotalAssistido(this.espectador.getTotalAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    @Override
    public String toString() {
        return "Visulaizacao{" +
                "espectador=" + espectador +
                ", filme=" + filme +
                '}';
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
}
