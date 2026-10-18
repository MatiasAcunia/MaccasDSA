package dev.maccas.dsa.learning;

import java.util.NoSuchElementException;

class NodoStack {
    public int dato;
    public NodoStack sig;

    public NodoStack(int dato){
        this.dato = dato;
    }

};

class Stack {
    private NodoStack top;
    private int tam;

    Stack() {
        this.top = null;
        this.tam = 0;
    }

    public void push (int dato) {
    //Inserta un elemento en la cima de la pila    

        NodoStack nuevo = new NodoStack(dato);
        nuevo.sig = this.top;
        this.top = nuevo;
        this.tam++;
    }

    public int pop() {
    //Elimina y devuelve el elemento de la cima.

        if (this.top == null) throw new NoSuchElementException("La lista está vacía");

        NodoStack nuevo = this.top;
        this.top = this.top.sig;
        this.tam--;

        return nuevo.dato;
    }

    public int peek() {
    //Devuelve el elemento de la cima sin eliminarlo.

        return this.top.dato;
    }

    public boolean isEmpty() {
    //Devuelve true si la pila está vacía y false en caso contrario.

        return (this.top == null);
    }

    public int size() {
    //Devuelve la cantidad de elementos almacenados.

        return this.tam;
    }
}
