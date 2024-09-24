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
public class LibroDigital extends Libro {
    private boolean hasHipervinculo;
    private ArrayList<String> hiperviculos;
    
    public LibroDigital(String titulo, ArrayList<Autor> autores, String isbm, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbm, genero, formato, valor, editorial);
    }

    public boolean isHasHipervinculo() {
        return hasHipervinculo;
    }

    public void setHasHipervinculo(boolean hasHipervinculo) {
        this.hasHipervinculo = hasHipervinculo;
    }

    public ArrayList<String> getHiperviculos() {
        return hiperviculos;
    }

    public void setHiperviculos(ArrayList<String> hiperviculos) {
        this.hiperviculos = hiperviculos;
    }
    
}
