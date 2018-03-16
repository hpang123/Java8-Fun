package practice1;

public class StaticInterfaceMethods {
   public static void main(String[] args) {
      Greeter worldGreeter = Greeter.newInstance("World");
      System.out.println(worldGreeter.greet());
   }
}

interface Greeter {
   String greet();

   //Now you can add static method in interface
   static Greeter newInstance(String greeted) {
      return new Greeter() {
         public String greet() { return "Hello, " + greeted; }
      };
   }
}
