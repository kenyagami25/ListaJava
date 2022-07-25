/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista;

/**
 *
 * @author LohannaStan
 */
public class Lista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto p1 = new Producto("ddd","dd",444,5,5);
        Producto p2 = new Producto("ff","ff",554,5,5);
        Nodo p = new Nodo(p1);
        Nodo q = new Nodo(p2);
        ListaCircular l1= new ListaCircular(p);
        l1.ingresarInicio(p1);
       //Ingresar nodos al inicio      
    }

}
