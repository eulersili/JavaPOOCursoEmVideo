package aula013b;

public class Cachorro extends Lobo {

    public void enterrarOsso() {
        System.out.println("Osso enterrado!");
    }

    public void abanarRabo() {
        System.out.println("Abanando o rabo");
    }

    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Agradável: abanar e latir");
        } else {
            System.out.println("Agressivo: rosnar");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.println("Manhã: abanar");
        } else if (hora <= 17) {
            System.out.println("Tarde: abanar e latir");
        } else {
            System.out.println("Noite: ignorar");
        }
    }

    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("É dono: abanar");
        } else {
            System.out.println("Não é dono: rosnar e latir");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade <= 17) {
            if (peso <= 5) {
                System.out.println("Novo e leve: abanar");
            } else {
                System.out.println("Novo e pesado: latir");
            }
        } else {
            if (peso <= 5) {
                System.out.println("Velho e leve: rosnar");
            } else {
                System.out.println("Velho e pesado: ignorar");
            }
        }
    }
}
