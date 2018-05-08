public class InterfacesTests  extends Class  {

   public static void main(String[] args) {

      InterfacesTests obj2 = new InterfacesTests();
      //System.out.println(obj2.getNum());


      // Cannot access Interface static methods through reference type as in the case of
      // static method in a regular class
      Interface obj = new InterfacesTests();
      // System.out.println(obj.getNum()); // Does not compile

      // However, we can access a static variable
      System.out.println(obj.numInterface);


      Class obj3 = (Class) obj;
      System.out.println(obj3.numInterface);

   }
}



interface Interface {
   static int getNum() {
      return 8;
   }

   int numInterface = 8;
}

class Class extends Abstract implements Interface {
  static int numInterface = 10;
//   static int getNum() {
//      return 10;
//   }
}

abstract class Abstract {
   int numInterface = 9;
   static int getNum(){
      return 9;
   }
}