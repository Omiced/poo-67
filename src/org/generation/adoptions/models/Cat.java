package org.generation.adoptions.models;

public class Cat extends Pet{
    private String breed;


    /**
     * Metodo constructor de una subclase, en este caso
     * Cat hereda de Pet
     * <p>
     *     Cuando heredamos de otra clase
     *     el metodo constructor de la subclase va a esperar
     *     recibir la informacion de las propiedades
     *     tanto de la subclase(Cat) como de las propiedades de la super clase(Pet)
     * </p>
     * <p>
     *     Para asignarles valor a las propiedades heredadas (name, age, color)
     *     usamos el metodo super();  el cual va a fijar las propiedades heredadas de
     *     la super clase.
     * </p>
     * @param name - Type String se hereda de Pet
     * @param age - Type int se hereda de Pet
     * @param color - Type String se hereda de Pet
     * @param breed - Type String propiedad exclusiva de Cat no heredada
     */
    public Cat(String name, int age, String color, String breed){
        super(name, age, color);
        this.breed =  breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("😺" + getName() + " hace miau!!");
    }

    @Override
    public void showDetails() {
        System.out.println("Gato de nombre " + getName() + " tiene " +  getAge() +
                " años es de color "  + getColor() + " y de raza " + getBreed());
    }
}
