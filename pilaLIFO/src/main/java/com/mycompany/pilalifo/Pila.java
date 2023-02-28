
package com.mycompany.pilalifo;
import java.util.ArrayList;

public class Pila {
    
    private ArrayList<Integer> pila;

    //función creadora, inicializa el ArrayList pila
    //por supuesto pila inicialmente está vacía
    public Pila() {
        pila = new ArrayList<>();
    }
    
    //el método push añade un nuevo elemento a la pila
    public void push(int item) {
        pila.add(item);
    }

    //la función pop devuelve el último elemento que se ha incorporado
    //a la pila, y lo elimina de la pila. Siempre y cuando haya
    //algún elemento en la pila.
    public int pop() {
        if(!pila.isEmpty()){
            int item = pila.get(pila.size()-1);
            pila.remove(pila.size()-1);
            return item;
        }else{
            throw new IllegalStateException("La cola está vacía");
        }
    }

    //devuelve el elemento que se encuentra en la cima de la pila
    public int peek() {
        if (pila.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return pila.get(pila.size()-1);
    }
    
    //devuelve un booleano que nos dice si la pila está vacía
    public boolean isEmpty() {
        return pila.isEmpty();
    }
    
    //devuelve el tamaño de la pila
    public int size() {
        return pila.size();
    }   
    
    //imprime la pila desde la cima hasta la base
    public void imprimir_pila(){
        System.out.println("-----");
        for(int i=pila.size()-1; i>=0; i--){
            System.out.println(pila.get(i));
        }
        System.out.println("-----");
    }
}




