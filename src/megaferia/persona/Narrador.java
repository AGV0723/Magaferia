/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.persona;

import java.util.ArrayList;
import megaferia.modelo.libro.AudioLibro;
import megaferia.modelo.libro.Libro;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class Narrador extends Persona {
    private ArrayList<AudioLibro> libros;

    public Narrador(String nombre, int cedula, ArrayList<AudioLibro> audioLibros) {
        super(nombre, cedula);
        this.libros = audioLibros;
    }
    public boolean addLibro(AudioLibro libro) {
        if (!this.libros.contains(libro)) {
            this.libros.add(libro);
            return true;
        }
        return false;
    }

    public ArrayList<AudioLibro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<AudioLibro> audioLibros) {
        this.libros = audioLibros;
    }
    
}
