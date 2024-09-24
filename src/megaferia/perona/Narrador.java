/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.perona;

import java.util.ArrayList;
import megaferia.modelo.libro.AudioLibro;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class Narrador extends Persona {
    private ArrayList<AudioLibro> libros;

    public Narrador(String nombre, String cedula) {
        super(nombre, cedula);
    }

    public ArrayList<AudioLibro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<AudioLibro> libros) {
        this.libros = libros;
    }
    
}
