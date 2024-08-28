/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaenlazada;

/**
 *
 * @author julio.nava
 */
public class ListaEnlazada {
    
    protected Nodo cabeza;
    protected Nodo cola;
    
    public ListaEnlazada(Nodo primerNodo) {
        this.cabeza = primerNodo;
        this.cola = primerNodo;
    }
    
    public void insertarNodoAlFinal(Nodo nuevoNodo) {
        cola.siguiente = nuevoNodo;
        cola = cola.siguiente;
    }
    
    public void borrarNodo(Nodo nodo) {
        nodo.siguiente = null;   
    }
    
    public Nodo buscarNodo(int valorABuscar) {
        Nodo nodoActual = cabeza;
        while (nodoActual != null) {
            if (nodoActual.valor == valorABuscar){
                return nodoActual;
            }
            nodoActual = nodoActual.siguiente;
        }
        return null;
    }
    
    public void borrarNodoPorValor(int valor) {
        Nodo nodoABorrar = buscarNodo(valor);
        if(nodoABorrar != null) {
            nodoABorrar.siguiente = null;
        }
    }
    
}
