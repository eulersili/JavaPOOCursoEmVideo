package aula015b;

public class Video implements AccoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    @Override
    public String toString() {
        return "Video{" + "\n" +
                "\ttitulo = '" + titulo + '\'' + "\n" +
                "\tavaliacao = " + avaliacao + "\n" +
                "\tviews = " + views + "\n" +
                "\tcurtidas = " + curtidas + "\n" +
                "\treproduzindo = " + reproduzindo +
                '}';
    }

    @Override
    public void play() {
        this.setReproduzindo(true);
        this.setViews(getViews() + 1);
        System.out.println("---- Vídeo tocando;-) ----");
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
        System.out.println("---- Vídeo pausado ----");
    }

    @Override
    public void like() {
        this.curtidas++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
