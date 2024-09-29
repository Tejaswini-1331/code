package practice;
enum laptop{
    Macbook,ThinkPad,Lenovo(45000);
    private int price;
    laptop(int price){
        this.price=price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    laptop(){
       price = 40;
    }
}

public class enumm {
    public static void main(String[] args) {
     laptop tej = laptop.Lenovo;

        System.out.println(tej.getPrice());
    }
}
