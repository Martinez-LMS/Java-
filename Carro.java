public class Carro {

    /*
     * public static enum Tipo{
     * UNO,
     * BMW
     * }
     */

    // Atributos

    private String marca;
    private String modelo;
    private int velocidadeMaxima;
    private int velocidade = 0;

    public Carro(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // metodo Getter(pegar)
    public String getMarca() {

        return marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return this.velocidade;
    }

    // Setter(atribuir)
    public void setMarca(String marca) {
        this.marca = marca; // this tem que usar para o atributo
    }

    public void acelerar() {

        if (this.velocidade < this.velocidadeMaxima) {
            this.velocidade++;
        }
        /*
         * if (tipo.equals(Tipo.UNO) && this.velocidade < 144) {
         * this.velocidade++;
         * }else if (tipo.equals(Tipo.BMW) && this.velocidade < 244) {
         * this.velocidade++;
         */
    }

    public void frear() {
        if (this.velocidade > 0) {
            this.velocidade--;
        }
    }
}
