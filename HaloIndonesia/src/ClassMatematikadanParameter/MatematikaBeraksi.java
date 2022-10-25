/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClassMatematikadanParameter;

/**
 *
 * @author Naufal Agma
 */
public class MatematikaBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematika M=new Matematika();
        M.pertambahan(20, 20);
        M.pengurangan(10, 5);
        M.perkalian(10, 20);
        M.pembagian(20, 2);
        
        MatematikaCanggih MC=new MatematikaCanggih();
        MC.pertambahan(12.5, 28.7, 14.2);
        MC.pengurangan(12, 28, 14);
        MC.pertambahan(23, 24);
    }
    
}
