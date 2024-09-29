package practice.casting;

public class thro {
     static class Student{
         Student a;
     }

    public static void main(String[] args) {
        System.out.println("start");


        if(10>5){
            throw new NullPointerException();
        }
        System.out.println("end");
    }
}
