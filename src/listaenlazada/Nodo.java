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
    
    protected int valor;
    protected Nodo siguiente;
    protected Nodo anterior;
    
    public Nodo(int x) {
        valor = x;
        siguiente = null;
        anterior = null;
    }
    
    public void agregarNodoSiguiente(Nodo nodoSiguiente) {
        siguiente = nodoSiguiente;
    }
    
    public void agregarNodoAnterior(Nodo nodoAnterior) {
        anterior = nodoAnterior;
    }
    
    public int actualizarValor(int nuevoValor) {
        this.valor = nuevoValor;
        return this.valor;
    }
    
}
