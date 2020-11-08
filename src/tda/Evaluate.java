/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;



/**
 *
 * @author AVILAN MORENO
 */
public class Evaluate {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Integer inte[] = {200, 10, -1, -20, 70, 800, -100, 5, 2, 0};
        MinPQ<Integer> hola = new MinPQ<>(inte);
        while (!hola.isEmpty()) {            
            System.out.println(hola.delMin());
        }
        
        
        
        
    }
        

}
