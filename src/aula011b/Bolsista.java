package aula011b;

public class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando Bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é Bolsista! Pagamento facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
