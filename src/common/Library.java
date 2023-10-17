package common;

import java.time.temporal.Temporal;
import java.util.Scanner;

public class Library {

    protected Scanner sc;

    public Library() {
        sc = new Scanner(System.in);
    }


    public double getDouble(String promt) {
        double a = -1;
        while (true) {
            System.out.print(promt + ": ");
            try {
                String s = sc.nextLine();
                a = Double.parseDouble(s);
                if (a > 0) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number greater than zero: ");
            }
        }
        return a;
    }
    
        public boolean getYN(String promt) {
        boolean a;
        while (true) {
            System.out.print(promt + ": ");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("Y")) return true;
            if (s.equalsIgnoreCase("N")) return false;
            System.out.println("Please enter Y or N ");
        }
    }

    

}
