package dev.maccas.dsa.learning;

class DynamicArray {

    private int[] array;
    private int tamaño; //Elementos de la secuencia
    private int capacidad; //Posiciones disponibles en el almacenamiento
    
    public DynamicArray(){
    //PRE : NULL
    //POST : Se crea un Array Dinamico de tamaño 10

        this.array = new int[10];
        this.tamaño = 0;
        this.capacidad = 10;
    }

    public int size(){
    //PRE : El objeto existe y está en un estado válido
    //POST : se devuelve los elementos ocupados del array

        return tamaño;
    }

    public int capacity(){
    //PRE : El objeto existe y está en un estado válido
    //POST : se devuelve las posiciones disponibles del array

        return capacidad;
    }

    public boolean isEmpty(){
    //PRE : El objeto existe y esta en un estado valido
    //POST : Se devuelve true si el array esta vacio; false si no esta vacio

        return tamaño == 0;
    }

    public int get(int index){
    //PRE : 0 ≤ index < tamaño()
    //POST : Se devuelve el valor en el indice 'index'

        return array[index];
    }

    public void set(int index, int value){
    //PRE : El objeto existe y está en un estado válido; 0 ≤ index < tamaño()
    //POST : El elemento en index pasa a ser value

        array[index] = value;    
    }

    public void add(int value){
    //PRE : El objeto existe y está en un estado válido
    //POST :  El valor nuevo pasa a ocuapr el final de la secuencia;
    //        tamaño aumenta en 1  

        if (tamaño < capacidad){

            array[tamaño] = value;
            tamaño++;

        } else if (tamaño == capacidad){

            int[] temp = new int [capacidad + 1];

            for (int i = 0; i < capacidad; i++){

                 temp[i] = array[i];

            }

            temp[capacidad] = value;
            capacidad++;
            tamaño++;

            array = temp;
        }
    }

    public void insert(int index, int value){
    //PRE : 0 ≤ index ≤ size();
    //POST : value esta en la posicion index
        
        if (index < 0 || index > tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }

        
        if (tamaño == capacidad) {
            this.capacidad = this.capacidad * 2;
            int[] nuevoArreglo = new int[this.capacidad];
            
            for (int i = 0; i < tamaño; i++) {
                nuevoArreglo[i] = this.array[i];
            }
            this.array = nuevoArreglo;
        }

        
        for (int i = tamaño; i > index; i--) {
            this.array[i] = this.array[i - 1];
        }

        
        this.array[index] = value;

    
        this.tamaño++;
    }


    public int removeAt(int index){
     
        if (index < 0 || index >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango: " + index);
        }

       
        int valorEliminado = this.array[index];

       
        for (int i = index; i < tamaño - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

       
        this.tamaño--;

       
        return valorEliminado;
    }

    public void clear(){

         this.tamaño = 0;

    }

}