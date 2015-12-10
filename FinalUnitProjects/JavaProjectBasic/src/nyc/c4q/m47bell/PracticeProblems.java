package nyc.c4q.m47bell;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by c4q-marbella on 12/5/15.
 */
public class PracticeProblems {
    private String word;

    //problem 1
    public void calculateC(double a, double b) {

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println(c);

    }

    //problem 2
    public void findSmallLarge(ArrayList<Integer> integers) {

        int smallest;
        int largest;

        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i) == 0) {
                if (integers.size() > 1) {
                    Collections.sort(integers);
                    smallest = integers.get(0);
                    largest = integers.get(integers.size() - 1);
                    System.out.println(smallest);
                    System.out.println(largest);
                } else if (integers.size() == 0) {
                    System.out.println("no values have been entered");
                }

            }
        }
    }


    public void printStepsToOne(int n) {
        int count = 0;

        if (n > 0) {
            System.out.println("Starting with number " + n + ":");
            while (n != 1) {
                if (n % 2 == 0) {
                    System.out.print(n + " is even,");
                    n = n / 2;
                    System.out.println(" so I take half: " + n);
                    count++;
                } else {
                    System.out.print(n + " is odd,");
                    n = 3 * n + 1;
                    System.out.println(" so I make 3n + 1: " + n);
                    count++;
                }
            }
            System.out.println("The process took " + count + " steps to reach 1");
        } else
            System.out.println("enter a positive number");
    }
}

