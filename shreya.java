import java.util.Scanner;
public class AttendanceManagement {
    private static final int MAX_STUDENTS = 100;
    private static final int MAX_DAYS = 31;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] students = new String[MAX_STUDENTS];
        boolean[][] attendance = new boolean[MAX_STUDENTS][MAX_DAYS];

        int studentCount = 0;
        int currentDay = 0;

        System.out.println("Welcome to Attendance Marker");
