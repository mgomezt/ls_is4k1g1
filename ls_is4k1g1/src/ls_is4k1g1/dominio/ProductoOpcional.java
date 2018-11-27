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

public class ProductoOpcional implements IPrecio {

    private double stock;
    private double precio;
    private String nombre;
    private Rubro rubro;

    /**
     * Constructor parametrizado de los objetos.
     *
     * @param peso double peso del producto.
     * @param precioPorPeso double precio por unidad de peso.
     * @param nombre String nombre del producto.
     * @param categoria String categoria del producto.
     */
    public ProductoOpcional(double peso, double precioPorPeso, String nombre, Rubro rubro) {
        this.stock = peso;
        this.precio = precioPorPeso;
        this.nombre = nombre;
        this.rubro = rubro;
    }

    /**
     * Getter del peso del producto.
     *
     * @return double peso.
     */
    public double getPeso() {
        return stock;
    }

    /**
     * Setter del peso del producto.
     *
     * @param peso double peso.
     */
    public void setPeso(double peso) {
        this.stock = peso;
    }

    /**
     * Getter del peso por producto.
     *
     * @return double precio por peso.
     */
    public double getPrecioPorPeso() {
        return precio;
    }

    /**
     * Setter del precio por unidad de peso del producto.
     *
     * @param precioPorPeso double precio por unidad peso.
     */
    public void setPrecioPorPeso(double precioPorPeso) {
        this.precio = precioPorPeso;
    }

    /**
     * Getter del nombre.
     *
     * @return String nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre.
     *
     * @param nombre String nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de la categoria.
     *
     * @return String nombre de la categoria del producto.
     */
    public Rubro getRubro() {
        return rubro;
    }

    /**
     * Setter de la categoria.
     *
     * @param categoria String categoria del producto.
     */
    public void setCategoria(Rubro rubro) {
        this.rubro = rubro;
    }

    /**
     * Metodo implementado obligatoriamente por la interfaz IPrecio que devuelve
     * el importe total del producto.
     *
     * @return double importe total.
     */
    @Override
    public double getImporteTotal() {
        return getPrecioPorPeso() * getPeso();
    }
}
