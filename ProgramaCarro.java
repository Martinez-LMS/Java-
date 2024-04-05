public class ProgramaCarro {
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Pedro");
        p.setNome("Pedro");

        Carro uno = new Carro(144);

        uno.setMarca("Fiat");
        uno.setModelo("Uno Mille");
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();

        uno.frear();
        uno.frear();

        System.out.println("marca: " + uno.getMarca());
        System.out.println("marca: " + uno.getModelo());
        System.out.println("Velocidade: " + uno.getVelocidade());

        Carro bmw = new Carro(250);
        bmw.setMarca("BMW");
        bmw.setModelo("m3");

        bmw.acelerar();
        bmw.acelerar();
        bmw.acelerar();
        bmw.frear();

    }
}
