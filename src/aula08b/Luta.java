package aula08b;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        // Se as categorias dos lutadores "l1" e "l2" forem iguais e são
        // obviamente jogadores diferentes, então:...
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiante = l1;
            this.desafiado = l2;
        }
        // Caso contrário (se a categoria for diferente e os jogadores os
        // mesmos - "l1" e "l1"/ "l2" e "l2"), a luta não é aprovada e os
        // jogadores já não existirão.
        else {
            this.aprovada = false;
            this.desafiante = null;
            this.desafiado = null;
        }
    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor  = aleatorio.nextInt(3);
            System.out.println("--------------////RESULTADO DA LUTA\\\\\\\\--------------");
            switch (vencedor) {
                case 0: // Empate
                    System.out.println("--------------EMPATE--------------");
                    System.out.println("Os lutadores: " + this.getDesafiante().getNome() + " e " + this.getDesafiado().getNome() + " EMPATARAM!");
                    this.desafiante.empatarLuta();
                    this.desafiado.empatarLuta();
                    break;
                case 1: // Desafiante ganha - l1
                    System.out.println("--------------VENCEDOR--------------");
                    System.out.println("Lutador: " + this.getDesafiante().getNome() + " GANHOU!");
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
                case  2: // Desafiado ganha - l1
                    System.out.println("--------------VENCEDOR--------------");
                    System.out.println("Lutador: " + this.getDesafiado().getNome() + " GANHOU!");
                    break;
            }
        }
        else {
            System.out.println("A luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
