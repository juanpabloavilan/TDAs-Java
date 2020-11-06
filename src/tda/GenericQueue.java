/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

import javax.swing.JSplitPane;

/**
 *
 * @author AVILAN MORENO
 */
public class GenericQueue <Item> {
    private Item a[];
    private int num;
    
    public GenericQueue(){
        a = (Item[])new Object[1];
        num = 0;
    }
    
    public boolean isEmpty(){return num == 0;}
    
    public int size(){ return num;}
    
    public void enqueue(Item item){
        if (num == a.length) resize(a.length * 2);
        a[num++] = item;
    }
    public Item dequeue (){
        Item item = a[0];
        moveToTheLeft();
        a[--num] = null;
        if (num > 0 && num < a.length/4) resize(a.length/2);
        return item;
    }
    private void moveToTheLeft(){
        int i = 0;
        while (i < num-1) {            
            a[i] = a[i+1];
            i++;
        }        
    }  
    private void resize (int tam){
        Item temp [] = (Item[]) new Object[tam];
        for (int i = 0; i < num; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }
    @Override
    public String toString() {
        String arrString = " ";
        for (Item item : a) {
            arrString += item + " ";
        }
        return "GenericQueue: \n" + "num: " + num + "\nStack: " + arrString;
    }
    
    
    
    
    
    
    
}
