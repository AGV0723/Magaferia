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

    public Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + ')';
    }
    


    public void createStand(float precio) {
        this.stands.add(new Stand(precio));
    }

    public void verifyStands() {
        for (Stand stand : this.stands) {
            System.out.println(stand + " -> " + stand.getEditoriales());
        }
    }

    public boolean addEditorial(Editorial editorial) {
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

    private Stand getStandById(int StandId) {
        for (Stand stand : this.stands) {
            if (stand.getId() == StandId) {
                return stand;
            }
        }
        return null;
    }

    public void assignStandEditorial(ArrayList<Integer> standsIds, ArrayList<Editorial> editoriales) {
        for (Editorial editorial : editoriales) {
            this.addEditorial(editorial);
            for (Integer standId : standsIds) {
                Stand stand  = this.getStandById(standId);
                if (stand != null) {
                    editorial.addStandl(stand);
                    stand.addEditorial(editorial);
                }
            }
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
