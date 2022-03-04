import java.util.Arrays;
import java.util.Scanner;

public class StudentsResult {
    public static void main(String[] args) {

        final byte STUDENTS_LIMIT = 5, MAX_MARKS = 100;
        float averageMarks = 0.0f;
        float[] mplMarks = new float[STUDENTS_LIMIT];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < STUDENTS_LIMIT; i++) {
            while (true) {
                System.out.print("Enter the Marks of Student " + (i + 1) + " :");
                mplMarks[i] = scan.nextFloat();
                if (!(mplMarks[i] > MAX_MARKS || mplMarks[i] < 0))
                    break;
                System.out.println("ENTER VALID MARKS BETWEEN 0 AND 100");
            }
        }
        scan.close();

        System.out.println("\t  ===STUDENTS RESULT===");
        System.out.println("____________________________________________");
        System.out.println("S.N0 | OB-MARKS | T-MARKS | PERCENTAGE");
        for (int i = 0; i < STUDENTS_LIMIT; i++) {
            float percentageOfStudent = (float) ((mplMarks[i] * 100.0) / MAX_MARKS);
            System.out.println("  " + (i + 1) + " \t " + mplMarks[i] + " \t   "
                    + MAX_MARKS + "\t    " + percentageOfStudent + "%");
            averageMarks += mplMarks[i];
        }

        Arrays.sort(mplMarks);
        averageMarks /= mplMarks.length;
        displayResults(averageMarks, mplMarks);

    }

    public static void displayResults(float averageMarks, float[] mplMarks) {
        System.out.println("____________________________________________");
        System.out.format("AVG Marks: %.2f.\nLowest Marks are %.1f\n",
                averageMarks, mplMarks[0]);
        System.out.format("Highest Marks are %.1f\n",
                mplMarks[mplMarks.length - 1]);
        System.out.println("____________________________________________");
    }
}
