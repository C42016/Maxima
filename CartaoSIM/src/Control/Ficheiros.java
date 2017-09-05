/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cartao;
import Model.CartaoVodacom;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Estudante
 */
public class Ficheiros {
   
    private static ArrayList<Cartao> card= new ArrayList<Cartao>();

   /* public static void Transferir(int num, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void Transferir(int num, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    public static void Transferir(int num, double valor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void recarregar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        private ObjectOutputStream gravador;
        private ObjectInputStream leitor;
        private String nomeFicheiro="Cartoes.dat";

        private void ler(){
        
        try {
            leitor= new ObjectInputStream(new FileInputStream(nomeFicheiro));
            card= (ArrayList<Cartao>) leitor.readObject();
          
            leitor.close();
        } catch (FileNotFoundException ex) {
           gravar(); 
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
           
        }
        
        
        
        }
        
        private  void gravar(){
        
        try {
            gravador= new ObjectOutputStream(new FileOutputStream(nomeFicheiro));
            gravador.writeObject(card);
            gravador.close();
        } catch (FileNotFoundException ex) {
            try {
                gravador.writeObject(card); 
                gravador.flush();
            gravador.close();
            } catch (IOException ex1) {
              
            }
           
        } catch (IOException ex) {
           
        }
        
        }
 public  void ListarCartoes() throws IOException, ClassNotFoundException{
     
     try{
          try(ObjectInputStream in = new ObjectInputStream( new FileInputStream("Cartoes.dat")) ){
              card = (ArrayList)in.readObject();
           //   Collections.sort(card);
              for (Iterator<Cartao> it = card.iterator(); it.hasNext();) {
                  Cartao cd = it.next();
                  System.out.println(cd.toSring());
              }
              
          } 
     }catch (IOException ex){
         System.out.println(ex.getMessage());
     }
 }
   
 public  void registarcartao(String pais, String Propretario, int NumTel, double Saldo, String Operadora )
 {
        //To change body of generated methods, choose Tools | Templates.
         
     CartaoVodacom v = new CartaoVodacom(pais,Propretario,NumTel,Saldo,Operadora) {};
         
             card.add(v);
             gravar();
}

    public void CartaoVodam(String Proprietario, int Num, String Pais) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}