package org.generation.adoptions.models;

import org.generation.adoptions.exceptions.InvalidData;

public class Turtle extends Pet {
    private boolean isMarine;

    public Turtle(String name, int age, String color, boolean isMarine) throws InvalidData {
        super(name, age, color);
        this.isMarine = isMarine;
    }

    public boolean isMarine() {
        return isMarine;
    }

    public void setMarine(boolean marine) {
        isMarine = marine;
    }

    @Override
    public void makeSound() {
        System.out.println("Sonidos de tortuga 🐢");
    }

    @Override
    public void showDetails() {
        System.out.println("La tortuga de nombre " + getName() + " tiene color " + getColor() + " tiene " + getAge() + " años y es " +
                (isMarine() ? " es marina" : " es terrestre"));
    }
}
