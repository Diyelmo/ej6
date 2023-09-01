/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package detodosa;

/**. De cada Producto, interesa conocer: código (numérico), 
descripción, precio, stock y rubro (comestible, limpieza y perfumería son los únicos permitidos). 
Para dar solución a este requerimiento, lo haremos implementando un TreeSet de Productos, en 
donde haremos que se ordenen por código a medida que se van ingresando. 
 *
 * @author RODRI
 */

public class Producto implements Comparable <Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Categoria rubro;

    public Producto(int codigo, String descripcion, double precio, int stock, Categoria rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getRubro() {
        return rubro;
    }

    public void setRubro(Categoria rubro) {
        this.rubro = rubro;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", rubro=" + rubro + '}';
    }

    @Override
    public int compareTo(Producto o) {
      if(this.codigo==o.codigo){
          return 0;
      }else if(this.codigo>o.codigo){
          return 1;
      }else{return -1;}
    }
    
    
}
