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
public class Calculos {

    public Calculos() {
        
    }
    
    public double sumatoria (LinkedList list){
        
        double suma = 0.0;
        
        for (int i=1;i<=list.size() ; i++  ){
            suma += list.get(i).getNum();
        }
        return suma;
    }
    
    public double media (LinkedList list){
        
        double res = sumatoria(list) / list.size();
        return res;
        
    }
    
    public double desviacionEstandar(LinkedList list){
        double media = media(list);
        double suma = 0.0; 
        for (int i=1; i<=list.size() ; i++ ){
        	
            suma += Math.pow(list.get(i).getNum()-media, 2);
        }
        double res = Math.sqrt(suma/(list.size()-1));
        res = Math.round(res*100.0)/100.0;
        
        return res;
    }
    
}
