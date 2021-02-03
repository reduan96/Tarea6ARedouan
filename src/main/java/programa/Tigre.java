/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author redu2
 */
public class Tigre extends Mamiferos{
    
    private int numColmillos;

    public Tigre() {
    }

    public Tigre(int numColmillos, boolean aletas, boolean garras, int numOjos,
            int peso, int extremidades, boolean sistemaCirculatorio) {
        super(aletas, garras, numOjos, peso, extremidades, sistemaCirculatorio);
        this.numColmillos = numColmillos;
    }

    public int getNumColmillos() {
        return numColmillos;
    }

    public void setNumColmillos(int numColmillos) {
        this.numColmillos = numColmillos;
    }
    
}
