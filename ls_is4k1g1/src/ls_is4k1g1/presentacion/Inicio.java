/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.presentacion;

import ls_is4k1g1.persistencia.Repositorio;
import ls_is4k1g1.presentacion.vistas.CrearSolicitudVista;

/**
 *
 * @author Planos
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Repositorio.iniciar();
        (new CrearSolicitudVista()).setVisible(true);
    }
}
