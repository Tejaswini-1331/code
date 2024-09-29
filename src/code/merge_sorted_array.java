package code;

public class merge_sorted_array {
    public static String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        int k = 0;
        StringBuilder ans = new StringBuilder("");
         while(i<word1.length() && j<word2.length()){
            ans = ans.append(word1.charAt(i));
            i++;
            ans = ans.append(word2.charAt(j));
            j++;
        }
        if(i<word1.length()){
            ans = ans.append(word1.charAt(i));
            i++;
        }
        if(j<word2.length()){
            ans = ans.append(word2.charAt(j));
            j++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
            String a = "abcrew";
            String b = "efg";
        System.out.println( mergeAlternately(a,b));
    }
}
