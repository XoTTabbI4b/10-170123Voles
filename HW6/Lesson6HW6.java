package HW6;


import java.util.ArrayList;
import java.util.List;
/**
 * Java. Homework #6
 * @author user Yauheni Bakhar
 * @version 19 May 2023
  */
public class Lesson6HW6 {
    public static void main(String[] args) {
        List<Integer> inList = new ArrayList<>();
        inList.add(8);
        inList.add(17);
        inList.add(5);
        inList.add(23);
        System.out.println(inList);
        System.out.println(inList.get(1));
        inList.remove(1);
        System.out.println(inList);
        System.out.println("------ RubberArray");

        RubberArrayHW6 rb = new RubberArrayHW6();
        System.out.println(rb);
        rb.add(8);
        rb.add(17);
        rb.add(5);
        rb.add(23);
        System.out.println(rb);
        System.out.println(rb.get(1));
        rb.remove(1);
        System.out.println(rb);
        rb.remove(0);
        System.out.println(rb);
        rb.remove(0);
        System.out.println(rb);
    }
}
