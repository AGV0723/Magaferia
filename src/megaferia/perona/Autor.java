/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.perona;

import java.util.ArrayList;
import megaferia.modelo.Editorial;
import megaferia.modelo.libro.Libro;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class Autor extends Persona {

    private ArrayList<Libro> libros;

    public Autor(String nombre, String cedula) {
        super(nombre, cedula);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public int obtenerNumEditoriales() {
    ArrayList<Editorial> editoriales = new ArrayList<>();
    for (Libro libro : this.libros) {
        if (!editoriales.contains(libro.getEditorial())) {
            editoriales.add(libro.getEditorial());
        }
    }
    return editoriales.size();
}
}
