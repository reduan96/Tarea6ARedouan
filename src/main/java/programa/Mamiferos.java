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
    
    public void termoregulacion(){
        
        System.out.println("Regulando temperatura...");
    }

    @Override
    public String toString() {
        return super.toString() + "Mamiferos{" + "aletas=" + aletas + ", garras=" 
                + garras + ", numOjos=" + numOjos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (this.aletas ? 1 : 0);
        hash = 29 * hash + (this.garras ? 1 : 0);
        hash = 29 * hash + this.numOjos;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {

        if(!super.equals(obj)){
            
            return false;
        }
        
        final Mamiferos other = (Mamiferos) obj;
        if (this.aletas != other.aletas) {
            return false;
        }
        if (this.garras != other.garras) {
            return false;
        }
        if (this.numOjos != other.numOjos) {
            return false;
        }
        return true;
    }
    
    
}
