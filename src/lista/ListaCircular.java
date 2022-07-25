/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author LohannaStan
 */
public class ListaCircular {
     //Atributos
    private Nodo ultimo;

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    //Constructor
    public ListaCircular(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    //Este metodo agrega nodos al inicio 
    public void ingresarInicio(Object elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (ultimo == null) {
            nuevo.setSig(nuevo);
            ultimo = nuevo;
            System.out.println("ingresado");
        } else {
            nuevo.setSig(ultimo.getSig());
            ultimo.setSig(nuevo);
            ultimo= nuevo;
        }
    }
}
