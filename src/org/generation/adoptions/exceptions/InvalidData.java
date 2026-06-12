package org.generation.adoptions.exceptions;


/**
 * Una excepcion es un evento que ocurre cuando se ejecuta codigo
 * que interrumpe la ejecucion de nuestro programa, es codigo que esta mal
 * Por ejemplo: Division entre 0, acceder a un indice que no existe
 *
 * <h3>Puntos importantes</h3>
 * <ol>
 *     <li>1. Cuando ocurre una excepcion se corta la
 *          ejecucion del programa
 *     </li>
 *     <li>
 *         2. Para evitar que se termine la ejecucion ocupamos
 *         un bloque try catch
 *     </li>
 * </ol>
 *
 * <p>
 *     Podemos crear excepciones personalizadas a partir de la clase Exception de Java
 * </p>
 */
public class InvalidData extends Exception {

    /**
     * Método constructor, donde pedimos el mesanje para lanzar la excepcion,
     * <p>estamos usando la clase Exception de Java la cual nos brinda la capacidad
     *    de hacer excepciones basicas personalizadas.
     * </p>
     * @param message - type String y va a aparecer si ocurre la excepcion
     */
    public InvalidData(String message) {
        super(message);
    }
}
