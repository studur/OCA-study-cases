import java.util.ArrayList;
import java.util.List;

public class Polymorphisme {

   public static List<Animal> createZoo() {
      Animal beluga = new Beluga();
      beluga.hasFur();

      Animal animal = beluga;
      //animal.hasFur();

      // Animal animal2 = new Chien();

      // Animal animal1 = new Animal();

      List<Animal> list = new ArrayList<>();

      list.add(beluga);
      list.add(animal);
      // list.add(animal2);
      // list.add(animal1);

      return list;
   }

   public static List<Animal> addAnimalToZoo(Animal animal, List<Animal> list) {
      list.add(animal);
      return list;
   }

   public static void main(String[] args) {

      // List<Animal> list = createZoo();
      //  addAnimalToZoo(new Beluga(), list);
      //  addAnimalToZoo(new Chat(), list);

      System.out.println("**** Testing regular method inheritance. ****");
      Beluga normalBeluga = new Beluga();
      normalBeluga.hasFur();

      Animal normalAnimal = normalBeluga;
      normalAnimal.hasFur();

      // Normal inheritance rules. The object type determines which inherited methods definition is called.
      // The reference type determines only IF the method is available or not. The method is overridden or both
      // the parent reference type and the child reference type.

      System.out.println("****  Testing static method inheritance. ****");
      Beluga staticBeluga = new Beluga();
      staticBeluga.isAnimal(); // calling static method

      Animal staticAnimal = staticBeluga;
      staticAnimal.isAnimal(); // calling static method

      Chien staticChien = new Chien(); // inherits from Beluga
      staticChien.isAnimal(); // calling static method

      // Static methods can be inherited like in the case of Chien but cannot be overridden. Both methods exists
      // and can be reached with the corresponding reference type.

      System.out.println("**** Testing regular variables inheritance. ****");
      Beluga normalBeluga2 = new Beluga();
      System.out.println(normalBeluga2.age);

      Animal normalAnimal2 = normalBeluga2;
      System.out.println(normalAnimal2.age);

      // There is no variable inheritance, only variable hiding. Each variable exists in its own instance. When a child is instanced, the parent
      // instance holds also an instance of its own variables. The reference type determines which variable is accessed.

      System.out.println("**** Testing static variables inheritance. ****");
      Beluga staticBeluga2 = new Beluga();
      System.out.println(staticBeluga2.age);

      Animal staticAnimal2 = staticBeluga2;
      System.out.println(staticAnimal2.age);

      // Same as instance variables, there is no static variables inheritance. Only variable hiding.

      System.out.println("**** Testing the variable hiding. ****");
      Beluga normalBeluga3 = new Beluga();
      normalBeluga3.hasHiddenFur();

      Animal normalAnimal3 = normalBeluga3;
      normalAnimal3.hasHiddenFur();

      // If the method is overridden in the child, then the local variable of the method definition is called.
      // To test this behavior, comment out the overriden version in the Beluga class.
      // If the method is inherited, the local variable where the method is defined is called.
      // Reference type has nothing to do in this.
      // Same thing with static versions although a static method cannot call an instance variable...


//      for (Animal animals : list) {
//         animals.hasFur();
//      }
   }


}


class Animal {
   //   static {
//      System.out.println("1");
//   }
   public Animal() {

   }

   static int numLegs = 4;

   static void isAnimal() {
      System.out.println("Animal is indeed an animal");
   }

   int age = 10;
   String name = "an animal";

   public void hasFur() {
      System.out.println("I am " + name + " and I have fur");
   }

   public void hasHiddenFur() {
      System.out.println("I am " + name + " and I have fur");
   }

}

class Beluga extends Animal {
   //   static {
//      System.out.println("2");
//   }
   static int numLegs = 0;

   public Beluga() {

   }

   public static void isAnimal() {
      System.out.println("Beluga is also an animal");
   }

   int age = 40;
   String name = "a beluga";

   public void hasFur() {
      System.out.println("I am " + name + " and I do not have fur");
   }

   public void hasHiddenFur() {
      System.out.println("I am " + name + " and I have fur");
   }
}

class Chien extends Beluga {
   //   static {
//      System.out.println("3");
//   }
   Chien() {

   }

   public void hasFur() {
      System.out.println("I am a dog and I also have fur");
   }
}

class Chat extends Chien {
//   static {
//      System.out.println("4");
//   }
}