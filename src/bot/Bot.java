package bot;

import bot.calculadora.Quadrado;
import bot.calculadora.Triangulo;
import java.util.Scanner;

public class Bot {

    public static void main(String[] args) {
        System.out.println("Bem vindo a calculadora geométrica");
        
        Menu m = new Menu();
        m.iniciar();
    }
}
