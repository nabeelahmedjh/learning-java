import java.util.Scanner;

import javax.naming.NamingException;
import javax.sound.midi.MidiChannel;

public class AssignmentOneSP21_BCS_000 {
    public static void main(String[] args) {

        final byte studentsLimit = 5, maxMarks = 100;
        int[] mplMarks = new int[studentsLimit];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < studentsLimit; i++) {
            System.out.print("Enter the Marks of Student " + (i + 1) + " :");
            mplMarks[i] = scan.nextInt();
        }

        scan.close();
        
        // initializing the conter for minimun and maximun marks
        int minimunMarksIndex = 0, maximunMarksIndex = 0;
        float averageMarks = 0.0f;

        System.out.println("\t===STUDENTS MARKS===");
        System.out.println("S.N0 OB-MARKS T-MARKS PERCENTAGE");
        for (int i = 0; i < studentsLimit; i++) {

            float percentageOfStudent = (float) ((mplMarks[i] * 100.0) / maxMarks);

            System.out.println("  " + (i + 1) + " \t " + mplMarks[i] + " \t "
                    + maxMarks + " \t " + String.format("%.0f%%", percentageOfStudent));

            // codition for finding lowest marks of student
            if (mplMarks[minimunMarksIndex] > mplMarks[i]) {
                minimunMarksIndex = i;
            }

            // codition for finding higest marks of student
            if (mplMarks[maximunMarksIndex] < mplMarks[i]) {
                maximunMarksIndex = i;
            }

            averageMarks += mplMarks[i];
        }

        averageMarks /= mplMarks.length;

        System.out.println(String.format("Lowest Marks are %d Obtained by student %d.",
                mplMarks[minimunMarksIndex], minimunMarksIndex + 1));
        System.out.println(String.format("Highest Marks are %d Obtained by student %d.",
                mplMarks[maximunMarksIndex], maximunMarksIndex + 1));
        System.out.println("Average Marks of Students: " + averageMarks);

    }
}
