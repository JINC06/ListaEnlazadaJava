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
    
    private Nodo inicio;
    private Nodo fin;
    
    
    public ListaEnlazada() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean estaVacia() {
        return this.inicio == null;
    }
    
    public void agregarAlInicio(String val) {
        
        if(estaVacia()){
            inicio = new Nodo(val, inicio);
            fin = inicio;
        }else{
            inicio = new Nodo(val, inicio);
        }
    }
    
    public void agregarAlFinal(String val) {
        
        if(estaVacia()){
            inicio = new Nodo(val);
            fin = inicio;
        }else{
            fin.siguiente = new Nodo(val);
            fin = fin.siguiente;
        }
    }
    
    public String primerElemento() {
        return inicio.valor;
    }
    
    public String ultimoElemento() {
        return fin.valor;
    }
    
    public void mostrarLista() {
        Nodo aux = this.inicio;
        while(aux != null){
            System.out.print("["+ aux.valor +"]-->");
            aux = aux.siguiente;
        }
    }
    
    
    public int cantidadNodos() {
        Nodo aux = this.inicio;
        int contador = 0;
        while(aux != null){
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }
    
    public boolean buscarDato(String d) {
        boolean encontrado = false;
        Nodo aux = inicio;
        while(encontrado != true && aux != null) {
            if(d.equals(aux.valor)) {
                encontrado = true;
                break;
            }else{
                aux = aux.siguiente;
            }
        }
        
        return encontrado;
    }
    
    public String eliminarDatoInicio() {
        String eliminado = inicio.valor;
        int contador = cantidadNodos();
        if(contador == 1){
            inicio = null;
            fin = inicio;
        }else{
            inicio = inicio.siguiente; //inicio.siguiente Accedemos al siguiente del nodo del cual apunta inicio.
        }
        
        return eliminado;
    }
    
    public String eliminarDatoFin() {
        String eliminado = fin.valor;
        Nodo aux = inicio;
        while(aux.siguiente != fin) {
            aux = aux.siguiente;
        }
        
        fin = aux;
        fin.siguiente = null;
        
        return eliminado;
    }
    

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public Nodo getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(Nodo fin) {
        this.fin = fin;
    }
    
}
