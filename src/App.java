import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<Students> array = new ArrayList<>();

        menu(array, scan);

    }

    public static void addStudent(ArrayList<Students> array, Scanner scan) {
        scan.nextLine();
        System.out.println("Enter the student name");
        String name = scan.nextLine();
        System.out.println("Enter the student grade");
        Double studentGrade = scan.nextDouble();
        Students student = new Students(name, studentGrade);
        array.add(student);
        menu(array, scan);
    }

    public static void printArray(ArrayList<Students> array, Scanner scan) {
        if (array.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("\nThis is the Student list: ");
            for (Students v : array) {
                System.out.println("Nombre: " + v.name + ", Grade: " + v.grade);
            }
        }
        menu(array, scan);
    }

    public static void deleteStudent(ArrayList<Students> array, Scanner scan) {
        System.out.println("Name the student you want to delete: ");
        String name = scan.nextLine();
        boolean found = false;

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).name.equalsIgnoreCase(name)) {
                found = true;
                array.remove(i);
                System.out.println("Deleted student");
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
    }

    public static void searchStudent(ArrayList<Students> array, Scanner scan) {
        scan.nextLine();
        System.out.println("Enter the student you want to search: ");
        String name = scan.nextLine();

        if (array.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (Students v : array) {
                if (v.name.equalsIgnoreCase(name)) {
                    System.out.println("Student grade: " + v.grade);
                } else {
                    System.out.println("Student not found");
                }
            }
        }

        menu(array, scan);

    }

    public static void updateGrade(ArrayList<Students> array, Scanner scan) {
        scan.nextLine();
        System.out.println("Enter the student you want to search: ");
        String name = scan.nextLine();
        double newGrade;

        if (array.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (Students v : array) {
                if (v.name.equalsIgnoreCase(name)) {
                    System.out.println("Student grade: " + v.grade);
                    System.err.println("What is the new grade?: ");
                    newGrade = scan.nextDouble();
                    v.grade = newGrade;
                } else {
                    System.out.println("Student not found");
                }
            }
        }
        menu(array, scan);
    }

    public static void menu(ArrayList<Students> array, Scanner scan) {
        int c;
        do {
            System.out.println("\nChoose the option: ");
            System.out.println(
                    " 1. Add student and grade.\n 2. Show the student list and grades.\n 3. Delete student.\n 4. Search student.\n 5. Update grade.");
            System.out.println(" 6. Organice the list by grade.");
            System.out.println(" 7. shearch students by grade.");
            System.out.println("enter 8 to finish the program.");
            c = scan.nextInt();

            switch (c) {
                case 1:
                    addStudent(array, scan);
                case 2:
                    printArray(array, scan);
                case 3:
                    deleteStudent(array, scan);
                case 4:
                    searchStudent(array, scan);
                case 5:
                    updateGrade(array, scan);
                case 6:
                    bubbleSort.organiceBubbleSort(array);
                case 7:
                    if (binarySearch.performBinarySearch(array))
                        System.out.println("we found the chamaco.");
                default:
                    System.out.println("Not valid option...");
            }

        } while (c != 8);

    }
}
