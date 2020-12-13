package exceptions;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.getMyDouble();
        MyInterface myInterface = (MyInterface) myClass;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Your input:");
            String stringValue = scanner.nextLine();
            try {
                int intValue = Integer.parseInt(stringValue);
                System.out.println("Integer parsed:" + intValue);
            } catch (NumberFormatException e) {
                try {
                    double doublevalue = Double.parseDouble(stringValue);
                    System.out.println("Double parsed:" + doublevalue);
                } catch (NumberFormatException ex) {
                    System.out.println("Hey! That’s not a value! Try once more.");
                }
            }
        }

    }
}
