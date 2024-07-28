package aula04b3;

public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String m, String c, float p){
    // This is a constructor method
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    public String getModelo(){
    // We can't put "void" instead we must use "String", because it cannot
    // return a value from a method with void result type
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
    // We can't put "void" instead we must use "String", because it cannot
    // return a value from a method with void result type
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampada(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
//        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.getPonta());
//        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
