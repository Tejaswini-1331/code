package practice;

class book
{
    int roll; String name;
    book(int roll, String name){
        this.roll=roll;
        this.name=name;
        System.out.println(roll +" " + name);
    }
    book(int roll, String name, int roll2){
        this.roll=roll;
        this.name=name;
        System.out.println(roll +" " + name +" "+ roll2);
    }

    public void book(){
        System.out.println(roll +" " + name);
    }
}
public class constructor {
    public static void main(String[] args) {

            book obj = new book(1,"adb");
            obj.book();

        }
}
