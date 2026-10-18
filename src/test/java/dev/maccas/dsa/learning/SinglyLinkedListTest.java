package dev.maccas.dsa.learning;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


class SinglyLinkedListTest {

    @Test
    void listaNuevaTieneTamanioCero() {

        lista l = new lista();

        assertEquals(0, l.size());
    }

    @Test
    void listaNuevaNoTieneTamanioMayorQueCero() {

        lista l = new lista();

        assertFalse(l.size() > 0);

    }
}