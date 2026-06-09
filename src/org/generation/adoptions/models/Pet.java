package org.generation.adoptions.models;


/**
 *En java una clase abstracta, es una clase que no se puede
 * instanciar (no podemos crear objetos) esta sirve de base para otras
 * clases.
 * Se declara con la pabra reservada ABSTRACT.
 *
 * Caracteristicas
 * <ul>
 *     <li>Pueden tener metodos abstractos: Son metodos
 *     que no tienen cuerpo solo firma. </li>
 *     <li>Define una estructura comun para las clases que la hereden</li>
 *     <li>Obliga a las subclases a implementar los metodos abstractos</li>
 * </ul>
 */
public abstract class Pet {

    /**
     * Propiedades o atributos
     * Son caracteristicas que podemos describir o contar
     * Ejemplo: Edad, Altura, Peso, Color.
     *
     * Queremos que sean privadas para que no puedan ser
     * manipuladas directamente, si no a traves de metodos que
     * nos permitan manipularlas.
     */
    private String name;
    private int age;
    private String color;


    /**
     * Metodo Constructor, Es un metodo especial
     * Que se debe llamar igual que la clase
     * Y se activa cuando creamos un objeto, en especifico al usar
     * la palabra reservada New.
     * @param name tipo String
     * @param age tipo int
     * @param color tipo String
     */
    public Pet(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }



}
