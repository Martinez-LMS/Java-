public class Programa {
    public static void main(String[] args) {

        String texto1 = "100";
        String texto2 = "50";
        String textoFinal = texto1 + texto2;
        // Concatenação
        System.out.println("Texto: " + textoFinal);

        // Parsear(converter)
        Integer numero1 = Integer.parseInt(texto1);
        int numero2 = Integer.parseInt(texto2);

        int resultado = Calculadora.somar(numero1, numero2);

        System.out.println("Resultado: " + resultado);

        // se o tipo da variavel for primitivo e uma variavel
        double variavel = 10.60;

        // esse e um objeto por causa do tipo dele
        Double objeto = 10.50;

        // Objetos do tipo Bike
        Bike ObjetoMinhaBike = new Bike();
        ObjetoMinhaBike.marca = "Caloi";
        ObjetoMinhaBike.AlterarMarcha(3);

        Bike ObjetoSuaBike = new Bike();
        ObjetoSuaBike.marca = "Oggi";
        ObjetoSuaBike.marchaAtual = 5;

        // Bike.marca = "Caloi";
        // Bike.marchaAtual = 3;

        System.out.println("Minha bike: " + ObjetoMinhaBike.marca);
        System.out.println("Minha bike marcha: " + ObjetoMinhaBike.marchaAtual);

    }
}
