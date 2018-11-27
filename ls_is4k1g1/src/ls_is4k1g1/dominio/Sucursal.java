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
public class Sucursal {
    private int numero;
    private String nombre;
    private ArrayList<Existencia> existencias = new ArrayList<>();

    public Sucursal(int numero, String nombre) {
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

    public ArrayList<Existencia> getExistencias() {
        return existencias;
    }

    @Override
    public String toString() {
        return "[" + getNumero() + "] " + getNombre();
    }
    
    
            
}
