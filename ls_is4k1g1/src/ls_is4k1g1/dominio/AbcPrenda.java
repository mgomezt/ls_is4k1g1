/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.dominio;

/**
 *
 * @author Planos
 */
public class AbcPrenda {
    private int codigo;
    private String descripcion;
    private double precio;
    private AbcMaterial material;

    public AbcPrenda(int codigo, String descripcion, double precio, AbcMaterial material) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.material = material;
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

    public AbcMaterial getMaterial() {
        return material;
    }

    public void setMaterial(AbcMaterial material) {
        this.material = material;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return getDescripcion();
    }
}
