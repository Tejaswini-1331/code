package alpha;

import java.util.Scanner;

public class zoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int x = 0, y = 0;
        char[] ch = n.toCharArray();
        System.out.println(ch);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'z') {
                x = x + 1;
            } else if (ch[i] == 'o') {
                y = y + 1;
            }
        }

        if ((2 * x) == y) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
