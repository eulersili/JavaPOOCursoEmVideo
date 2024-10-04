package aula014b;

public class ProjectoYoutube {
    public static void main(String[] args) {

        Video[] video = new Video[3];
        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 2 de Java");
        video[2] = new Video("Aula 3 de Spring Boot");

        video[1].play();
        video[1].like();
        System.out.println(video[1]);

        System.out.println("--------- || --------- || ---------");

        Gafanhoto gafanhoto1 = new Gafanhoto("Euler", 20, "M", "@eulersili");
        gafanhoto1.setExperiencia(3);
        gafanhoto1.viuMaisUm();
        gafanhoto1.viuMaisUm();
        System.out.println(gafanhoto1);

    }
}
