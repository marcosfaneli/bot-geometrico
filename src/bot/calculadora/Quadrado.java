package bot.calculadora;

import java.util.Scanner;

public class Quadrado {

    public Scanner leitor = new Scanner(System.in);
    
    private void perguntar(){
        System.out.println("Quer tentar novamente?(S - Sim/N - Não)");
        String valor = leitor.nextLine();
        
        if(valor.equals("S")){
            this.executar();
        }
    }
 
    public void executar() {
        try {
            System.out.println("Digite a medida do lado do quadrado:");
            String valor = leitor.nextLine();

            Double lado = Double.parseDouble(valor);

            Double area = Math.pow(lado, 2);

            System.out.println("Área do quadrado é: " + area);
            
            this.perguntar();
        } catch (Exception ex) {
            System.out.println("Não entendi o valor digitado");
            this.perguntar();
        }
    }
}
