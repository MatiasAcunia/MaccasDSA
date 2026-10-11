package dev.maccas.dsa.learning;

import java.util.NoSuchElementException;

class nodoListaD {
  public int dato;
  public nodoListaD sig;
  public nodoListaD ant;

public nodoListaD(int dato) {
     this.dato = dato;
     this.sig = null;
     this.ant = null;
}

};

class listaD {
 private nodoListaD head;
 private nodoListaD tail;
 private int tam;


listaD() {
    this.head = null;
    this.tail = null;
    this.tam = 0; 
}

    public void cons(int value) {
    //PRE: NULL
    //POST: Agrega un elemento al inicio
        nodoListaD nuevo = new nodoListaD(value);
        nuevo.sig = this.head;
        if (this.head != null) this.head.ant = nuevo;
        this.head = nuevo;
        this.tam++;

        if (this.tail == null) this.tail = nuevo;
    }


    public void snoc(int value) {
    //PRE: NULL
    //POST: Agrega un elemento al final

        nodoListaD nuevo = new nodoListaD(value);
        nuevo.ant = this.tail;
        if (this.tail != null) this.tail.sig = nuevo;
        this.tail = nuevo;
        this.tam++;
        
        if (this.head == null) this.head = nuevo;
    
    }

    
    public int get(int index, nodoListaD iter, int i) {
    //PRE: iter == this.head; i = 0
    //POST devuelve el elemento en ese indice en caso de haberlo

        if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

        if (index > this.tam - 1) throw new IndexOutOfBoundsException("Índice inválido");
        
        if (i == index) return iter.dato;

        return get(index, iter.sig, i + 1);

    }

    public void insertar(int index, int value) {
    //PRE: NULL
    //POST: Inserta el valor en la posición index

        if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

        if (index > this.tam) throw new IndexOutOfBoundsException("Índice inválido");

        int i = 0;
        nodoListaD iter = this.head;

        while (i != index && iter != null){

            iter = iter.sig;
            i++;

        }

        nodoListaD nuevo = new nodoListaD(value);
        

        if (this.tam == 0) {

            this.head = nuevo;
            this.tail = nuevo;

        }else if (index == 0) {

            this.head.ant = nuevo;
            nuevo.sig = this.head;
            this.head = nuevo;

        } else if (index == this.tam) {

            this.tail.sig = nuevo;
            nuevo.ant = this.tail;
            this.tail = nuevo;

        } else if (iter != null){

            nuevo.sig = iter;
            nuevo.ant = iter.ant;
            iter.ant = nuevo;
            nuevo.ant.sig = nuevo;

        }

        this.tam++;
    }

    public int removeFirst() {
    //PRE: NULL
    //POST: Elimina y devuelve el primer elemento

        if (this.head == null) throw new NoSuchElementException("La lista está vacía");


        nodoListaD temp = this.head;
        int tempi = temp.dato;

        if (this.tam == 1){ 
            
            this.tail = null;
            this.head = null;
        } else {

            this.head = this.head.sig;
            this.head.ant = null;
        }
        this.tam--;

        return tempi;
    }

    public int removeAt(int index) {
    //PRE: NULL
    //POST: Elimina y devuelve el elemento ubicaod en index

        if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

        if (index > this.tam - 1) throw new IndexOutOfBoundsException("Índice inválido");

        if (index == 0) {

            return removeFirst();

        }

        int i = 0;
        nodoListaD iter = this.head;

        while (i != index){

            iter = iter.sig;
            i++;

        }

        if (this.tail == iter){

            int tempi = this.tail.dato;
            this.tail = this.tail.ant;
            this.tail.sig = null;
            this.tam--;

            return tempi;

        } else {

            iter.sig.ant = iter.ant;
            iter.ant.sig = iter.sig;
            this.tam--;
            return iter.dato;

        }
    }

    public int size() {
    //PRE: NULL
    //POST: Retorna el tamaño de la lista

        return this.tam;

    }

    public void clear() {
    //PRE: NULL
    //POST: Limpia la lista

        this.head = null;
        this.tail = null;
        this.tam = 0;
            
    }

    public int first() {
    //PRE: this.head != NULL
    //POST: Retorna el dato del primer elemento

        
        return this.head.dato;

    }

    public int last() {
    //PRE: this.tail != NULL
    //POST: Retorna el dato del ultimo elemento

        return this.tail.dato;

    }

    
    public boolean isSorted(nodoListaD iter) {
    //PRE: iter == this.tail
    //POST: Retorna true si la lista esta ordenada; false en caso contrario
        
        if (iter == null) {
            
            return true;

        }else if ((iter.ant != null) && (iter.dato < iter.ant.dato)){

            return false;

        }

        return isSorted(iter.ant);
    }

    public listaD append(listaD l1, listaD l2) {
    //PRE: NULL
    //POST: Retorna una nueva lista formada por las listas indicadas
        listaD nueva = new listaD();

        nodoListaD iter = l1.head;
        int size = 0;
        nodoListaD ant = null;

        while (iter != null) {
            nodoListaD nuevo = new nodoListaD(iter.dato);
            if (nueva.head == null) {
                nueva.head = nuevo;
            } else {
                ant.sig = nuevo;
                nuevo.ant = ant;
            }
            ant = nuevo;
            size++;
            iter = iter.sig;
        }

        iter = l2.head;

        while (iter != null) {
            nodoListaD nuevo = new nodoListaD(iter.dato);
            if (nueva.head == null) {
                nueva.head = nuevo;
            } else {
                ant.sig = nuevo;
                nuevo.ant = ant;
            }
            ant = nuevo;
            size++;
            iter = iter.sig;
        }

        nueva.tail = ant;
        nueva.tam = size;

        return nueva;
    }
}    
