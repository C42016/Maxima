/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Estudante
 */
public abstract class CartaoVodacom extends Cartao {
    private String pais;

    public CartaoVodacom(String pais, String Propretario, int NumTel, double Saldo, String Operadora) {
        super(Propretario, NumTel, Saldo, Operadora);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void recarregar(double recarga) {
        
        this.setSaldo(this.getSaldo()+recarga+0.5*recarga);}
    
        
    public void recarregar(double recarga, double val_perctual ) {
        this.setSaldo(this.getSaldo()+recarga+val_perctual*val_perctual);
        
    }    
        
    

    @Override
    public String toString() {
        return "CartaoVodacom{" + "pais=" + pais + '}';
    }
   
   
}
