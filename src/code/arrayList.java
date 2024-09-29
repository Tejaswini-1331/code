package code;
import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    static void reverseList(ArrayList<Integer> l){
        int i=0, j=l.size()-1;
        Integer temp = Integer.valueOf(l.get(i));
        l.set(i,l.get(j));
        l.set(j,temp);
        i++;
        j--;
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(4);
        l.add(3);
        l.add(6);
        l.add(5);
        l.add(7);
        System.out.println("original list "+ l);
        //reverseList(l);
        Collections.reverse(l);
        System.out.println("reversed list " + l);
        Collections.sort(l);
        System.out.println("ascending order" + l);
        Collections.sort(l,Collections.reverseOrder());
        System.out.println("descending order" + l);
    }
}
