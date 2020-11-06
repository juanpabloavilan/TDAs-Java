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
public class GenericStack <Item> {
    private Item[] a;
    private int num;
    
    public GenericStack(){
       a = (Item[]) new Object[1];
       num = 0;
    }
    
    public int size(){
        return  num;
    }
    public boolean isEmpty(){
        return num == 0;
    }
    
    public Item pop(){
        Item item = a[--num];
        a[num] = null;
        if (num > 0 && num == a.length/4) resize(a.length/2);           
        return item;                    
    }
    public void push(Item item){
        if (num == a.length) 
            resize(2*a.length);
        a[num++] = item;
    }
    private void resize(int tam){
        Item[] arr2 = (Item[]) new Object[tam];
        for (int i = 0; i < num; i++) {
            arr2[i] = a[i];
        }
        a = arr2;
    }

    @Override
    public String toString() {
        String arrString = " ";
        for (Item item : a) {
            arrString += item + " ";
        }
        return "GenericStack: \n" + "num: " + num + "\nStack: " + arrString;
    }
    
    
    
     
}
