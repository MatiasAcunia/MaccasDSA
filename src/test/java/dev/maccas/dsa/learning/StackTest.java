package dev.maccas.dsa.learning;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;
import java.sql.Time;


class StackTest{

    @Test
    public void stackNuevaEstaVacia(){

        Stack nuevo = new Stack();

        assertTrue(nuevo.isEmpty());

    }

    @Test
    public void pushAumentaElTamanio(){

        Stack nuevo = new Stack();

        nuevo.push(2);

        assertEquals(1, nuevo.size());
    }

    @Test
    public void popRespetaOrdenLIFO(){

        Stack nuevo = new Stack();

        nuevo.push(2);
        nuevo.push(4);
        nuevo.push(3);

        assertEquals(3, nuevo.pop());
        assertEquals(4, nuevo.pop());
        assertEquals(2, nuevo.pop());
    }

    @Test
    public void peekNoEliminaElemento(){
        Stack nuevo = new Stack();

        nuevo.push(2);
        nuevo.push(4);
        nuevo.push(3);

        assertEquals(3, nuevo.peek());
        assertEquals(3, nuevo.peek());
        assertEquals(3, nuevo.size());
    }

    @Test
    public void secuenciaMixtaCoherente(){

        Stack nuevo = new Stack();
        assertTrue(nuevo.isEmpty());
        
        nuevo.push(2);
        nuevo.push(3);
        nuevo.push(4);

        assertEquals(4, nuevo.peek());
        assertEquals(4, nuevo.peek());
        assertEquals(3, nuevo.size());

        nuevo.push(20);
        assertEquals(20, nuevo.pop());
        assertEquals(4, nuevo.pop());
        assertEquals(3, nuevo.peek());
        assertEquals(2, nuevo.size());

        assertTrue(nuevo.size() > 0);
        nuevo.push(60);
        nuevo.push(50);
        nuevo.push(40);
        nuevo.push(30);

        assertEquals(30, nuevo.peek());
        assertEquals(6, nuevo.size());


    }

     @Test
    public void reutilizacionPila(){
        
        Stack nuevo = new Stack();
        assertTrue(nuevo.isEmpty());
        
        nuevo.push(2);
        nuevo.push(3);
        nuevo.push(4);

        nuevo.pop();
        nuevo.pop();
        nuevo.pop();

        assertTrue(nuevo.isEmpty());
        assertEquals(0, nuevo.size());

        nuevo.push(2);
        nuevo.push(3);

        assertEquals(3, nuevo.peek());
        assertEquals(3, nuevo.pop());
        assertEquals(2, nuevo.pop());
    }

    @Test
    public void independenciaStack(){
        
        Stack nuevo = new Stack();
        Stack nuevo2 = new Stack();

        nuevo.push(2);
        nuevo2.push(3);

        assertEquals(2, nuevo.peek());
        assertEquals(3, nuevo2.peek());

        assertEquals(2, nuevo.pop());
        assertEquals(3, nuevo2.peek());
    }

    
   @Test
    public void operacionesSobrePilaVacia(){
        
        Stack pila = new Stack();

        assertThrows(NoSuchElementException.class, () -> pila.pop());
        assertThrows(NoSuchElementException.class, () -> pila.peek());

    }

}