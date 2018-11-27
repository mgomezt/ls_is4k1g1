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
public class Solicitud {
    private Sucursal genera;
    private Sucursal procesa;
    private Date fecha;
    private int numero;
    private Estado estado;
    private ArrayList<LineaSolicitud> detalle = new ArrayList<>();

    public Sucursal getGenera() {
        return genera;
    }

    public void setGenera(Sucursal genera) {
        this.genera = genera;
    }

    public Sucursal getProcesa() {
        return procesa;
    }

    public void setProcesa(Sucursal procesa) {
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<LineaSolicitud> getDetalle() {
        return detalle;
    }
    
    public void agregarLineaSolicitud(Prenda prenda,Talle talle, Color color, int cantidad ){
        detalle.add(new LineaSolicitud(prenda, talle, color, cantidad));
    }
    
    public void confirmar(Sucursal sucursal, int numero){
        genera = sucursal;
        fecha = new Date();
        this.numero = numero;
        estado = Estado.Pendiente;
    }
}
