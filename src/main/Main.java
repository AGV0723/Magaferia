/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import megaferia.Megaferia;
import megaferia.modelo.Editorial;
import megaferia.persona.Gerente;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class Main {

    public static void main(String[] args) {
        Megaferia megaferia = new Megaferia();
        megaferia.createStand(1000000);
        megaferia.createStand(2000000);
        megaferia.createStand(1500000);
        megaferia.createStand(2000000);
        megaferia.createStand(5000000);
        
        Gerente gerente1 = new Gerente("Juan Juliao", 104632);
        Gerente gerente2 = new Gerente("Pablo Ramirez", 109746);
        
        Editorial editorial1 = new Editorial("891-87534896-1", "Planeta", "Cr. 47 # 15 - 40", gerente1);
        Editorial editorial2 = new Editorial("890-84223323-9", "Pinguin Ranch Madhouse", "Cr. 60 # 70 - 90", gerente2);
        
        ArrayList<Integer> standIds = new ArrayList<>();
        standIds.add(0);
        standIds.add(1);
        standIds.add(3);
        standIds.add(4);
        
        ArrayList<Editorial> editoriales = new ArrayList<>();
        editoriales.add(editorial1);
        editoriales.add(editorial2);
        
        megaferia.assignStandEditorial(standIds, editoriales);
        
        System.out.println(megaferia + " -> " + megaferia.getStands());
        System.out.println(megaferia + " -> " + megaferia.getEditoriales() + "\n");
        
        System.out.println(gerente1 + " -> " + gerente1.getEditorial());
        System.out.println(gerente2 + " -> " + gerente2.getEditorial() + "\n");
        
        System.out.println(editorial1 + " -> " + editorial1.getGerente());
        System.out.println(editorial2 + " -> " + editorial2.getGerente() + "\n");
        
        System.out.println(editorial1 + " -> " + editorial1.getStands());
        System.out.println(editorial2 + " -> " + editorial2.getStands());
        
        megaferia.verifyStands();
    }

}
