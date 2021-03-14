/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1bryanpaz;

/**
 *
 * @author Bryan Paz Ramirez
 */
public class Nodo {

    public Nodo Derecha;
    public Nodo Izquierda;
    public int Dato;
    public int dato = 0;
    
    public Nodo(){
        Derecha = null;
        Izquierda = null;
        Dato = 0;
    }
    
    public Nodo(int dato){
        this.Dato = dato;
    }

    /**
     * @return the Derecha
     */
    public Nodo getDerecha() {
        return Derecha;
    }

    /**
     * @param Derecha the Derecha to set
     */
    public void setDerecha(Nodo Derecha) {
        this.Derecha = Derecha;
    }

    /**
     * @return the Izquierda
     */
    public Nodo getIzquierda() {
        return Izquierda;
    }

    /**
     * @param Izquierda the Izquierda to set
     */
    public void setIzquierda(Nodo Izquierda) {
        this.Izquierda = Izquierda;
    }

    /**
     * @return the Dato
     */
    public int getDato() {
        return Dato;
    }

    /**
     * @param Dato the Dato to set
     */
    public void setDato(int Dato) {
        this.Dato = Dato;
    }
    
     public int InOrden(Nodo raiz)
    {
        
        
        
        if(raiz!=null)
        {
            dato = dato + raiz.getDato();
            InOrden(raiz.getIzquierda());
            System.out.println("dato:  "+ raiz.getDato());
            InOrden(raiz.getDerecha());
            System.out.println("dato:  "+ raiz.getDato());
            
            
        }
        
        return dato;
    }
    
    
}
