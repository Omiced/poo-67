import org.generation.adoptions.models.Cat;

public class Main {
    public static void main(String[] args) {

        Cat july = new Cat("July", 5, "Blanca con gris", "Americano pelo corto" );
        Cat haru = new Cat("Haru", 4, "Siames con blanco", "Imitacion siames");

        july.makeSound();
        july.showDetails();

        haru.makeSound();
        haru.showDetails();
    }
}
