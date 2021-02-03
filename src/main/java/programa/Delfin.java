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
public class Delfin extends Mamiferos{
    
    private int metrosLargo;

    public Delfin() {
    }

    public Delfin(int metrosLargo, boolean aletas, boolean garras, int numOjos,
            int peso, int extremidades, boolean sistemaCirculatorio) {
        super(aletas, garras, numOjos, peso, extremidades, sistemaCirculatorio);
        this.metrosLargo = metrosLargo;
    }

    public int getMetrosLargo() {
        return metrosLargo;
    }

    public void setMetrosLargo(int metrosLargo) {
        this.metrosLargo = metrosLargo;
    }
    
    @Override
    public void comer(int kgComida){
        
        super.setPeso(super.getPeso() + kgComida);
        System.out.println("Delfín comiendo...");
    }
    
    public void nadarRapido(){
        
        System.out.println("Delfín nadando a 60km/h...");
    }
    
}
