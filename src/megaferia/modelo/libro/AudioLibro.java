/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.modelo.libro;

import java.util.ArrayList;
import megaferia.modelo.Editorial;
import megaferia.persona.Autor;
import megaferia.persona.Narrador;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class AudioLibro extends Libro {
    private int duracion;
    private Narrador narrador;

    public AudioLibro(String titulo, ArrayList<Autor> autores, String isbm, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbm, genero, formato, valor, editorial);
    }
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Narrador getNarrador() {
        return narrador;
    }

    public void setNarrador(Narrador narrador) {
        this.narrador = narrador;
    }
    
}
