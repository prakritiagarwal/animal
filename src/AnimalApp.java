import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args){
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        Scanner scanner = new Scanner (System.in);
        ArrayList<Animal> animals = new ArrayList<Animal>();
        String dogNameInput;
        Boolean isDog;
        do {
            System.out.println("Please enter a name");
            dogNameInput = scanner.nextLine();
            if(dogNameInput.isEmpty())
                break;
            System.out.println("Is it a dog Yes/No");
            String dog = scanner.nextLine();
            if(dog.equalsIgnoreCase("yes"))
                isDog = true;
            else
                isDog = false;

            Animal animal = new Animal(dogNameInput, isDog);
            animals.add(animal);
        } while(true);

        for (Animal animal : animals) {
            System.out.println(animal);
        }        
        scanner.close();
    }
}
