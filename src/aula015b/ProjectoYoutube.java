package aula015b;

public class ProjectoYoutube {
    public static void main(String[] args) {

        Video video1 = new Video("Aula 1 de POO");
        video1.play();
        video1.like();
        System.out.println(video1);

        System.out.println("--------- || --------- || ---------");

        Gafanhoto gafanhoto1 = new Gafanhoto("Euler", 20, "M", "@eulersili");
        gafanhoto1.setExperiencia(3);
        gafanhoto1.viuMaisUm();
        gafanhoto1.viuMaisUm();
        System.out.println(gafanhoto1);

        System.out.println("--------- || --------- || ---------");

        Visulaizacao visulaizacao1 = new Visulaizacao(gafanhoto1, video1);
        System.out.println(visulaizacao1.toString());

    }
}
