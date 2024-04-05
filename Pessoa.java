public class Pessoa {

    String nome;
    int altura;
    int peso;

    // public Pessoa(){

    // }
    public Pessoa(String nome) {

        this.nome = nome;

    }

    public void setAltura(int altura) {
        if (altura > 15 && altura < 250) {
            this.altura = altura;
        } else {
            // throw Exception();
        }

    }

    public Pessoa(String nome, int altura, int peso) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

}
