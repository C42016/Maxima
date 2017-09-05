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
public class Simulacao {
    public Produto produto;  
   
    
 public Simulacao(Produto prod) {
  this.produto = prod;
  
 
 } 
    
    public  void Simulacao(){
        //Produto produto = new Produto():
      produto.setTipo("corporativo");
       produto.setNumeroSerie(1245);
       produto.ligar();
       produto.desligar();
       //return product;
    }
    
    /* este metodo serve para testar ou criar certp producto**/
    public static void main(String[] args) {
       Produto produto = new Produto();
    
       produto.setTipo(" corporativo");
        System.out.println("Tipo do producto :  " +produto.getTipo());
       produto.setNumeroSerie(1245);
        System.out.println(" Serie do producto:  " +produto.getNumeroSerie()+"\n"+produto.ligar()+"\n"+produto.desligar());
       produto.ligar();
       produto.desligar();
       if(produto instanceof Computador){
           Computador comp = new Computador("256ghz", 5682, "pessoal");
           System.out.println("velocidade do computador " +comp);
           
           comp.toString();
       }
       else {
             
           
           Impressora imp = new Impressora(" 256ghz  ", 2564, " corporativa  ");
           System.out.println("velocidade da Impressora " +imp +"\n" +imp.ligar()+"\n" +imp.desligar()+"\n" +imp.imprimir()) ;
           
                   
           
           }
       }
    }


