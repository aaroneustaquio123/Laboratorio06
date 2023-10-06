/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio06;

/**
 *
 * @author diego
 */
public class Curso {

    Curso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the creditos
     */
    public String getCreditos() {
        return creditos;
    }

    /**
     * @param creditos the creditos to set
     */
    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

   

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the estudiantes
     */
    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    /**
     * @param estudiantes the estudiantes to set
     */
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
/**
     * @return the profesores
     */
    public Profesor[] getProfesores() {
        return profesores;
    }

    /**
     * @param profesores the profesores to set
     */
    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }
     String getTexto(){
        return this.nombre + ", "+this.creditos+ " | Cod:  "+this.codigo;
    }
   
    private String codigo;
    private String creditos;
    private String nombre;
     private Estudiante[] estudiantes;
      private Profesor[] profesores;
     public Curso(String codigo, String creditos,  
            String nombre){
         this.codigo = codigo;
        this.creditos = creditos; 
        this.nombre = nombre;
        this.estudiantes = new Estudiante[30];
        this.profesores = new Profesor[2];
        
    }
}
