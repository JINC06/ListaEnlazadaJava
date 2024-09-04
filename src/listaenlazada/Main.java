/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaenlazada;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author julio.nava
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //PRIMERA PARTE
        /*ListaEnlazada listaEnlazada = new ListaEnlazada();
        
        listaEnlazada.agregarAlInicio("Juan");
        listaEnlazada.agregarAlInicio("Ana");
        listaEnlazada.agregarAlInicio("Lupita");
        listaEnlazada.agregarAlInicio("Maria");
        listaEnlazada.mostrarLista();
        
        System.out.println("");
        System.out.println("------------------------------------");
        if(listaEnlazada.estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista no esta vacia");
        }
        
        System.out.println("------------------------------------");
        System.out.println("Cantidad de elementos en la lista: " + listaEnlazada.cantidadNodos());*/
        
        
        
        //SEGUNDA PARTE
        /*ListaEnlazada listaEnlazada = new ListaEnlazada();
        
        listaEnlazada.agregarAlFinal("Juan");
        listaEnlazada.agregarAlFinal("Ana");
        listaEnlazada.agregarAlFinal("Lupita");
        listaEnlazada.agregarAlFinal("Maria");
        listaEnlazada.mostrarLista();
        
        System.out.println("");
        System.out.println("------------------------------------");
        if(listaEnlazada.estaVacia()) {
            System.out.println("La lista esta vacia");
        }else{
            System.out.println("La lista no esta vacia");
        }
        
        System.out.println("------------------------------------");
        System.out.println("Cantidad de elementos en la lista: " + listaEnlazada.cantidadNodos());
        System.out.println("Primer elemento de la lista: " + listaEnlazada.primerElemento());
        System.out.println("Ultimo elemento de la lista: " + listaEnlazada.ultimoElemento());*/
        
        //----------------------------------------  04/09/2024
        
        //TERCERA PARTE
        /*ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.agregarAlFinal("Juan");
        listaEnlazada.agregarAlFinal("Ana");
        listaEnlazada.agregarAlFinal("Lupita");
        listaEnlazada.agregarAlFinal("Maria");
        listaEnlazada.mostrarLista();
        System.out.println("");
        System.out.println("------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre a buscar:");
        String buscar = sc.next();
        if(listaEnlazada.buscarDato(buscar)){
            System.out.println("El dato se encuentra.");
        }else{
            System.out.println("El dato no se encuentra.");
        }*/
        
        
        
        //CUARTA PARTE
        /*ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.agregarAlFinal("Juan");
        listaEnlazada.agregarAlFinal("Ana");
        listaEnlazada.agregarAlFinal("Lupita");
        listaEnlazada.agregarAlFinal("Maria");
        listaEnlazada.mostrarLista();
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Cantidad de elementos en la lista: " + listaEnlazada.cantidadNodos());
        System.out.println("Eliminando el primer elemento:");
        System.out.println(listaEnlazada.eliminarDatoInicio());
        System.out.println("------------------------------------");
        listaEnlazada.mostrarLista();
        System.out.println("");*/
        
        
        /*
        //QUINTA PARTE
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        listaEnlazada.agregarAlFinal("Juan");
        listaEnlazada.agregarAlFinal("Ana");
        listaEnlazada.agregarAlFinal("Lupita");
        listaEnlazada.agregarAlFinal("Maria");
        listaEnlazada.mostrarLista();
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Cantidad de elementos en la lista: " + listaEnlazada.cantidadNodos());
        System.out.println("Eliminando el ultimo elemento:");
        System.out.println(listaEnlazada.eliminarDatoFin());
        System.out.println("------------------------------------");
        listaEnlazada.mostrarLista();
        System.out.println("");
        System.out.println("------------------------------------");
        System.out.println("Cantidad de elementos en la lista: " + listaEnlazada.cantidadNodos());
        */
        
        
        //SEXTA PARTE
        mostrarMenu();
        
    }
    
    public static void mostrarMenu(){
        int opcion = 0;
        ListaEnlazada lista = new ListaEnlazada();
        
        do {
            try {
            
                opcion = Integer.parseInt( JOptionPane.showInputDialog(null, ""
                                + "1.- Agregar al inicio\n2.- Agregar al final\n"
                                + "3.- Buscar un dato\n4.- Saber la cantidad de nodos\n"
                                + "5.- Primer elemento de la lista\n"
                                + "6.- Último elemento de la lista\n"
                                + "7.- Eliminar del inicio de la lista\n"
                                + "8.- Eliminar al final de la lista\n"
                                + "9.- Saber si la lista está vacía\n"
                                + "10.- Mostrar la lista\n"
                                + "11.- Salir\n"
                                + "Ingrese una opción:\n") );
                
                switch (opcion) {
                    case 1:
                        String datoInicio = JOptionPane.showInputDialog(null, "Ingrese el dato:");
                        lista.agregarAlInicio(datoInicio);
                        break;
                    case 2:
                        String datoFinal = JOptionPane.showInputDialog(null, "Ingrese el dato:");
                        lista.agregarAlFinal(datoFinal);
                        break;
                    case 3:
                        String datoBuscar = JOptionPane.showInputDialog(null, "Ingrese el dato:");
                        if(lista.buscarDato(datoBuscar)) {
                            JOptionPane.showMessageDialog(null, "Dato encontrado en la lista");
                        }else{
                            JOptionPane.showMessageDialog(null, "Dato NO encontrado en la lista");
                        }
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Cantidad de nodos en la lista: " + lista.cantidadNodos());
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "El primer elemento de la lista es: " + lista.primerElemento());
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "El último elemento de la lista es: " + lista.ultimoElemento());
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Dato eliminado del inicio: " + lista.eliminarDatoInicio());
                        break;
                    case 8:
                        JOptionPane.showMessageDialog(null, "Dato eliminado del fin: " + lista.eliminarDatoFin());
                        break;
                    case 9:
                        if(lista.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La lista ESTA vacia");
                        }else{
                            JOptionPane.showMessageDialog(null, "La lista NO ESTA vacia");
                        }
                        break;
                    case 10:
                        lista.mostrarLista();
                        System.out.println("");
                        break;
                    case 11:
                        JOptionPane.showMessageDialog(null, "Programa finalizado.");
                        break;
                }
                
            }catch(Exception e){
                System.out.println("Error. Ingrese un entero: " + e.getMessage());
            }
            
        }while(opcion != 11);
    }
    
}
