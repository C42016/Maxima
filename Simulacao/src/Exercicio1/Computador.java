/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1;

/**
 *
 * @author Euridia
 */
public class Computador extends Produto {
     String velocidade;

    public Computador(String velocidade, double numeroSerie, String tipo) {
        super(numeroSerie, tipo);
        this.velocidade = velocidade;
    }
   
    
    @Override
   public String ligar(){
    return "o computador esta pronto para uso";
    }
    @Override
   public String desligar(){
    return "o computador ja pode ser desligado com seguranca";
    }
    public String processar(){
    return "computador processando";
    }

    @Override
    public String toString() {
        return super.toString()+ "velocidade=" + velocidade + '}';
    }
    
}
