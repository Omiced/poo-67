package org.generation.adoptions.interfaces;

/**
 * Interfaz
 * Es un contrato que las clases que la implementen
 * Deben seguir.
 *
 * Esta construida de puros metodos abstractos ( java 8+) pero de todas maneras
 * lo mas comun es que solo tengan metodos abstractos
 *
 * A diferencia de una clase abstracta, una interfaz no puede tener:
 * 1. Metodo constructor
 * 2. Metodos normales
 * 3. Metodo main
 *
 * Las interfaces se implementan, esto quiere decir que la palabra reservada para usarlas
 * es Implements
 *
 * LAs interfaces si pueden
 * 1. Usar multiples interfaces en una clase
 * 2. las interfaces son un contrato general
 */
public interface Adoptable {
    /**
     * metodo abstracto, solo describe que hacer
     * pero no nos dice como
     * La clase que implemente la interfaz, va a tener que decidir como se hace lo que se pide
     */
    void adopt();
}
