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
public class AbcExistencia {
    private AbcPrenda prenda;
    private AbcSucursal sucursal;
    private AbcTalle talle;
    private AbcColor color;

    public AbcPrenda getPrenda() {
        return prenda;
    }

    public void setPrenda(AbcPrenda prenda) {
        this.prenda = prenda;
    }

    public AbcSucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(AbcSucursal sucursal) {
        this.sucursal = sucursal;
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
