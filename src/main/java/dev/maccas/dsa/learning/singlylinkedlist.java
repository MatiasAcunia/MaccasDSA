package dev.maccas.dsa.learning;

class nodoLista {
  public int dato;
  public nodoLista sig;

public void consN (int dato) {
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
    
    nodoLista nuevo = new nodoLista();
    nuevo.consN(value);
    nuevo.sig = this.head;
    this.head = nuevo;
    this.tam++;

    if(this.tail == null) this.tail = nuevo;
}

public void snoc(int value) {

    nodoLista nuevo = new nodoLista();
    nuevo.consN(value);
    if (head != null) {

        this.tail.sig = nuevo;

    } else{

        this.head = nuevo;
    }
    
    this.tail = nuevo;
    this.tam++;
}
    
public int get(int index) {
    
    if (index < 0) return -1;

    if (index > this.tam - 1) return -1;

    nodoLista iter = this.head;
    int i = 0;

    while (i != index) {
      iter = iter.sig;
      i++;
    }


    return iter.dato;
}        

public void insertar(int index, int value) {
    
    if (index < 0) return;

    if (index > this.tam - 1) return;

    nodoLista iter = this.head;
    nodoLista prev = null;
    int i = 0;

    while (i != index) {
      prev = iter;
      iter = iter.sig;
      i++;
    }

    nodoLista nuevo = new nodoLista();
    nuevo.consN(value);
    nuevo.sig = iter;
    if (index != 0) prev.sig = nuevo;
    this.tam++;

    if (index == 0) this.head = nuevo;
    if (index == this.tam) this.tail = nuevo;
}
        
public int removeFirst() {

    if (this.head == null) throw new NullPointerException("La lista está vacía");

    nodoLista temp = this.head;
    this.head = this.head.sig;
    if (this.tam == 1) {

        this.tail = null;

    }
    this.tam--;
    return temp.dato;
        
}

public int removeAt(int index) {
    
    if (index < 0) return -1;

    if (index > this.tam - 1) return -1;

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
   
   return this.head.dato;

}

public int last() {
   
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
   nodoLista prev = null;

   int size = 0;

   if (iter == null) nueva.head = null;
   while (iter != null) {

    nodoLista nuevo = new nodoLista();
    nuevo.consN(iter.dato);
    if (iter == l1.head) nueva.head = nuevo;
    if (prev != null) prev.sig = nuevo;
    size++;

    prev = nuevo;
    iter = iter.sig;
   }

   iter = l2.head;

   if (iter == null) nueva.tail = null;
   while (iter != null) {

    nodoLista nuevo = new nodoLista();
    nuevo.consN(iter.dato);
    if (prev != null) prev.sig = nuevo;
    if (iter.sig == null) nueva.tail = nuevo;
    size++;

    prev = nuevo;
    iter = iter.sig;
   }

   nueva.tam = size;

   return nueva;
}
}

       

