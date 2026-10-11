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

    if (index > this.tam) throw new IndexOutOfBoundsException("Índice inválido");

    if (index == 0) {

        cons(value);
        return;
    }

    if (index == this.tam) {

        snoc(value);
        return;
    }

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
    prev.sig = nuevo;
    this.tam++;
}
        
public int removeFirst() {

    if (this.head == null) throw new NoSuchElementException("La lista está vacía");

    nodoListaC temp = this.head;

    if (this.tam == 1) {

        this.head = null;
        this.tail = null;
        this.tam = 0;
        return temp.dato;
    }

    this.head = this.head.sig;
    this.tam--;
    this.tail.sig = this.head;

    return temp.dato;
        
}

public int removeAt(int index) {
    
    if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

    if (index > this.tam - 1) throw new IndexOutOfBoundsException("Índice inválido");

    if (index == 0) {

        return removeFirst();
    }

    nodoListaC iter = this.head;
    nodoListaC prev = null;
    int i = 0;

    while (i != index) {
      prev = iter;
      iter = iter.sig;
      i++;
    }

    if (iter == this.tail) {

        this.tail = prev;
        this.tail.sig = this.head;

    } else {

        prev.sig = iter.sig;
    }

    this.tam--;
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
  
   while (iter != this.tail) {
       
       if (iter.dato > iter.sig.dato) return false;

       iter = iter.sig;
   }

   return true;

}

public listaC append (listaC l1, listaC l2) {
    
   listaC nueva = new listaC();

   if (l1.head != null) {

       nodoListaC iter = l1.head;

       do {

           nueva.snoc(iter.dato);
           iter = iter.sig;

       } while (iter != l1.head);
   }

   if (l2.head != null) {

       nodoListaC iter = l2.head;

       do {

           nueva.snoc(iter.dato);
           iter = iter.sig;

       } while (iter != l2.head);
   }

   return nueva;
}
}
