/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javainterfaz;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador
 */
public class JavaInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente clienteUno = new Cliente("01", "Pablo", "Martínez", 25);
        Cliente clienteDos = new Cliente("02", "Ximena", "Mariscal", 35);
        
        clienteUno.comprar("Batería de acero inoxidable, 10 piezas", 3000);
        clienteDos.comprar("Horno de convección", 4000);
        
        List<Cliente> listaClientes = new ArrayList<>();
        
        listaClientes.add(clienteUno);
        listaClientes.add(clienteDos);
        
        
        //Arreglar el ENHANCED FOR para desplegar los datos de los clientes****************
        for(Cliente elemento:listaClientes){
            
            System.out.println("***************************************");
            System.out.println("Cliente ID: " + elemento.getIdCliente());
            System.out.println("Nombre " + elemento.getNombre());
            System.out.println("Apellido " + elemento.getApellido());
            System.out.println("Edad " + elemento.getEdad());            
        }
              
        
    }
    
}
