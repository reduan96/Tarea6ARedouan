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
public class Delfin extends Mamiferos {

    //Atributos de la subclase delfin 
    private int metrosLargo;

    //Constructor por defecto
    public Delfin() {
    }

    //Constructor parametrizado
    public Delfin(int metrosLargo, boolean aletas, boolean garras, int numOjos, 
            int peso, int extremidades, boolean sistemaCirculatorio) {
        super(aletas, garras, numOjos, peso, extremidades, sistemaCirculatorio);
        this.metrosLargo = metrosLargo;
    }

    //Métodos getters y setters
    public int getMetrosLargo() {
        return metrosLargo;
    }

    public void setMetrosLargo(int metrosLargo) {
        this.metrosLargo = metrosLargo;
    }

    public void nadarRapido(){
        
        System.out.println("delfín nadando a 60km/h...");
    }
    
    //Método sobreescrito, método polimorfico
    @Override
    public void comer(int kgComida) {

        super.setPeso(super.getPeso() + kgComida);
        System.out.println("Delfín comiendo...");
    }

    //Método sobreescrito, método polimorfico
    @Override
    public void parir() {

        System.out.println("El delfín esta pariendo...");
    }

    //Método toString sobreescrito de la clse Object
    @Override
    public String toString() {
        return super.toString() + "Delfin{" + "metrosLargo=" + metrosLargo + '}';
    }

    //Método hashcode sobreescrito de la clse Object
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.metrosLargo;
        return hash;
    }

    //Método equals sobreescrito de la clse Object
    @Override
    public boolean equals(Object obj) {

        if (!super.equals(obj)) {

            return false;
        }

        final Delfin other = (Delfin) obj;
        if (this.metrosLargo != other.metrosLargo) {
            return false;
        }
        return true;
    }

}
