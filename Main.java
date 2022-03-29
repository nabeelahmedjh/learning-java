package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int TOTAL_STUDENTS = 10;
        Candidate[] students = new Candidate[TOTAL_STUDENTS];
        setMarks(students, TOTAL_STUDENTS);

        MorningBatch[] list1 = new MorningBatch[TOTAL_STUDENTS / 2];
        EveningBatch[] list2 = new EveningBatch[TOTAL_STUDENTS / 2];

        sortStudents(students, TOTAL_STUDENTS);
        for (int i = 0; i < TOTAL_STUDENTS; i++) {

            int half = TOTAL_STUDENTS / 2;
            if (i < TOTAL_STUDENTS / 2) {
                list1[i].marks = students[i].marks;
                list1[i].batch = "Evening";
            } else {
                list2[i - half].marks = students[i].marks;
                list2[i - half].batch = "Morning";
            }
        }
        displayBatches(list1, list2, TOTAL_STUDENTS);
    }

    public static void setMarks(Candidate[] students, int TOTAL_STUDENTS) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            students[i] = new Candidate();
            System.out.print("Student " + (i + 1) + " Marks: ");
            students[i].marks = scan.nextInt();
            System.out.print("Challan Paid (y/n) : ");
            students[i].setChallanPaid(scan.next());
        }
        scan.close();

    }

    public static void sortStudents(Candidate[] students, int TOTAL_STUDENTS) {
        for (int i = 0; i < TOTAL_STUDENTS - 1; i++) {
            for (int j = 0; j < TOTAL_STUDENTS - 1; j++) {

                if (students[j + 1].marks < students[j].marks) {
                    Candidate temp;
                    temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    public static void displayBatches(MorningBatch[] list1, EveningBatch[] list2, int TOTAL_STUDENTS) {
        System.out.println("MORNING BATCH");
        for (int i = 0; i < TOTAL_STUDENTS / 2; i++) {
            System.out.println("Student " + i + 1 + "Marks: " + list1[i].marks);
        }

        System.out.println("EVENING BATCH");
        for (int i = 0; i < TOTAL_STUDENTS / 2; i++) {
            System.out.println("Student " + i + 1 + "Marks: " + list2[i].marks);
        }
    }
}