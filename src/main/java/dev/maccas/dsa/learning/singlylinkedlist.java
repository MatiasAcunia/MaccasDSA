class nodoLista {
  private int dato;
  private nodoLista sig;

public void consN (int dato) {
     this.dato = dato;
     this.sig = null;
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
}

public void snoc(int value) {

    nodoLista nuevo = new nodoLista();
    nuevo.consN(value);
    this.head.sig = nuevo;
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
    }

    nodoLista nuevo = new nodoLista();
    nuevo.consN(value);
    nuevo.sig = iter;
    prev.sig = nuevo;
    this.tam++;
}
        
public int removeFirst() {

    if (this.head == null) throw new NullPointerException("La lista está vacía");

    nodoLista temp = this.head;
    this.head = this.head.sig;
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
    }

    prev.sig = iter.sig;
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
   int anterior = Integer.MIN_VALUE;

   while (iter != this.tail) {
       
       if (iter.dato > anterior) return false;

       iter = iter.sig;
   }

   return true;

}

public lista append (lista l1, lista l2) {
    
   lista nueva = new lista();
}
}
}  
       

