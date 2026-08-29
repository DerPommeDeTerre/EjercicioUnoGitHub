/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javainterfaz;

/**
 *
 * @author administrador
 */


//*****************Implementar la interfaz IComprar******************
public class Cliente implements IComprar{
    
        
    private String idCliente;
    private String nombre;
    private String apellido;
    private int edad;

    public Cliente() {
    }

    public Cliente(String idCliente, String nombre, String apellido, int edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }        
    
    //************Implementar la Interfaz IComprar*********************
    //************Con las siguientes impresiones en pantalla*********************
   @Override
   public void comprar(String producto, double precio){
       System.out.println(nombre + " compró " + producto);
        System.out.println("Pagó: " + precio);
   }


    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
