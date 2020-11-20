/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bot;

import bot.calculadora.AbstractCalculadora;
import bot.calculadora.Perimetro;
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
        System.out.println("1 - Quadrado \n2 - Triangulo \n3 - Perimetro");
        
        String resposta = leitor.nextLine();
        
        this.chamarCalculadora(resposta);
    }
    
    public void chamarCalculadora(String opcao){
        System.out.println("Você escolheu a opção " + opcao);
        
        AbstractCalculadora calculadora = null;
        
        switch (opcao) {
            case "1":{
                    calculadora = new Quadrado();
                    break;
                }
            case "2":{
                    calculadora = new Triangulo();
                    break;
                }
            case "3":{
                    calculadora = new Perimetro();
                    break;
                }
            default:
                System.out.println("Você digitou uma opção inválida");
                break;
        }
        
        if(calculadora != null){
            calculadora.executar();
        }
        
        this.perguntar();
    }
    
}
