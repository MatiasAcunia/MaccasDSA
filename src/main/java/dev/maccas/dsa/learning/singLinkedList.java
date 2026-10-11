package dev.maccas.dsa.learning;

import java.util.NoSuchElementException;

class nodoLista {
  public int dato;
  public nodoLista sig;

public nodoLista(int dato) {
     this.dato = dato;
     this.sig = null;
}

};

class lista {
 private nodoLista head;
 private nodoLista tail;
 private int tam;


lista() {
    this.head = null;
    this.tail = null;
    this.tam = 0; 
}

public void cons(int value) {
    
    nodoLista nuevo = new nodoLista(value);
    nuevo.sig = this.head;
    this.head = nuevo;
    this.tam++;

    if(this.tail == null) this.tail = nuevo;
}

public void snoc(int value) {

    nodoLista nuevo = new nodoLista(value);
    if (head != null) {

        this.tail.sig = nuevo;

    } else{

        this.head = nuevo;
    }
    
    this.tail = nuevo;
    this.tam++;
}
    
public int get(int index) {
    
    if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

    if (index > this.tam - 1) throw new IndexOutOfBoundsException("Índice inválido");

    nodoLista iter = this.head;
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

    nodoLista iter = this.head;
    nodoLista prev = null;
    int i = 0;

    while (i != index) {
      prev = iter;
      iter = iter.sig;
      i++;
    }

    nodoLista nuevo = new nodoLista(value);
    nuevo.sig = iter;
    prev.sig = nuevo;
    this.tam++;
}
        
public int removeFirst() {

    if (this.head == null) throw new NoSuchElementException("La lista está vacía");

    nodoLista temp = this.head;
    this.head = this.head.sig;
    if (this.tam == 1) {

        this.tail = null;

    }
    this.tam--;
    return temp.dato;
        
}

public int removeAt(int index) {
    
    if (index < 0) throw new IndexOutOfBoundsException("Índice inválido");

    if (index > this.tam - 1) throw new IndexOutOfBoundsException("Índice inválido");

    nodoLista iter = this.head;
    nodoLista prev = null;
    int i = 0;

    while (i != index) {
      prev = iter;
      iter = iter.sig;
      i++;
    }

    this.tam--;
    if (index != 0) {  
        prev.sig = iter.sig;
    }else {
        this.head = head.sig;
    }

    if (index == this.tam) this.tail = prev;
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

   nodoLista iter = this.head;
  

   while (iter != this.tail) {
       
       if (iter.dato > iter.sig.dato) return false;

       iter = iter.sig;
   }

   return true;

}

public lista append (lista l1, lista l2) {
    
   lista nueva = new lista();

   nodoLista iter = l1.head;

   while (iter != null) {

       nueva.snoc(iter.dato);
       iter = iter.sig;
   }

   iter = l2.head;

   while (iter != null) {

       nueva.snoc(iter.dato);
       iter = iter.sig;
   }

   return nueva;
}
}
