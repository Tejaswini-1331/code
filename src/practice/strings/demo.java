package practice.strings;

import java.util.ArrayList;
import java.util.*;
public class demo {


    public static void main(String[] args) {
        int x = 111, y = 101;

        switch (x & y) {
            case 1 :
                System.out.print("-1-");
            case 101 :
                System.out.print("-101-");
            case 111 :
                System.out.print("-111-");
            case 010 :
                System.out.print("-010-");
            default :
                System.out.print("-" + (x & y) + "-");
        }
        }
}
