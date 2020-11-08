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
public class MinPQ<Item extends Comparable<Item>>{
    private Item pq[];
    private int N = 0;
 
  

    public MinPQ(Item[] a){
       N = 0;
       pq = (Item[]) new Comparable[a.length+1];
       for(int k = 1; k < pq.length; k++){
           if (a[k-1]!=null) {
                insert(a[k-1]);
           }
                      
       }          
           
    }
    
    public void insert(Item v){ //Pag 317
        pq[++N] = v;
        swim(N);
    }
    public Item min(){
        return pq[1];
    }
    public Item delMin(){
        Item min = pq[1];
        exch(1, N--);
        pq[N+1]=null;
        sink(1);
        return min();
    }
    public boolean isEmpty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    
    private boolean less(int i, int j){ //Mas grande
        return pq[i].compareTo(pq[j]) > 0;
    }
    private void exch(int i, int j){
        Item t = pq[i];
        pq[i]=pq[j];
        pq[j]=t;
    }
    private void swim(int k){
        while (k > 1 && less(k/2, k) ) {            
            exch(k/2, k);
            k = k/2;
        }
    }
    private void sink(int k){//Entra padre
        while(2*k <= N){ //Pos hijo menor o igual al limite del arreglo?
            int j = 2*k; //Hijo
            if (j<N && less(j, j+1)) j++; //el hermano tiene mas prioridad que el hijo?  ve al hermano : quedate ahi ;
            if (!less(k, j)) break; //El hijo no tiene mayor prioridad que el papa
            exch(k, j); //Cambia a padre por el hijo
            k=j;
        }
    }
    public Item[] pqToArr(){
        return pq;
    }   
}
