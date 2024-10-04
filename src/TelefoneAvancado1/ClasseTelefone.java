package TelefoneAvancado1;

import java.util.Scanner;

public class ClasseTelefone implements Interface {

    private String marca;
    private String modelo;
    private float sistemaOperacional;
    private float preco;
    private boolean chamar;
    private ClassePessoa usuario;

    //    @Override
    public String detalhes() { // toString()
        return "ClasseTelefone{" + "\n" +
                "marca = '" + marca + '\'' + "\n" +
                "modelo = '" + modelo + '\'' + "\n" +
                "sistemaOperacional = " + sistemaOperacional + "\n" +
                "preco = " + preco + "US$" + "\n" +
                "chamar = " + chamar + "\n" +
                "usuario = " + usuario.getNome() + "\n" +
                "idade = " + usuario.getIdade() + "\n" +
                "sexo = " + usuario.getSexo() + "\n" +
                '}';
    }

    public ClasseTelefone(String marca, String modelo, float sistemaOperacional, float preco, ClassePessoa usuario) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.preco = preco;
        this.chamar = false;
        this.usuario = usuario;
    }

    @Override
    public void ligarTelefone() {
        this.chamar = true;
    }

    @Override
    public void desligarTelefone() {
        this.chamar = false;
    }

    @Override
    public void chamando () {
        if (this.chamar == true) {
            System.out.println("O telefone está \033[1;32mLIGADO. CHAMANDO!\033[m");
        }
        else {
            System.out.println("O telefone está \033[1;31mDESLIGADO. NÃO ESTÁ CHAMANDO!\033[m");
        }
    }
}
