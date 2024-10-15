/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Alumno
 */
public class principalmain {
    
     public static void main(String[] args) {
       
        
        Persona persona = new Persona("tilin",".exe",666);
        System.out.println("nombre: " +persona.getnombre());
        System.out.println("apellidos: " +persona.getapellidos());
        System.out.println("edad: " +persona.getedad());
        
        Persona estudiante = new estudiantes("pichula","insana",999, 00000000);
        System.out.println("nombre: " +estudiante.getnombre());
        System.out.println("apellidos: " +estudiante.getapellidos());
        System.out.println("edad: " +estudiante.getedad());
        System.out.println("edad: " +estudiante.getmatricula());

        
      


    }
    
}
