package practice.abstraction;


   class a{
    a(){
        System.out.println("from a");
    }

 }

class b extends a{
      b(){
          System.out.println("from b constructor");
      }
    /*public void d1(){
        System.out.println("from b");
    }*/
  }

 public class prac5 {
    public static void main(String[] args) {
      b o = new b();

    }
}
