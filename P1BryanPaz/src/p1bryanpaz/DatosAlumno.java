/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1bryanpaz;

/**
 *
 * @author Bryan Paz Ramirez
 */
public class DatosAlumno {
    
    private int Id;
    private String Carne;
    private String Nombre;
    private String Curso;
    
    public DatosAlumno(int _Id, String _Carne, String _Nombre, String _Curso){
        this.Id = _Id;
        this.Carne = _Carne;
        this.Nombre = _Nombre;
        this.Curso = _Curso;
    }

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the Carne
     */
    public String getCarne() {
        return Carne;
    }

    /**
     * @param Carne the Carne to set
     */
    public void setCarne(String Carne) {
        this.Carne = Carne;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Curso
     */
    public String getCurso() {
        return Curso;
    }

    /**
     * @param Curso the Curso to set
     */
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }
    
}
