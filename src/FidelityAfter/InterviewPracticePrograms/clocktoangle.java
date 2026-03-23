package FidelityAfter.InterviewPracticePrograms;

public class clocktoangle {
    public static void main(String[] args) {
        double hour = 12; double min = 30;
        if(hour==12) hour = 0;

        double hangle = (hour + min/60) * 30;
        double mangle = min * 6;

        double angle = Math.abs(hangle-mangle);
        angle = Math.min(angle,360-angle);

        System.out.println(angle);

    }
}
