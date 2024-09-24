/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package megaferia.modelo.libro;

import java.util.ArrayList;
import megaferia.modelo.Editorial;
import megaferia.perona.Autor;

/**
 *
 * @author adrianonzalezrubiovilla
 */
public class LibroImpreso extends Libro{
    private int paginas;
    private int numEjemplares;

    public LibroImpreso(String titulo, ArrayList<Autor> autores, String isbm, String genero, String formato, float valor, Editorial editorial) {
        super(titulo, autores, isbm, genero, formato, valor, editorial);
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }
    
}
