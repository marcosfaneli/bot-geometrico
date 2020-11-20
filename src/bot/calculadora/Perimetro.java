package bot.calculadora;

/**
 *
 * @author marco
 */
public class Perimetro extends AbstractCalculadora {

    @Override
    public void calcular() throws Exception{
        System.out.println("Calculando o perimetro");
        
        System.out.println("Quantos lados tem esta forma?");
        String valor = leitor.nextLine();
        
        Integer quantidade = Integer.parseInt(valor);
        
        if(quantidade < 3){
            throw new Exception("Uma forma dever ter no minímo 3 lados.");
        }
        
        Double[] lados = new Double[quantidade];
        
        for(int i = 0;i < quantidade;i++){
            System.out.println("Qual a medidado do lado " + (i + 1) + "?");
            String valorLado = leitor.nextLine();
            Double lado = Double.parseDouble(valorLado);
            
            lados[i] = lado;
        }
        
        System.out.println("O valor do perimetro é " + this.calcularPerimetro(lados));
        System.out.println("O menor lado mede " + this.obterMenorLado(lados));
        System.out.println("O maior lado mede " + this.obterMaiorLado(lados));
    }
    
    private Double calcularPerimetro(Double[] lados){
        Integer contador = 0;
        Double perimetro = 0.0;
        while(contador < lados.length){
            perimetro += lados[contador];
            contador++;
        }
        return perimetro;
    }
    
    private Double obterMenorLado(Double[] lados){
        Double valorMenor = lados[0];
        
        for(Double lado : lados){
            if(lado < valorMenor){
                valorMenor = lado;
            }
        }
        return valorMenor;
    }
    
    private Double obterMaiorLado(Double[] lados){
        Double valorMaior = lados[0];
        
        for(Double lado : lados){
            if(lado > valorMaior){
                valorMaior = lado;
            }
        }
        return valorMaior;
    }
}
