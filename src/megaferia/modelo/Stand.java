/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.modelo;

import java.util.ArrayList;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class Stand {
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(int id, float precio, ArrayList<Editorial> editoriales) {
        this.id = id;
        this.precio = precio;
        this.editoriales = editoriales;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList<Editorial> editoriales) {
        this.editoriales = editoriales;
    }
    
}
