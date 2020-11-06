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
public class FixedCapacityGenericStack <Item> {
    private Item a [];
    private int num;
    
    public FixedCapacityGenericStack(int cap){
        a = (Item[]) new Object[cap];//Cualquier clase en java hereda de la superclase object.
        
    }
    
    public void push(Item item){a[num++] = item;}
    public Item pop (){return a[--num];}
    public boolean isEmpty(){return num == 0;}
    public int size (){return num;}

    
    
}
