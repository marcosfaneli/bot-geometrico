/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot;

import bot.calculadora.Quadrado;
import bot.calculadora.Triangulo;
import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Menu {
    
    private Scanner leitor = new Scanner(System.in);
    
    public void perguntar(){
        System.out.println("Começar novamente?(S - Sim / N - Não)");
        String resposta = leitor.nextLine();
        
        resposta = resposta.toUpperCase();
        
        if(resposta.equals("S")){
            this.iniciar();
        } else {
            System.exit(0);
        }
    }
    
    public void iniciar(){
        System.out.println("Escolha uma opção de cálculo:");
        System.out.println("1 - Quadrado \n2 - Triangulo");
        
        String resposta = leitor.nextLine();
        
        System.out.println("Você escolheu a opção " + resposta);
        
        if(resposta.equals("1")){
            Quadrado calculadora = new Quadrado();
            calculadora.executar();
        }else if (resposta.equals("2")){
            Triangulo calculadora = new Triangulo();
            calculadora.executar();
        }else {
            System.out.println("Você digitou uma opção inválida");
        }
        
        this.perguntar();
    }
    
}
