/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.LinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author sergio.nunez
 */
public class LinkedList implements List<Nodo>{
    
    int size = 0;
    Nodo primero = null;
    Nodo ultimo = null;
    
    public LinkedList(){
        
    }
    
    /**
     * retorna el tamaño de la LinkedList
     * @return size 
     */
    public int getSize() {
        return size;
    }
    
    
    /**
     * cambia el tamaño de la LinkedList
     * @param size
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Este metodo agrega un nodo al final de la LinkedList
     * @param nod
     * @return flag
     */
    
    public boolean add(Nodo nod){
        boolean flag; 
        if (size == 0){
            primero = nod;
            ultimo = nod;
            flag = true;
            size += 1;
        }
        else if (size > 0){
            nod.setBack(ultimo);
            ultimo.setNext(nod);
            ultimo = nod;
            flag =  true;
            size += 1;
        }
        else{
            flag =false ;
        }
        return flag;
    }
    
    /**
     * retorna el tamaño de la LinkedList
     * @return size
     */
    public int size() {
        
        return size;
        
    }

    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Iterator<Nodo> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(Collection<? extends Nodo> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(int index, Collection<? extends Nodo> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Este metodo retorna el nodo de la posicion que se le indica
     * 
     * @param index
     * @return encontrado 
     */
    public Nodo get(int index) {
        try {
        	Nodo encontrado = null;
        	if ( index <= size && index >= 0 ){
                encontrado = primero;
                for (int i = 0;i<index-1;i++){
                    encontrado = encontrado.getNext();
                }
            }
            else{
                System.out.println("Posicion fuera de rango");
            }
            return encontrado;
            
		} catch (Exception e) {
			return null;
		}
    }

    public Nodo set(int index, Nodo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int index, Nodo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<Nodo> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<Nodo> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Nodo> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Este metodo retorna el nodo eliminado de la LinkedList
     * @param index
     * @return tem
     */

    public Nodo remove(int index) {
        Nodo tem = null;
        if ( index <= size && index-1 >= 0 ){
            tem = primero;
            if (index != 1) {
            	for (int i = 0;i < index-1;i++){
                    tem = tem.getNext();
                }
            	if (ultimo.equalsNodo(tem)) {
            		ultimo = ultimo.getBack();
            		ultimo.setNext(null);
            		size-=1;
            	}
            	else {
            		Nodo atras = tem.getBack();
                    Nodo adelante = tem.getNext();
                    atras.setNext(adelante);
                    adelante.setBack(atras);
                    tem.setBack(null);
                    tem.setNext(null);
                    size -= 1;
            	}
            }
        }
        else{
            
        }
        return tem;
    }
}
