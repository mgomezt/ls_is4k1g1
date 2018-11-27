/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.presentacion;

import ls_is4k1g1.dominio.AbcSucursal;
import ls_is4k1g1.dominio.AbcPrenda;
import ls_is4k1g1.dominio.AbcTalle;
import ls_is4k1g1.dominio.AbcColor;
import ls_is4k1g1.dominio.AbcSolicitud;
import ls_is4k1g1.persistencia.Repositorio;

/**
 *
 * @author Planos
 */
public class CrearSolicitudPresentador {

    private ICrearSolicitudVista vista;
    private AbcSolicitud solicitud;
    
    public CrearSolicitudPresentador(ICrearSolicitudVista vista) {
        this.vista = vista;
        this.vista.setCondicionesTributarias(Repositorio.getCondicionesTributarias());        
        this.vista.setClientes(Repositorio.getClientes());
        
        this.vista.setSucursales(Repositorio.getSucursales());
        this.vista.setPrendas(Repositorio.getPrendas());
        this.vista.setTalles(Repositorio.getTalles());
        this.vista.setColores(Repositorio.getColores());
        crearSolicitud();
    }

    public void agregarLineaSolicitud(AbcPrenda prenda, 
            AbcTalle talle, 
            AbcColor color, 
            int cantidad){
        solicitud.agregarLineaSolicitud(
                prenda, 
                talle, 
                color, 
                vista.getCantidad());
        vista.setDetalle(solicitud.getDetalle());
    }
    
    public void confirmarSolicitud(AbcSucursal sucursal){
        solicitud.confirmar(sucursal, Repositorio.getProximoNumeroSolicitud());
        Repositorio.agregarSolicitud(solicitud);
    }
    
    private void crearSolicitud() {
        solicitud = new AbcSolicitud();
    }
}
