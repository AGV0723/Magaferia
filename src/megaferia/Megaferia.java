/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package megaferia;

import java.util.ArrayList;
import megaferia.modelo.*;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class Megaferia {

    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;


    public Megaferia () {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }
    
    public void createStand (float precio) {
        this.stands.add(new Stand(precio));
    }
    
    public void verifyStands (){
        for (Stand stand : this.stands) {
            System.out.println(stands);
        }
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
