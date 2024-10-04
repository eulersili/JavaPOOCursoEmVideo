package aula013b;

import java.util.Scanner;

public class Meee {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Peso: ");
        int peso = scanner.nextInt();

        if (idade <= 17) {
            if (peso <= 5) {
                System.out.println("novo e leve");
            }
            else {
                System.out.println("novo e pesado");
            }
        }
        else {
            if (peso <= 5) {
                System.out.println("velho e leve");
            }
            else {
                System.out.println("velho e pesado");
            }
        }
    }
}
