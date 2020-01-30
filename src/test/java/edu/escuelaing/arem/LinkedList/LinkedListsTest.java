package edu.escuelaing.arem.LinkedList;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListsTest {
	
	/**
     * Prueba para agregar un nodo 
     * de una LinkedList
     */
    @Test
    public void pruebaAgregarLinkedList () {
        Nodo nod1 = new Nodo(186.0);
        Nodo nod2 = new Nodo(699.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        assertTrue(nod1.equalsNodo(list.get(1)));
        assertTrue(nod2.equalsNodo(list.get(2)));
    }
    /**
     * Prueba para Borrar un nodo 
     * de una LinkedList
     */
    @Test
    public void pruebaBorrarNodoLinkedList () {
    	Nodo nod1 = new Nodo(186.0);
        Nodo nod2 = new Nodo(699.0);
        Nodo nod3 = new Nodo(64.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        list.add(nod3);
        list.remove(2);
        assertTrue(list.getSize()==2);
    }
    /**
     * Prueba para comprobar la Media 
     * de una LinkedList
     */
    @Test
    public void pruebaLinkedListMedia () {
    	Calculos calculadora = new Calculos();
    	Nodo nod1 = new Nodo(10.0);
        Nodo nod2 = new Nodo(20.0);
        Nodo nod3 = new Nodo(30.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        list.add(nod3);
        calculadora.media(list);
        assertTrue(calculadora.media(list) == 20.0);
    }
    /**
     * Prueba para comprobar la Desviacion estandar 
     * de una LinkedList
     */
    @Test
    public void pruebaLinkedListDesviacionEstandar () {
    	Calculos calculadora = new Calculos();
    	Nodo nod1 = new Nodo(160.0);
        Nodo nod2 = new Nodo(591.0);
        Nodo nod3 = new Nodo(114.0);
        Nodo nod4 = new Nodo(229.0);
        Nodo nod5 = new Nodo(230.0);
        Nodo nod6 = new Nodo(270.0);
        Nodo nod7 = new Nodo(128.0);
        Nodo nod8 = new Nodo(1657.0);
        Nodo nod9 = new Nodo(624.0);
        Nodo nod10 = new Nodo(1503.0);
        LinkedList list = new LinkedList();
        list.add(nod1);
        list.add(nod2);
        list.add(nod3);
        list.add(nod4);
        list.add(nod5);
        list.add(nod6);
        list.add(nod7);
        list.add(nod8);
        list.add(nod9);
        list.add(nod10);
        calculadora.media(list);
        assertTrue(calculadora.desviacionEstandar(list) == 572.03);
    }
    
}
