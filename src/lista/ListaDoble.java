/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author LohannaStan
 */
public class ListaDoble {
    public NodoDoble inicio;
    public NodoDoble ultimo;
    
    public ListaDoble(Object elemento){
        this.inicio = new NodoDoble(elemento);
    }
    //este metodo añade un elemento a la lista, al lado derecho del 
    //ultimo elemento registrado y actualiza a este elemento como ultimo
    public void Añadir(Object elemento){
        NodoDoble nuevo = new NodoDoble(elemento);
        if (this.ultimo == null){
            this.ultimo = nuevo;
            this.inicio.setSiguiente(this.ultimo);
            this.ultimo.setAnterior(this.inicio);
        } else {
            this.ultimo.setSiguiente(nuevo);
            this.ultimo.getSiguiente().setAnterior(this.ultimo);
            this.ultimo = this.ultimo.getSiguiente();
        }
    }
    //este metodo saca el ultmo de la lista y lo elimina de esta.
    //Por eso, removeUltimo porque lo remueve
    public NodoDoble EliminarUltimo(){
        NodoDoble aux = this.ultimo;
        this.ultimo = this.ultimo.getAnterior();
        return aux;
    }
    
    //este metodo saca el ultimo elemento de la lista sin eliminarlo
    //de esta, solo para su observacion sin alteracion
    public NodoDoble getUltimo(){
        return this.ultimo;
    }
    
    //este metodo recorre la lista y obtiene los valores de los elementos
    //para su posterior visualizacion 
    public String Lista(){
        String lista = "";
        NodoDoble aux = this.inicio;
        while (aux != null){
            lista += aux.getInformacion()+ "\n";
            aux = aux.getSiguiente();
        }
        return lista;
    }
}
