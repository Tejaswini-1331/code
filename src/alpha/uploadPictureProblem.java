package alpha;

import java.sql.SQLOutput;
import java.util.Scanner;

public class uploadPictureProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int W = sc.nextInt(); int H = sc.nextInt();
        if(W>L && H>L) System.out.println("crop it");
        else if (W<L || H<L) System.out.println("upload another");
        else if(W==L && H==L) System.out.println("accepted");
    }
}
