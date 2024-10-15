/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persona;

/**
 *
 * @author Alumno
 */
public class Persona {
    private String nombre, apellidos;
    protected int edad;
    
    public Persona(String nombre, String apellidos, int edad){
    this.nombre=nombre;
    this.apellidos=apellidos;
    this.edad=edad;     
    }
    
    public String getnombre(){return this.nombre;}
    public void setnombre(String nombre){this.nombre=nombre;}
    public String getapellidos(){return this.apellidos;}
    public void setapellidos(String apellidos){this.apellidos=apellidos;}
    public int getedad(){return this.edad;}
    public void setedad(int edad){this.edad=edad;}
    public void caminar(){System.out.println("estoy caminando...");}
    public void dormir(){System.out.println("estoy durmiendo...");}

    
    
   
    
}
