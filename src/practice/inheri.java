package practice;
 class A{
     public static void a(){
         System.out.println("in class a");
     }
 }
 class B extends A{
     public static void a(){
         System.out.println("in class b");
     }

 }

public class inheri {
    public static void main(String[] args) {
        A ob = new B(); // upcasting
        B obj = (B)new A(); // downcasting
       ob.a();
       double r = 4.0;
       int i = (int)r;
        System.out.println(r+" "+i);

    }
}
