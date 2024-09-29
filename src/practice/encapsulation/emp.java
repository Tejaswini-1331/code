package practice.encapsulation;

public class emp {

    public static void main(String [] args) {
        boss obj = new boss(2);
        boss obj1 = new boss(2);
        System.out.println(obj.hashCode()+" "+obj1.hashCode());
        System.out.println(obj.equals(obj1));//
        boss obj3 = new boss(0);
        System.out.println(obj3.hashCode());



    }
}
