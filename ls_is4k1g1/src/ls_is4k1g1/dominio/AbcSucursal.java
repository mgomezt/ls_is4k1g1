/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.dominio;

import java.util.ArrayList;

/**
 *
 * @author Planos
 */
public class AbcSucursal {
    private int numero;
    private String nombre;
    private ArrayList<AbcExistencia> existencias = new ArrayList<>();

    public AbcSucursal(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int Numero) {
        this.numero = Numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public ArrayList<AbcExistencia> getExistencias() {
        return existencias;
    }

    @Override
    public String toString() {
        return "[" + getNumero() + "] " + getNombre();
    }
    
    
            
}
