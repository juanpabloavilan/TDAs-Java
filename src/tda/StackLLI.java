/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda;

import java.util.Iterator;

/**
 *
 * @author AVILAN MORENO
 * @param <Item>
 */
public class StackLLI<Item> implements Iterable<Item>{
    private int num;
    private Node first;

    public StackLLI() {
        num = 0;
        first = null;
    }

  
    private class Node{
        Item item;
        Node next;
    }
    
    public void push(Item item){
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        num++;
    }
    
    public Item pop(){
        Item item = first.item;
        first = first.next;
        num--;
        return item;        
    }
    
    @Override
    public Iterator<Item> iterator() {
       return new StackLLIterator();
    }
    
    private class StackLLIterator implements Iterator<Item>{
        
        Node current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public Item next() {
            Item item= current.item;
            current = current.next;
            return item;
            
        }
        
    }
    
    
}
