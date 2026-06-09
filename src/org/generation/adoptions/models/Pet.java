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

    /**
     * metodos especiales
     * Setters y Getters
     * Setter lo que hace es permitir fijar o sobreescribir el valor de una propiedad
     * Getter lo que hace es permitir obtener el valor de esa propiedad
     * Se suelen tener validaciones
     * Setter ejemplo validar que la edad sea un numero positivo
     * Getter ejemplo validar si alguien tiene permisos para ver esa propiedad
     */

    /**
     * Setter del name
     * Permite fijar el valor de la propiedad name desde cualquier parte del proyecto
     * @param name - type String
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Getter del name
     * Permite obtener el valor de la propiedad name desde cualquier parte del proyecto
     * @return retorna el valor de la propiedad Name
     */
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Metodo abstracto define que hay que hacer, pero no define como se hace
     * <p>
     *     Las clases que hereden de la clase Pet se veran obligadas a implementar estos
     *     metodos abstractos.
     *     Proporcionando la logica del metodo o el body
     * </p>
     */
    public abstract void makeSound();


    /**
     * Metodo abstracto define que hay que hacer, pero no define como se hace
     * <p>
     *     Las clases que hereden de la clase Pet se veran obligadas a implementar estos
     *     metodos abstractos.
     *     Proporcionando la logica del metodo o el body
     * </p>
     */
    public abstract void showDetails();
}
