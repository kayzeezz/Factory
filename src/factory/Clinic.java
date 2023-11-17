package factory;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an animal");
        System.out.println("1. Dog");
        System.out.println("2. Bird");
        System.out.println("3. Exit");
        System.out.print("Enter number: ");
        Integer choice = input.nextInt();

        AnimalRecord animalRecord = new AnimalRecord();
        Animal animal;

        switch (choice) {
            case 1:
                animal = new Dog();
                animalRecord.setAnimalName("Milo");
                animalRecord.setAnimalId("P001");
                animalRecord.setAnimal(animal);
                ((Dog) animal).setBreed("Shih tzu");
                break;

            case 2:
                animal = new Bird();
                animalRecord.setAnimalName("Kiwi");
                animalRecord.setAnimalId("P002");
                animalRecord.setAnimal(animal);
                ((Bird) animal).setTyoe("small");
                break;
            case 3:
                System.exit(0);

        }

        System.out.println("Animal id is " + animalRecord.getAnimalId());
        System.out.println("Animal name is " + animalRecord.getAnimalName());
        System.out.println("Animal kind: " + animalRecord.getAnimal().getClass().getSimpleName());
        System.out.println("Communication sound: " + animalRecord.getAnimal().makeSound());
        System.out.println("Play mode: " + animalRecord.getAnimal().play());


    }

}
