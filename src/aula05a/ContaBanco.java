package aula05a;

public class ContaBanco {

    // Atributos
    public int numConta; // n
    protected String tipo; // t
    private String dono; // d
    private float saldo; // s
    private boolean status; // e

    // Métodos
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t.equals("CC")) {
        // if (t == "CC")
            this.setSaldo(50);
            System.out.println("Conta aberta com sucesso!");
        }
        else if (t.equals("CP")) {
        // else if (t == "CP")
            this.setSaldo(150);
            System.out.println("Conta aberta com sucesso!");
        }
        else {
            System.out.println("TIPO de conta inválido!");
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0 ) {
            System.out.println("Conta com dinheiro!");
        }
        else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito!");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta encerrada!");
        }
    }

    public void depositar(float v) {
        if (this.getStatus()) {
        // if (this.getEstado() == true)
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
        else {
        // else - this.getEstado() == false
            System.out.println("Impossível depositar!");
        }
    }

    public void sacar(float v) {
        if (getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.printf("Saldo de %.2f na conta de %s\n", this.getSaldo(), this.getDono());
            }
            else {
                System.out.println("Saldo insuficiente!");
            }
        }
        else {
            System.out.println("Impossível sacar!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
        // if (this.getTipo() == "CC")
            v = 12;
        }
        else if (this.getTipo() == "CP") {
        // else if (this.getTipo() == "CP")
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga por: " + this.getDono());
        }
        else {
            System.out.println("Impossível pagar a mensalidade! CONTA FECHADA.");
        }
    }

    // Método Constructor
    public ContaBanco() {
        this.setSaldo(0);
//        this.saldo = 0;
        this.setStatus(false);
//        this.estado = false;
    }

    // Métodos Getters e Setters
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public String getDono() {
        return dono;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setStatus(boolean e) {
        this.status = e;
    }

    public boolean getStatus() {
        return status;
    }

    // Status
    public void estadoActual() {
        System.out.println("------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
}

// 18:10