package code;

public class recusion_4 {
    static int long_division(int x,int y){
        int rem=0;
        while(x%y!=0){
             rem=x%y;
             x=y;
             y=rem;
        }
        return y;
    }
    static int euclid_algo(int x, int y){
        if(y==0) return x;
        return  euclid_algo(y,x%y);

    }
    public static void main(String[] args) {
        System.out.println(euclid_algo(15,24));
    }
}
