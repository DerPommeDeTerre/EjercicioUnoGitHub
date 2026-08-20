/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudiante;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author administrador
 */
public class Estudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                    
        List<CEstudiante> listaEstudiantes = new ArrayList<>();
                
        listaEstudiantes.add(new CEstudiante("Mauricio", "Lopez", "1111", 9.0,"Biologia"));
        listaEstudiantes.add(new CEstudiante("Penelope", "Garcia", "2222", 10.0,"Matematicas"));
        listaEstudiantes.add(new CEstudiante("Diego", "Torres", "3333", 8.0,"Español"));
        listaEstudiantes.add(new CEstudiante("Ximena", "Rosas", "4444", 8.9,"Quimica"));
        
        int contador = 1;
        
        for(CEstudiante elemento:listaEstudiantes){            
            
            System.out.println("-----Información------");
            System.out.println("Estudiante: " + contador);
            System.out.println("Nombre: " + elemento.getNombre());
            System.out.println("Apellido: " + elemento.getApellido());
            System.out.println("Matricula: " + elemento.getMatricula());
            System.out.println("Calificacion: " + elemento.getCalificacion());
            System.out.println("Materia: " + elemento.getMateria());
            
            contador = contador + 1;
        }
    }
    
}
