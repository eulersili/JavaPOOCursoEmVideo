package aula04b1;

public class Caneta {
    private String modelo;
    private float ponta;

    public String getModelo(){
    // We can't put "void" instead we must use "String", because it cannot
    // return a value from a method with void result type
        return this.modelo;
    }

    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
    // We can't put "void" instead we must use "float", because it cannot
    // return a value from a method with void result type
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void status(){
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo());
//        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.getPonta());
//        System.out.println("Ponta: " + this.ponta);
    }
}