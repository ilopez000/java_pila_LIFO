
package com.mycompany.pilalifo;


public class PilaLIFO {

    public static void main(String[] args) {
        //creamos una pila LIFO
        Pila p=new Pila();
        
        //añadimos elementos a la pila LIFO
        p.push(100);
        p.push(200);
        p.push(300);
        p.push(400);
        p.push(500);
        
        System.out.println("Pila después de añadir 5 elementos");
        p.imprimir_pila();
        
        System.out.println("Desapilamos el elemento que se encuentra en la cima con un pop");
        System.out.println("El elemento de la cima es: "+p.pop());
        System.out.println("Estado de la pila después de hacer un pop");
        p.imprimir_pila();
        System.out.println("El elemento de la cima es: "+p.pop());
        System.out.println("Estado de la pila después de hacer un nuevo pop");
        p.imprimir_pila();
        
        
        
    }
}
