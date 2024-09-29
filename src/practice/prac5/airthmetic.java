package practice.prac5;
class arithmetic{

    public static void add(){

        System.out.println("from A");
    }
}
 class adder extends arithmetic{
     public static void add(){
         System.out.println("from B");
     }
}

public class airthmetic {
    public static void main(String[] args) {
     adder o = new adder();
     o.add();
     arithmetic o2 = o;
     o2.add();
    }
}
