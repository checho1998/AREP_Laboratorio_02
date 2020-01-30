/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.LinkedList;

/**
 *
 * @author sergio.nunez
 */

public class Nodo {
    
    private double num;
    private Nodo next = null;
    private Nodo back = null;
    
    public Nodo (double valor){
        num = valor ;
    }
    /**
     * cambia el valor del nodo anterior a este
     * @param back
     */
    public void setBack(Nodo back) {
        this.back = back;
    }
    /**
     * cambia el valor del nodo siguiente a este
     * @param next
     */
    public void setNext(Nodo next) {
        this.next = next;
    }
    /**
     * cambia el valor del nodo
     * @param num double
     */
    public void setNum(double num) {
        this.num = num;
    }
    /**
     * retorna el nodo anterior a este
     * @return Nodo
     */
    public Nodo getBack() {
        return back;
    }
    /**
     * retorna el nodo que le sigue
     * @return Nodo siguiente
     */
    public Nodo getNext() {
        return next;
    }
    /**
     * retorna el valor del nodo
     * @return num valor
     */
    public double getNum() {
        return num;
    }
    
    /**
     * Compara si otro nodo es igual a este
     * @param nodo
     * @return boolean
     */
	public boolean equalsNodo(Nodo nodo) {
		boolean flag = false;
		if (num == nodo.getNum()) {
			flag = true;
		}
		return flag;
	}

	
    
}
