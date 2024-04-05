public class Pessoa {

    String nome;
    int altura;
    int peso;

    // public Pessoa(){

    // }
    public Pessoa(String nome) {

        this.nome = nome;

    }

    public Pessoa(String nome, int altura, int peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

}
