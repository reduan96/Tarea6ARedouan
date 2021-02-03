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
public class Tigre extends Mamiferos {

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

    @Override
    public void comer(int kgComida) {

        super.setPeso(super.getPeso() + kgComida);
        System.out.println("Tigre comiendo...");
    }

    public void correrRapido() {

        System.out.println("correr a 80km/h...");
    }
    
    @Override
    public void parir(){
        
        System.out.println("La tigresa esta pariendo...");
    }

    @Override
    public String toString() {
        return super.toString() + "Tigre{" + "numColmillos=" + numColmillos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.numColmillos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {

            return false;
        }

        final Tigre other = (Tigre) obj;
        if (this.numColmillos != other.numColmillos) {
            return false;
        }
        return true;
    }

}
