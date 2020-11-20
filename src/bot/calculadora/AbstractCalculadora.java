package bot.calculadora;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public abstract class AbstractCalculadora {

    protected Scanner leitor = new Scanner(System.in);

    private void perguntar() {
        System.out.println("Quer tentar novamente?(S - Sim/N - Não)");
        String valor = leitor.nextLine();

        valor = valor.toUpperCase();

        if (valor.equals("S")) {
            this.executar();
        }
    }

    public void executar() {
        try {
            this.calcular();
        } catch (Exception erro) {
            System.out.println("Não entendi o valor digitado");
            System.out.println(erro.getMessage());
        }
        this.perguntar();
    }

    public abstract void calcular() throws Exception;
}
