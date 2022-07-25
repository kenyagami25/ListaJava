/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author LohannaStan
 */
public class ListaLineal {

    //Atributos
    private Nodo inicio;

    //Constructor
    public ListaLineal(Nodo inicio) {
        this.inicio = inicio;
    }

    //Set y Get
    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    //Este metodo agrega nodos al inicio 
    public void ingresarInicio(Object elemento) {
        Nodo nuevo = new Nodo(elemento);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            nuevo.setSig(inicio);
            inicio = nuevo;
        }
    }

    //Este metodo agrega nodos al final
    public void ingresarFinal(Object elemento) {
        String respuesta = "Nodo ingresado";
        Nodo nuevo = new Nodo(elemento);

        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }

    }

    //Este método retira un nodo 
    public Nodo eliminarPrimerNodo() {
        Nodo aux = inicio;
        if (aux != null) {
            inicio = inicio.getSig();
        }
        return aux;

    }

    public String reporte() {
        String respuesta = "";
        if (inicio == null) {
            respuesta = "No hay elementos en la lista";
        } else {
            Nodo aux = inicio;
            while (aux != null) {
                respuesta += aux.getInfo() + "\n";
                aux = aux.getSig();
            }
        }
        return respuesta;
    }

    public int numeroElementos() {
        Nodo aux = inicio;
        int i = 0;
        while (aux != null) {
            aux = aux.getSig();
            i++;
        }
        return i;
    }

    public Nodo productoEncontrado(String codigo) {
        Nodo aux = inicio;
        while (aux != null) {
            Producto p1 = (Producto) aux.getInfo();
            if (codigo.equals(p1.getCodigo())) {
                return aux;
            }
            aux = aux.getSig();
        }
        return null;
    }
}
