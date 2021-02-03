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
public class Prueba {

    public static void main(String[] args) {

        //Creacion instancia de animales
        Animales animales = new Animales();

        //Creacion instancia de mamiferos
        Mamiferos mamiferos = new Mamiferos();

        //Creación de instancias tipo Delfin
        //Conversión de tipos(conversión implicita)
        Animales orca = new Delfin(5, true, false, 2, 4200, 3, true);
        Animales delfinDusky = new Delfin(5, true, false, 2, 600, 3, true);

        //Creacion de instancias tipo Tigre
        //Conversión de tipos(conversión implicita)
        Tigre tigreMalayo = new Tigre(4, false, true, 2, 430, 4, true);
        Tigre tigreSiberiano = new Tigre(6, false, true, 2, 610, 4, true);

        //Rellenamos la lista de animales
        animales.getListaAnimales().add(tigreMalayo);
        animales.getListaAnimales().add((Mamiferos) orca);
        animales.getListaAnimales().add(tigreSiberiano);
        animales.getListaAnimales().add((Mamiferos) delfinDusky);

        //Llamada a metodo A
        for (int i = 0; i < animales.getListaAnimales().size(); i++) {

            animales.getListaAnimales().get(i).comer(6);

        }
        System.out.println("---------------------------------");

        //Imprimir lista animales
        animales.getListaAnimales().forEach(System.out::println);
        System.out.println("---------------------------------");

        //Llamada a metodos propios de cada clase B, C y D
        for (Animales aux : animales.getListaAnimales()) {

            if (aux instanceof Mamiferos) {
                //Conversión de tipos(conversión explícita)
                ((Mamiferos) aux).termoregulacion();
            }

            if (aux instanceof Delfin) {
                //Conversión de tipos(conversión explícita)
                ((Delfin) aux).nadarRapido();
            }

            if (aux instanceof Tigre) {
                //Conversión de tipos(conversión explícita)
                ((Tigre) aux).correrRapido();
            }

        }
        System.out.println("---------------------------------");
        //indexof(Object o), contains(Object o) y remove(Object o) de la clase ArrayList
        System.out.println("index of: " + animales.getListaAnimales().indexOf(orca));
        System.out.println("contains: " + animales.getListaAnimales().contains(tigreMalayo));
        //Imprimo lista de animales antes de borrar un objeto del mismo
        animales.getListaAnimales().forEach(System.out::println);
        animales.getListaAnimales().remove(tigreSiberiano);
        System.out.println("---------------------------------");
        //La imprimimmos después de borrar dicho objeto
        animales.getListaAnimales().forEach(System.out::println);

    }

}
