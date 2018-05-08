class NormalClass extends  AbstractClass{
   static void printName() {
      System.out.println("classe");
   }

   public void printFromNormal() {
      printName();
   }
}

abstract class AbstractClass implements InterfaceClass {
   static void printName() {
      System.out.println("abstract");
   }
   public void printFromAbstract() {
      printName();
   }
}

interface InterfaceClass {
   int interfaceVariable = 10;
   static void printName() {
      System.out.println("interface");
   }
   default void printFromInterface() {
      printName();
   }
}

public class InterfaceClasses {

   public static void main(String[] args) {
      //System.out.println("OK");
//   NormalClass normal = new NormalClass();
//   normal.printFromNormal();
//   normal.printFromAbstract();
//   normal.printFromInterface();

   NormalClass test = new NormalClass();
      System.out.println(test.interfaceVariable);

//   AbstractClass abstractClass = new NormalClass();
//   abstractClass.printFromInterface();
//   abstractClass.printFromAbstract();
//   ((NormalClass) abstractClass).printFromNormal();
//
//   InterfaceClass interfaceClass = new NormalClass();
//   interfaceClass.printFromInterface();
//   ((NormalClass) interfaceClass).printFromNormal();
//   ((NormalClass) interfaceClass).printFromAbstract();

   }

}
