package bot.calculadora;

public class Quadrado extends AbstractCalculadora{
    
    @Override
     public void calcular() {
        System.out.println("Digite a medida do lado do quadrado:");
        String valor = leitor.nextLine();

        Double lado = Double.parseDouble(valor);

        Double area = Math.pow(lado, 2);

        System.out.println("Área do quadrado é: " + area);
    }
}
