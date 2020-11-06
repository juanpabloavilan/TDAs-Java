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
public class FixedCapacityStackOfStrings {
    private String a [];
    private int num;
    
    public FixedCapacityStackOfStrings(int cap){
        a= new String[cap];
        num = 0;
    }
    
    public void push(String item){a[num++] = item;}
    public String pop (){return a[--num];}
    public boolean isEmpty(){return num == 0;}
    public int size (){return num;}
}
