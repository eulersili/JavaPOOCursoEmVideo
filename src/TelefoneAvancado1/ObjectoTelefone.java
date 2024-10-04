package TelefoneAvancado1;

public class ObjectoTelefone {
    public static void main(String[] args) {

        ClassePessoa[] p = new ClassePessoa[2];
        ClasseTelefone[] t = new ClasseTelefone[2];

        p[0] = new ClassePessoa("eulersili", 20, "M");

        t[0] = new ClasseTelefone("Samsung", "Galaxy S20 FE", 13.2f, 300, p[0]);
        t[1] = new ClasseTelefone("Apple", "iPhone 7", 15.3f, 190, p[0]);

//        telefone[0].desligarTelefone();
        t[0].chamando();
        System.out.println(t[0].detalhes());

        System.out.println("-----------------------");

        t[1].ligarTelefone();
        t[1].chamando();
        System.out.println(t[1].detalhes());
    }
}
