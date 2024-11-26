import java.util.*;

public class Main {

    public static void func(ArrayList<Object> mylist) {
        Iterator<Object> it = mylist.iterator();

        while (it.hasNext()) {
            Object element = it.next();
            if (element.equals("###")) {
                break;
            }
        }

        while (it.hasNext()) {
            Object element = it.next();
            System.out.println((String)element);
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> mylist = new ArrayList<>();
        mylist.add(42);
        mylist.add(10);
        mylist.add("###");
        mylist.add("hello");
        mylist.add("java");

        func(mylist);
    }
}