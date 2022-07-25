/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author LohannaStan
 */
public class Nodo {
    //Atributos
    private Object info;
    Nodo sig;
    //Constructor
    public Nodo(Object info){
    this.info = info;
    this.sig = null;
    }
    //Set y Get
    public Object getInfo() {
        return info;
    }
    
    public void setInfo(Object info) {
        this.info = info;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
}
