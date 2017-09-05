/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Estudante
 */
public abstract class Cartao implements Serializable, Comparable{
    private String Propretario;
    private int NumTel;
    private double Saldo;
    private String Operadora;

    public Cartao(String Propretario, int NumTel, double Saldo, String Operadora) {
        this.Propretario = Propretario;
        this.NumTel = NumTel;
        this.Saldo = Saldo;
        this.Operadora = Operadora;
    }

    public String getPropretario() {
        return Propretario;
    }

    public void setPropretario(String Propretario) {
        this.Propretario = Propretario;
    }

    public int getNumTel() {
        return NumTel;
    }

    public void setNumTel(int NumTel) {
        this.NumTel = NumTel;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getOperadora() {
        return Operadora;
    }

    public void setOperadora(String Operadora) {
        this.Operadora = Operadora;
    }

    public abstract void recarregar( double recarga);
    
    public boolean transferir( Cartao c, double val_transferencia){
        
        if( c.Saldo> val_transferencia){
            this.Saldo+=val_transferencia;
            c.Saldo-=val_transferencia;
            return true;
            
           
        }
    return false;
    }
    
    public int compareTo(Object o){
        Cartao d=(Cartao)o;
        if(this.Saldo>d.Saldo) return 1;
        if(this.Saldo<d.Saldo) return -1;
        return 0;
                
        
        
        
        
    }

    @Override
    public String toString() {
        return "Cartao{" + "Propretario=" + Propretario + ", NumTel=" + NumTel + ", Saldo=" + Saldo + ", Operadora=" + Operadora + '}';
    }

    public boolean toSring() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
   
}
