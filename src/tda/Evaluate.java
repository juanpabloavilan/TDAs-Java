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
        DoublyLinkedList<String> prueba = new DoublyLinkedList<>();
        prueba.addFirst("hi");
        for (int i = 0; i < 20; i++) {
            prueba.add(i, "Hola" + i);
        }
        prueba.addFirst("p");
        prueba.add(5, "Entrometido");
        for (String s : prueba) {
            System.out.println(s);
        }
        
        System.out.println(" ");
        for (int i = prueba.size()-1; i > 0; i--) {
            System.out.println(prueba.remove(i));
        }
        
        System.out.println("Removiendo");
        System.out.println("");
         for (String s : prueba) {
            System.out.println(s);
        }
        
        
        
        
    }
        

}
