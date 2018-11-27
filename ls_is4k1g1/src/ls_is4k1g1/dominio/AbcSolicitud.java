/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.dominio;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author Planos
 */
public class AbcSolicitud {
    private AbcSucursal genera;
    private AbcSucursal procesa;
    private Date fecha;
    private int numero;
    private AbcEstado estado;
    private ArrayList<LineaSolicitud> detalle = new ArrayList<>();

    public AbcSucursal getGenera() {
        return genera;
    }

    public void setGenera(AbcSucursal genera) {
        this.genera = genera;
    }

    public AbcSucursal getProcesa() {
        return procesa;
    }

    public void setProcesa(AbcSucursal procesa) {
        this.procesa = procesa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public AbcEstado getEstado() {
        return estado;
    }

    public void setEstado(AbcEstado estado) {
        this.estado = estado;
    }

    public ArrayList<LineaSolicitud> getDetalle() {
        return detalle;
    }
    
    public void agregarLineaSolicitud(AbcPrenda prenda,AbcTalle talle, AbcColor color, int cantidad ){
        detalle.add(new LineaSolicitud(prenda, talle, color, cantidad));
    }
    
    public void confirmar(AbcSucursal sucursal, int numero){
        genera = sucursal;
        fecha = new Date();
        this.numero = numero;
        estado = AbcEstado.Pendiente;
    }
}
