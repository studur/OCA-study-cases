public class VariablesHiding {

   public static void main(String[] args) {
      Parent martin = new Bebe();
      Parent.print();

      Enfant ariane = new Bebe();
      Enfant.print();

   }



}

class Parent {
   static void print() {
      System.out.println(name);
   }
   public static String name = "parent";
}

class Enfant extends Parent {
   static void print() {
      System.out.println(name);
   }
   public static String  name = "Enfant";
}

class Bebe extends Enfant {
   static void print() {
      System.out.println(name);
   }
   public static String name = "bebe";
}