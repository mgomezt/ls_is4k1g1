/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.presentacion;

import ls_is4k1g1.dominio.CondicionTributaria;
import ls_is4k1g1.dominio.Cliente;

import ls_is4k1g1.dominio.AbcPrenda;
import ls_is4k1g1.dominio.AbcSucursal;
import ls_is4k1g1.dominio.AbcTalle;
import ls_is4k1g1.dominio.AbcColor;
import ls_is4k1g1.dominio.LineaSolicitud;
import java.util.ArrayList;

/**
 *
 * @author Planos
 */
public interface ICrearSolicitudVista {
    void setCondicionesTributarias(ArrayList<CondicionTributaria> condicionestributarias);
    void setClientes(ArrayList<Cliente> clientes);  
    
    void setSucursales(ArrayList<AbcSucursal> sucursales);
    void setPrendas(ArrayList<AbcPrenda> prendas);
    void setTalles(ArrayList<AbcTalle> talles);
    void setColores(ArrayList<AbcColor> colores);
    void setDetalle(ArrayList<LineaSolicitud> detalle);
    int getCantidad();
}
