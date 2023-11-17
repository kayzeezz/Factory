package factory;

public class Dog implements  Animal{
     private String breed;

     public String getBreed() {
          return breed;
     }

     public void setBreed(String breed) {
          this.breed = breed;
     }

     @Override
     public String makeSound() {
          return "Aw, aw, aw!";
     }

     @Override
     public String play() {
          return "plays catch and fetch!";
     }
}
