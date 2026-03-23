package FidelityAfter;

public class swapNumbers {

    public static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.printf(" a = %d, b = %d %n",a,b);
        System.out.printf(" a " +a + " b" +b);
    }
    public static void main(String[] args){
     swap(10,2);
    }
}
