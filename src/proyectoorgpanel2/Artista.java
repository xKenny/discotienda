/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoorgpanel2;

/**
 *
 * @author Johans Gonzalez
 */
public class Artista {
    
    private String nombre;
    
    private Genero genero;
    
    private Nacionalidad nacionalidad;

    public Artista(String nombre, Genero genero, Nacionalidad nacionalidad) {
        this.nombre = nombre;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Nacionalidad getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(Nacionalidad nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    
}
