import org.generation.adoptions.exceptions.InvalidData;
import org.generation.adoptions.interfaces.Adoptable;
import org.generation.adoptions.models.Cat;
import org.generation.adoptions.models.Pet;
import org.generation.adoptions.models.Turtle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        try{
            pets.add(new Cat("July", 5, "Blanca con gris", "Americano pelo corto" ));
            pets.add(new Cat("Haru", 4, "Siames con blanco", "Imitacion siames"));
            pets.add(new Cat("Naranjin", 5, "Naranja", "Naranjoso"));
            pets.add(new Turtle("Leonardo", 2, "azul", false));
            pets.add(new Turtle("Donatello", 2, "morado", true));
        }catch (InvalidData error){
            System.out.println("Error al crear la mascota " + error.getMessage());
        }

      for(Pet pet : pets){
          pet.showDetails();
          pet.makeSound();
          if(pet instanceof Adoptable){
              ((Adoptable) pet).adopt();
          }

          System.out.println();
      }

    }
}
