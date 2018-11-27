/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.dominio;

/**
 *
 * @author megom
 */
public class Cliente {
        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    private int codigo;
    private String descripcion;
    private CondicionTributaria condicionTributaria;

    public Cliente(int codigo, String descripcion, CondicionTributaria condicionTributaria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.condicionTributaria = condicionTributaria;
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

    public CondicionTributaria getCondicionTributaria() {
        return condicionTributaria;
    }

    public void setCondicionTributaria(CondicionTributaria condicionTributaria){
        this.condicionTributaria = condicionTributaria;
    }    
    
    @Override
    public String toString() {
        return getDescripcion();
    }
}
