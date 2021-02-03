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
public abstract class Animales {
    
    private int peso;
    private int extremidades;
    private boolean sistemaCirculatorio;

    public Animales() {
    }

    public Animales(int peso, int extremidades, boolean sistemaCirculatorio) {
        this.peso = peso;
        this.extremidades = extremidades;
        this.sistemaCirculatorio = sistemaCirculatorio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getExtremidades() {
        return extremidades;
    }

    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }

    public boolean isSistemaCirculatorio() {
        return sistemaCirculatorio;
    }

    public void setSistemaCirculatorio(boolean sistemaCirculatorio) {
        this.sistemaCirculatorio = sistemaCirculatorio;
    }
    
}
