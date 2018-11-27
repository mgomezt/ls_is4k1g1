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
public class LineaSolicitud {
    private int cantidad;
    private AbcPrenda prenda;
    private AbcTalle talle;
    private AbcColor color;

    public LineaSolicitud(AbcPrenda prenda, AbcTalle talle, AbcColor color, int cantidad) {
        this.cantidad = cantidad;
        this.prenda = prenda;
        this.talle = talle;
        this.color = color;
    }

    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public AbcPrenda getPrenda() {
        return prenda;
    }

    public void setPrenda(AbcPrenda prenda) {
        this.prenda = prenda;
    }

    public AbcTalle getTalle() {
        return talle;
    }

    public void setTalle(AbcTalle talle) {
        this.talle = talle;
    }

    public AbcColor getColor() {
        return color;
    }

    public void setColor(AbcColor color) {
        this.color = color;
    }
}
