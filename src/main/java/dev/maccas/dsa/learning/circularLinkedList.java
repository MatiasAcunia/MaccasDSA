package dev.maccas.dsa.learning;

import java.util.NoSuchElementException;

class nodoListaC {
  public int dato;
  public nodoListaC sig;

public nodoListaC(int dato) {
     this.dato = dato;
     this.sig = null;
}

};

class listaC {
 private nodoListaC head;
 private nodoListaC tail;
 private int tam;


listaC() {
    this.head = null;
    this.tail = null;
    this.tam = 0; 
}

public void cons(int value) {
    
    nodoListaC nuevo = new nodoListaC(value);
    nuevo.sig = this.head;
    this.head = nuevo;
    this.tam++;

    if(this.tail == null) this.tail = nuevo;
    this.tail.sig = nuevo;
}

public void snoc(int value) {

    nodoListaC nuevo = new nodoListaC(value);
    if (head != null) {

        this.tail.sig = nuevo;

    } else{

        this.head = nuevo;
    }
    
    this.tail = nuevo;
    this.tail.sig = this.head;
    this.tam++;
}
    
public int get(int index) {
    
    if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

    if (index > this.tam - 1) throw new IndexOutOfBoundsException("Índice inválido");

    nodoListaC iter = this.head;
    int i = 0;

    while (i != index) {
      iter = iter.sig;
      i++;
    }


    return iter.dato;
}        

public void insertar(int index, int value) {
    
    if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

    if (index > this.tam - 1) throw new IndexOutOfBoundsException("Índice inválido");

    nodoListaC iter = this.head;
    nodoListaC prev = null;
    int i = 0;

    while (i != index) {
      prev = iter;
      iter = iter.sig;
      i++;
    }

    nodoListaC nuevo = new nodoListaC(value);
    nuevo.sig = iter;
    if (index != 0) prev.sig = nuevo;
    this.tam++;

    if (index == 0){

        this.head = nuevo;
        this.tail.sig = this.head;

    }    
    if (index == this.tam){

        this.tail.sig = nuevo;
        this.tail = nuevo;
        this.tail.sig = this.head;

    }    
}
        
public int removeFirst() {

    if (this.head == null) throw new NoSuchElementException("La lista está vacía");

    nodoListaC temp = this.head;
    this.head = this.head.sig;
    if (this.tam == 1) {

        this.tail = null;

    }
    this.tam--;

    this.tail.sig = this.head;
    return temp.dato;
        
}

public int removeAt(int index) {
    
    if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

    if (index > this.tam - 1) throw new IndexOutOfBoundsException("Índice inválido");

    nodoListaC iter = this.head;
    nodoListaC prev = null;
    int i = 0;

    while (i != index) {
      prev = iter;
      iter = iter.sig;
      i++;
    }

    this.tam--;
    if (index != 0) {  

        prev.sig = iter.sig;

    }else if(index == 0){

        this.head = head.sig;
        this.tail.sig = this.head;

    }else if(index == this.tam) {
        
        this.tail = prev;
        this.tail.sig = this.head;

    }    
    return iter.dato;
}

public int size() {

   return this.tam;

}

public void clear() {
   
   this.head = null;
   this.tail = null;
   this.tam = 0;

}

public int first() {
   
   if (this.head == null) throw new NoSuchElementException("La lista está vacía");
   return this.head.dato;

}

public int last() {
   
   if (this.tail == null) throw new NoSuchElementException("La lista está vacía");
   return this.tail.dato;

}

public boolean isSorted() {

   if (this.head == null || this.head == this.tail) return true;

   nodoListaC iter = this.head;
  

   while (iter != this.head) {
       
       if (iter.dato > iter.sig.dato) return false;

       iter = iter.sig;
   }

   return true;

}

public listaC append (listaC l1, listaC l2) {
    
   listaC nueva = new listaC();

   nodoListaC iter = l1.head;
   nodoListaC prev = null;

   int size = 0;

   if (iter == null) nueva.head = null;
   while (iter != null) {

    nodoListaC nuevo = new nodoListaC(iter.dato);
    if (iter == l1.head) nueva.head = nuevo;
    if (prev != null) prev.sig = nuevo;
    size++;

    prev = nuevo;
    iter = iter.sig;
   }

   iter = l2.head;

   if (iter == null) nueva.tail = null;
   while (iter != null) {

    nodoListaC nuevo = new nodoListaC(iter.dato);
    if (prev != null) prev.sig = nuevo;
    if (iter.sig == null) nueva.tail = nuevo;
    size++;

    prev = nuevo;
    iter = iter.sig;
   }

   nueva.tam = size;
   nueva.tail.sig = nueva.head;

   return nueva;
}
}

       

