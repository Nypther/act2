/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persona;

/**
 *
 * @author Alumno
 */
public class estudiantes extends Persona{
    private int matricula;
    public estudiantes(String nombre, String apellidos,int edad,  int _matricula){
        super (nombre,apellidos,edad);
        this.matricula=_matricula;
    }
   
    public int getmat(){return this.matricula;}
    public void setemat(int matricula){this.matricula=matricula;}

    
    
   
}
