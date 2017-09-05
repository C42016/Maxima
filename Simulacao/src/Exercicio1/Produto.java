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
public class Produto {

   
    private double numeroSerie;
    private String tipo;

    public Produto(double numeroSerie, String tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

    Produto() {
    }

    
    public double getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(double numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String ligar(){
    return "ligando";
    }
    
    public String desligar(){
    return "desligando";
    }

    @Override
    public String toString() {
        return  "numeroSerie=" + numeroSerie + ", tipo=" + tipo;
    }
    
    
    
    
    
    
}
