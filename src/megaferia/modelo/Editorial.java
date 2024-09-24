/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.modelo;

import java.util.ArrayList;
import megaferia.modelo.libro.Libro;
import megaferia.perona.Autor;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class Editorial {

    private String nit;
    private String nombre;
    private String direccion;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public Editorial(String nit, String nombre, String direccion, ArrayList<Libro> libros, ArrayList<Stand> stands) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = libros;
        this.stands = stands;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }

    public void setStands(ArrayList<Stand> stands) {
        this.stands = stands;
    }

    public ArrayList<Autor> obtenerAutores() {
        ArrayList<Autor> autores = new ArrayList<>();
        for (Libro libro : this.libros) {
            ArrayList<Autor> autoresLibro = libro.getAutores();
            for (Autor autor : autoresLibro) {
                if (!autores.contains(autor)) {
                    autores.add(autor);
                }
            }
        }
        return autores;
    }
}
