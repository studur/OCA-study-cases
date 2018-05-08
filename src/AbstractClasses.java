abstract class AbstractParent {
public String name = "parent";

static {
   System.out.println("1");
}

AbstractParent(String name) {
   System.out.println("2");
   this.name = name;
}

}


public class AbstractClasses extends AbstractParent {

   static {
      System.out.println("4");
   }

   AbstractClasses(){
      super("Salut");
      System.out.println("3");

   }

   public static void main(String[] args) {
      // Can use the Abstract class as reference type
      AbstractParent parent = new AbstractClasses();

      printElement(parent);

   }


   public static void printElement(AbstractParent parent) {
      System.out.println(parent.name);
   }
}
