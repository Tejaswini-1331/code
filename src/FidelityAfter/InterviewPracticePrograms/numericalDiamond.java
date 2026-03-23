package FidelityAfter.InterviewPracticePrograms;

public class numericalDiamond {
    public static void main(String[] args) {
        int n = 4;

        for(int i=1; i<=n; i++){
            //increasing
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int k = i-1; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            for(int k =1; k<= i; k++){
                System.out.print(k);
            }

            for(int k = i-1; k>=1; k--){
                System.out.print(k);
            }
            System.out.println();

        }
    }
}
