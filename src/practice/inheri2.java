package practice;

 interface car{
   void fly();
   void drive();
 }
 class wagon implements car{


     public void fly() {
         System.out.println("flying");
     }
     public void drive() {
         System.out.println("flying");
     }

 }
public class inheri2 {
    public static void main(String[] args) {
     wagon obj = new wagon();
     obj.fly();
    }
}
