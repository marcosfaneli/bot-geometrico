package bot.calculadora;

public class Triangulo extends AbstractCalculadora {
 
    @Override
    public void calcular() {
        System.out.println("Digite a medida da base do triangulo:");
        String valorBase = leitor.nextLine();

        System.out.println("Digite a medida da altura do triangulo:");
        String valorAltura = leitor.nextLine();

        Double base = Double.parseDouble(valorBase);
        Double altura = Double.parseDouble(valorAltura);

        Double area = (base * altura) / 2;

        System.out.println("A área deste triangulo é: " + area);
    }
}
