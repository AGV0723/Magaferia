/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package megaferia;

import java.util.ArrayList;
import megaferia.modelo.*;
import megaferia.modelo.libro.*;
import megaferia.perona.Autor;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class Megaferia {

    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    public Megaferia(ArrayList<Stand> stands, ArrayList<Editorial> editoriales) {
        this.stands = stands;
        this.editoriales = editoriales;
    }

    public ArrayList<Libro> buscarLibro(Autor autor) {
        return buscarLibro(autor);
    }

    public ArrayList<Libro> buscarLibro(String formato) {
        return buscarLibro(formato);
    }

    public ArrayList<String> buscarFormato(String nombreLibro) {
        return buscarFormato(nombreLibro);
    }

    public Autor obtenerAutorMaxEditoriales() {
        ArrayList<Autor> autores = new ArrayList<>();
        for (Editorial editorial : this.editoriales) {
            ArrayList<Autor> autoresEditorial = editorial.obtenerAutores();
            for (Autor autor : autoresEditorial) {
                if (!autores.contains(autor)) {
                    autores.add(autor);
                }
            }
        }
        Autor autorMaxEditoriales = autores.get(0);
        for (Autor autor : autores) {
            if (autor.obtenerNumEditoriales() > autorMaxEditoriales.obtenerNumEditoriales()) {
                autorMaxEditoriales = autor;
            }
        }
        return autorMaxEditoriales;
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }

    public void setStands(ArrayList<Stand> stands) {
        this.stands = stands;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList<Editorial> editoriales) {
        this.editoriales = editoriales;
    }
}
