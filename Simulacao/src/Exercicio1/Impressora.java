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
public class Impressora extends Produto {
    String velocImpressao;



    public Impressora(String velocImpressao, double numeroSerie, String tipo) {
        super(numeroSerie, tipo);
        this.velocImpressao = velocImpressao;
    }
    
    
     @Override
   public String ligar(){
    return "a impressora esta pronto para receber documentos";
    }
    @Override
   public String desligar(){
    return "a impressora nao esta mais disponivel";
    }
    public String imprimir(){
    return "a impressora esta em uso";
    }

    @Override
    public String toString() {
        return super.toString() +  "velocImpressao=" + velocImpressao;
    }
    
}
    