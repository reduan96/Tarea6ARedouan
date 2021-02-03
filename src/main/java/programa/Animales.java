/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author redu2
 */
public class Animales {

    private int peso;
    private int extremidades;
    private boolean sistemaCirculatorio;
    private ArrayList<Mamiferos> listaAnimales;

    public Animales() {
        this.listaAnimales = new ArrayList<Mamiferos>();
    }

    public Animales(int peso, int extremidades, boolean sistemaCirculatorio) {
        this.listaAnimales = new ArrayList<Mamiferos>();
        this.peso = peso;
        this.extremidades = extremidades;
        this.sistemaCirculatorio = sistemaCirculatorio;
    }

    public ArrayList<Mamiferos> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Mamiferos> listaAnimales) {
        this.listaAnimales = listaAnimales;
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

    public void comer(int kgComida) {

        this.peso += kgComida;
        System.out.println("Animal comiendo...");
    }

    @Override
    public String toString() {
        return "Animales{" + "peso=" + peso + ", extremidades=" + extremidades
                + ", sistemaCirculatorio=" + sistemaCirculatorio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.peso;
        hash = 71 * hash + this.extremidades;
        hash = 71 * hash + (this.sistemaCirculatorio ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.listaAnimales);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animales other = (Animales) obj;
        if (this.peso != other.peso) {
            return false;
        }
        if (this.extremidades != other.extremidades) {
            return false;
        }
        if (this.sistemaCirculatorio != other.sistemaCirculatorio) {
            return false;
        }
        return true;
    }

}
