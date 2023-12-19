package lab16;

import java.util.Scanner;

public class Exception2 {
    public void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int sw = myScanner.nextInt();
        switch (sw) {
            case 1:
                try {
                    System.out.print("Enter an integer: ");
                    String intString = myScanner.next();
                    int i = Integer.parseInt(intString);
                    System.out.println(2 / i);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                } catch (ArithmeticException e) {
                    System.out.println("Attempted division by zero.");
                }
                break;
            case 2:
                try {
                    System.out.print("Enter an integer: ");
                    String intString = myScanner.next();
                    int i = Integer.parseInt(intString);
                    System.out.println(2 / i);
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }/* catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                } catch (ArithmeticException e) {
                    System.out.println("Attempted division by zero.");}*/
                break;
            case 3:
                try {
                    System.out.print("Enter an integer: ");
                    String intString = myScanner.next();
                    int i = Integer.parseInt(intString);
                    System.out.println(2 / i);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter an integer.");
                } catch (ArithmeticException e) {
                    System.out.println("Attempted division by zero.");
                } finally {
                    System.out.println("Finally block executed.");
                }
                break;
        }
    }
}
