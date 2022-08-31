
package Entidades;

import java.awt.Image;

/**
 *
 * @author ALEX
 */
public class Ficha {
    private String nombre;
    private String abreviatura;
    private String color;
    private Posicion oPosicion;
    private Image imagen;

    public Ficha() {
    }

    public Ficha(String nombre, String abreviatura, Posicion oPosicion) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.oPosicion = oPosicion;
    }

    public Ficha(String nombre, String abreviatura, String color, Posicion oPosicion, Image imagen) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.color = color;
        this.oPosicion = oPosicion;
        this.imagen = imagen;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Posicion getoPosicion() {
        return oPosicion;
    }

    public void setoPosicion(Posicion oPosicion) {
        this.oPosicion = oPosicion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
    