import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MyBook new_novel = new MyBook();

        new_novel.setTitle(scan.nextLine());

        System.out.println("The title is: " + new_novel.getTitle());
        scan.close();
    }
}