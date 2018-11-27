/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.dominio;

/**
 *
 * @author megom
 */
//import ls_is4k1g1.IPrecio;

public class ProductoUnitario implements IPrecio {

    private int stock;
    private double precio;
    private String nombre;
    //private String categoria;
    private Rubro rubro;

    /**
     * Constructor parametrizado de los objetos de esta clase.
     * @param cantidad int numero de unidades del producto.
     * @param precio double precio por unidad.
     * @param nombre String nombre del producto.
     * @param rubro Rubro rubro del producto.
     */
    public ProductoUnitario(int cantidad, double precio, String nombre, Rubro rubro) {
        this.stock = cantidad;
        this.precio = precio;
        this.nombre = nombre;
        this.rubro = rubro;
    }

    /**
     * Getter de la cantidad de unidades.
     * @return int cantidad.
     */
    public int getCantidad() {
        return stock;
    }

    /**
     * Setter de la cantidad de unidades.
     * @param cantidad int numero de unidades.
     */
    public void setCantidad(int cantidad) {
        this.stock = cantidad;
    }

    /**
     * Getter del precio por unidad.
     * @return double precio unitario.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Setter del precio por unidad.
     * @param precio double precio unitario.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Getter del nombre.
     * @return String nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre.
     * @param nombre String nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la categoria.
     * @return String nombre de la categoria del producto.
     */
    public Rubro getRubro() {
        return rubro;
    }

    /**
     * Setter de la categoria.
     * @param categoria String categoria del producto.
     */
    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    /**
     * Metodo implementado obligatoriamente por la interfaz IPrecio que devuelve
     * el importe total del producto.
     * @return double importe total.
     */
    @Override
    public double getImporteTotal() {
        return getCantidad() * getPrecio();
    }
}
