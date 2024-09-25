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
    
    private static int idCount = 0;
            
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(float precio){
        this.id = Stand.idCount;
        this.precio = precio;
        this.editoriales = new ArrayList<>();
        
        Stand.idCount++;
    }
    public boolean addEditorial(Editorial editorial) {
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + this.id + ", " + this.precio + ")";
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
