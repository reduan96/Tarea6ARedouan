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
public abstract class Mamiferos extends Animales{
    
    private boolean aletas;
    private boolean garras;
    private int numOjos;

    public Mamiferos() {
    }

    public Mamiferos(boolean aletas, boolean garras, int numOjos, 
            int peso, int extremidades, boolean sistemaCirculatorio) {
        super(peso, extremidades, sistemaCirculatorio);
        this.aletas = aletas;
        this.garras = garras;
        this.numOjos = numOjos;
    }

    public boolean isAletas() {
        return aletas;
    }

    public void setAletas(boolean aletas) {
        this.aletas = aletas;
    }

    public boolean isGarras() {
        return garras;
    }

    public void setGarras(boolean garras) {
        this.garras = garras;
    }

    public int getNumOjos() {
        return numOjos;
    }

    public void setNumOjos(int numOjos) {
        this.numOjos = numOjos;
    }
    
    @Override
    public void comer(int kgComida){
        
        super.setPeso(super.getPeso() + kgComida);
        System.out.println("Mamifero comiendo...");
    }
    
}
