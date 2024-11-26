import java.util.*;

class Student {}
class Rockstar {}
class Hacker {}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Object> list = new ArrayList<Object>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            if (s.equals("Student")) {
                list.add(new Student());
            } else if (s.equals("Rockstar")) {
                list.add(new Rockstar());
            } else if (s.equals("Hacker")) {
                list.add(new Hacker());
            }
        }
        sc.close();

        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Object obj : list) {
            if (obj instanceof Student) {
                studentCount++;
            } else if (obj instanceof Rockstar) {
                rockstarCount++;
            } else if (obj instanceof Hacker) {
                hackerCount++;
            }
        }
        System.out.print(studentCount + " " + rockstarCount + " " + hackerCount);
    }
}