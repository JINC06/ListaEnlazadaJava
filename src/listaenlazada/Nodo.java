/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaenlazada;

/**
 *
 * @author julio.nava
 */
public class Nodo {
    
    public String valor;
    public Nodo siguiente;
    
    public Nodo(String v, Nodo sig) {
        this.valor = v;
        this.siguiente = sig;
    }
    
    public Nodo(String v){
        this.valor = v;
        this.siguiente = null;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
