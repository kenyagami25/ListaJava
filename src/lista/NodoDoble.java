/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author LohannaStan
 */
public class NodoDoble {
    //Atributos
    private NodoDoble anterior;
    private NodoDoble siguiente;
    private Object informacion;
    
    //Constructor
    public NodoDoble(Object informacion){
        this.informacion = informacion;
    }
    
    public NodoDoble getAnterior(){
        return this.anterior;
    }
    public void setAnterior(NodoDoble anterior){
        this.anterior = anterior;
    }
    
    public NodoDoble getSiguiente(){
        return this.siguiente;
    }
    public void setSiguiente(NodoDoble siguiente){
        this.siguiente = siguiente;
    } 
    
    public Object getInformacion(){
        return this.informacion;
    }
    public void setInformacion(Object informacion){
        this.informacion = informacion;
    }
}
