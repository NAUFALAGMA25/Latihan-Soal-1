/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Bank;

/**
 *
 * @author Naufal Agma
 */
public class Bank {
   int saldo = 100000;
   void simpanUang(int sld) {
        saldo = saldo + sld;
        System.out.println("Sisa Saldo saat ini Rp." + saldo);
}
   void ambilUang(int sld) {
       saldo = saldo - sld;
       System.out.println("Saldo saat ini Rp." + saldo);
   }
   void getSaldo() {
       System.out.println("Saldo saat ini." + saldo);
   }

    void simpangUang(int input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

   
