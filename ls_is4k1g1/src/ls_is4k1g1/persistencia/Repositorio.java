/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ls_is4k1g1.persistencia;

import ls_is4k1g1.dominio.CondicionTributaria;
import ls_is4k1g1.dominio.Cliente;
import ls_is4k1g1.dominio.Rubro;
import ls_is4k1g1.dominio.ProductoUnitario;
import ls_is4k1g1.dominio.ProductoCompuesto;
import ls_is4k1g1.dominio.ProductoOpcional;

import ls_is4k1g1.dominio.AbcPrenda;
import ls_is4k1g1.dominio.AbcSucursal;
import ls_is4k1g1.dominio.AbcTalle;
import ls_is4k1g1.dominio.AbcColor;
import ls_is4k1g1.dominio.AbcSolicitud;
import ls_is4k1g1.dominio.AbcMaterial;
import java.util.ArrayList;

/**
 *
 * @author Planos
 */
public class Repositorio {
    
    private static ArrayList<CondicionTributaria> condicionestributarias = new ArrayList<>();
    private static ArrayList<Cliente> clientes = new ArrayList<>();    
    private static ArrayList<Rubro> rubros = new ArrayList<>();       
    private static ArrayList<ProductoUnitario> productosunitarios = new ArrayList<>();  
    private static ArrayList<ProductoCompuesto> productoscompuestos = new ArrayList<>();      
    private static ArrayList<ProductoOpcional> productosopcionales = new ArrayList<>();      
    
    private static ArrayList<AbcMaterial> materiales = new ArrayList<>();
    private static ArrayList<AbcTalle> talles = new ArrayList<>();
    private static ArrayList<AbcColor> colores = new ArrayList<>();
    private static ArrayList<AbcSucursal> sucursales = new ArrayList<>();
    private static ArrayList<AbcPrenda> prendas = new ArrayList<>();
    private static ArrayList<AbcSolicitud> solicitudes = new ArrayList<>();
    
    public static void iniciar(){
        crearCondicionesTributarias();
        crearClientes();
        crearRubros();   
        crearProductos();
        //crearProductosUnitarios();
        //crearProductosCompuestos();
        
        crearMateriales();
        crearTalles();
        crearColores();
        crearSucursales();
        crearPrendas();
    }

    private static void crearCondicionesTributarias() {
        condicionestributarias.add(new CondicionTributaria(1, "Consumidor Final"));
        condicionestributarias.add(new CondicionTributaria(2, "Monotributista"));
    }    

    private static void crearClientes() {
        clientes.add(new Cliente(1, "Consumidor Final", condicionestributarias.get(1)));
    }       

    private static void crearRubros() {
        rubros.add(new Rubro(1, "Sandwich"));
        rubros.add(new Rubro(2, "Materia Prima"));        
        rubros.add(new Rubro(3, "Adheresos"));                
        rubros.add(new Rubro(4, "Bebidas"));                     
    }
    
    private static void crearProductos() {
        ProductoUnitario huevo =
                new ProductoUnitario(100, 10, "Huevo Frito", rubros.get(2));
        ProductoUnitario papasFritas =
                new ProductoUnitario(50, 20, "Papas Fritas", rubros.get(2));  
        ProductoOpcional lechuga =
                new ProductoOpcional(1, 0, "Lechuga", rubros.get(2));
        ProductoOpcional tomate =
                new ProductoOpcional(1, 0, "Tomate", rubros.get(2));     
        ProductoOpcional mayones =
                new ProductoOpcional(1, 0, "Mayonesa", rubros.get(3));
        ProductoOpcional mostaza =
                new ProductoOpcional(1, 0, "Mostaza", rubros.get(3)); 
        ProductoUnitario gaseosa =
                new ProductoUnitario(1, 0, "Gaseosa", rubros.get(4));
        ProductoUnitario aguaMineral =
                new ProductoUnitario(1, 0, "Agua Mineral", rubros.get(4));    

        ProductoCompuesto sandwichMilanesa = new ProductoCompuesto();
        //Añadimos los productos individuales al producto compuesto.
        sandwichMilanesa.addProducto(lechuga);
        sandwichMilanesa.addProducto(tomate);        
    }
    
    
/******************************************************************************/    
    private static void crearMateriales() {
        materiales.add(new AbcMaterial(1, "Algodón"));
        materiales.add(new AbcMaterial(2, "Lino"));
        materiales.add(new AbcMaterial(3, "Poliéster"));
    }

    private static void crearTalles() {
        talles.add(new AbcTalle("XS","Extra Small"));
        talles.add(new AbcTalle("S","Small"));
        talles.add(new AbcTalle("M","Medium"));
        talles.add(new AbcTalle("L","Large"));
        talles.add(new AbcTalle("XL","Extra Large"));
    }

    private static void crearColores() {
        colores.add(new AbcColor(1, "Blanco"));
        colores.add(new AbcColor(2, "Azul"));
        colores.add(new AbcColor(3, "Rojo"));
        colores.add(new AbcColor(4, "Gris"));
        colores.add(new AbcColor(5, "Verde"));
        colores.add(new AbcColor(6, "Naranja"));
    }

    private static void crearSucursales() {
        sucursales.add(new AbcSucursal(1,"Sucursal 1"));
        sucursales.add(new AbcSucursal(2,"Sucursal 2"));
    }

    private static void crearPrendas() {
        prendas.add(new AbcPrenda(1, "Remera", 100, materiales.get(0)));
        prendas.add(new AbcPrenda(2, "Chomba", 150, materiales.get(2)));
        prendas.add(new AbcPrenda(3, "Camisa", 200, materiales.get(1)));
        prendas.add(new AbcPrenda(4, "Buzo", 300, materiales.get(0)));
    }

    public static ArrayList<CondicionTributaria> getCondicionesTributarias() {
        return condicionestributarias;
    }
    
    public static ArrayList<Cliente> getClientes() {
        return clientes;
    }
    
    public static ArrayList<AbcMaterial> getMateriales() {
        return materiales;
    }

    public static ArrayList<AbcTalle> getTalles() {
        return talles;
    }

    public static ArrayList<AbcColor> getColores() {
        return colores;
    }

    public static ArrayList<AbcSucursal> getSucursales() {
        return sucursales;
    }

    public static ArrayList<AbcPrenda> getPrendas() {
        return prendas;
    }
    
    public static void agregarSolicitud(AbcSolicitud solicitud){
        solicitudes.add(solicitud);
    }
    
    public static int getProximoNumeroSolicitud(){
        return solicitudes.size() + 1;
    }
}
