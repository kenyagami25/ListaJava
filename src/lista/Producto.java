/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista;

/**
 *
 * @author LohannaStan
 */
public class Producto {

    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    private int stockMin;

    public Producto(String codigo, String nombre, int cantidad, double precio, int stockMin) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.stockMin = stockMin;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStockMin() {
        return stockMin;
    }

    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + " Nombre: " + nombre + " Cantidad: " + cantidad + " Mínimo: " + stockMin + " Precio: " + precio;
    }

    public String Imprimir() {
        return "Código: " + this.codigo + " Nombre: " + this.nombre + " Cantidad: " + this.cantidad + " Stock: " + this.stockMin + " Precio: " + this.precio;
    }
}
