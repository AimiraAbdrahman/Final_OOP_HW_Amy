package View;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.*;

import Controller.ComplexNumberController;
import Model.impl.ComplexNumber;

public class ComplexNumberView implements NumberView {
    
    private ComplexNumberController ComplexController = new ComplexNumberController();

    public void start(){
        try {
            MyLogger my_log = new MyLogger("log_txt");
            my_log.logger.setLevel(Level.INFO);
            my_log.logger.info("Application started");
        }
        catch (Exception e) {
            e.getMessage();
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - add");
            System.out.println("2 - subtract");
            System.out.println("3 - multiply");
            System.out.println("4 - divide");
            System.out.println("5 - square");
            System.out.println("6 - conjugate");
            System.out.println("7 - mod");
            System.out.println("8 - pow");
            
            switch (scanner.nextInt()) {
                case 1 -> add();
                case 2 -> subtract();
                case 3 -> multiply();
                case 4 -> divide();
                case 5 -> square();
                case 6 -> conjugate();
                case 7 -> mod();
                case 8 -> pow();
                case 9 -> System.exit(0);
            
                default -> System.out.println("Операция не поддерживается");
            }
        }

    }

    private ComplexNumber add(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number z1:");
        String z1 = scanner.nextLine();
        ComplexNumber z1Parsed = ComplexController.parseComplex(z1);
        System.out.println("Enter complex number z2:");
        String z2 = scanner.nextLine();
        ComplexNumber z2Parsed = ComplexController.parseComplex(z2);
        ComplexNumber result = ComplexController.add(z1Parsed, z2Parsed);
        System.out.println("z1 + z2 = " + result);
        try {
            MyLogger my_log = new MyLogger("log_txt");
            my_log.logger.setLevel(Level.INFO);
            my_log.logger.info("Performed addition of two complex numbers" + z1Parsed + z2Parsed + " = " + result);
        }
        catch (Exception e) {
            e.getMessage();
        }
        return result;

    };

    private ComplexNumber subtract(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number z1:");
        String z1 = scanner.nextLine();
        ComplexNumber z1Parsed = ComplexController.parseComplex(z1);
        System.out.println("Enter complex number z2:");
        String z2 = scanner.nextLine();
        ComplexNumber z2Parsed = ComplexController.parseComplex(z2);
        ComplexNumber result = ComplexController.subtract(z1Parsed, z2Parsed);
        System.out.println("z1 - z2 = " + result);
        return result;
    };

    private ComplexNumber multiply(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number z1:");
        String z1 = scanner.nextLine();
        ComplexNumber z1Parsed = ComplexController.parseComplex(z1);
        System.out.println("Enter complex number z2:");
        String z2 = scanner.nextLine();
        ComplexNumber z2Parsed = ComplexController.parseComplex(z2);
        ComplexNumber result = ComplexController.multiply(z1Parsed, z2Parsed);
        System.out.println("z1 * z2 = " + result);
        return result;
    };

    private ComplexNumber divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number z1:");
        String z1 = scanner.nextLine();
        ComplexNumber z1Parsed = ComplexController.parseComplex(z1);
        System.out.println("Enter complex number z2:");
        String z2 = scanner.nextLine();
        ComplexNumber z2Parsed = ComplexController.parseComplex(z2);
        ComplexNumber result = ComplexController.divide(z1Parsed, z2Parsed);
        System.out.println("z1 / z2 = " + result);
        return result;
    };

    private ComplexNumber square(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number z1:");
        String z1 = scanner.nextLine();
        ComplexNumber z1Parsed = ComplexController.parseComplex(z1);
        ComplexNumber result = ComplexController.square(z1Parsed);
        System.out.println("z^2 = " + result);
        return result;
    };

    private ComplexNumber conjugate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number z1:");
        String z1 = scanner.nextLine();
        ComplexNumber z1Parsed = ComplexController.parseComplex(z1);
        ComplexNumber result = ComplexController.conjugate(z1Parsed);
        System.out.println("The conjugate of z1 is " + result);
        return result;
    };

    private double mod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number z1:");
        String z = scanner.nextLine();
        ComplexNumber zParsed = ComplexController.parseComplex(z);
        double result = ComplexController.mod(zParsed);
        System.out.println("The modulus of z1 is " + result);
        return result;
    };

    private ComplexNumber pow(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter complex number z1:");
        String z = scanner.nextLine();
        ComplexNumber zParsed = ComplexController.parseComplex(z);
        System.out.println("Введите степень:");
        int power = scanner.nextInt();
        ComplexNumber result = ComplexController.pow(zParsed, power);
        System.out.println(zParsed + "^" + power + " = " + result);
        return result;
    };
}
