import java.util.ArrayList;
import java.util.Scanner;

public class binarySearch {

    public static boolean performBinarySearch(ArrayList<Students> array){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the grade you want to find a student: ");
        double grade = scan.nextDouble();

        int start = 0;
        int end = array.size()-1;
        int prom;
        boolean found = false;

        while(start<=end){
            prom = (start+end)/2;
            if (grade==array.get(prom).grade){
                System.out.println("The student is: "+array.get(prom).name);
                found = true;
                return found;
            } else if (grade<array.get(prom).grade){
                end = prom -1;
            } else {
                start = prom +1; 
            }
        }
        return found;
    }
    

}
