/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.modelo.libro;

import java.util.ArrayList;
import megaferia.modelo.Editorial;
import megaferia.persona.Autor;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public abstract class Libro {
    protected String titulo;
    protected ArrayList<Autor> autores;
    protected String isbm; 
    protected String genero; 
    protected String formato;
    protected float valor;
    protected Editorial editorial;

    public Libro(String titulo, ArrayList<Autor> autores, String isbm, String genero, String formato, float valor, Editorial editorial) {
        this.titulo = titulo;
        this.autores = autores;
        this.isbm = isbm;
        this.genero = genero;
        this.formato = formato;
        this.valor = valor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
}
