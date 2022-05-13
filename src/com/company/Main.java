package com.company;


public class Main {

    public static void main(String[] args) {

        String assignmentNumber = args[0];
        String parameter = args[1];

        switch(assignmentNumber) {
            case "1":
                int parsedNumber;
                try {
                    parsedNumber = Integer.parseInt(parameter);
                    if(checkNumber(parsedNumber))
                        System.out.println("1st assignment result: Hello");
                } catch (Exception e) {
                    System.out.println("1st assignment result: ERROR: Please provide a number.");
                }
                break;
            case "2":
                if (checkName(parameter))
                    System.out.println("2nd assignment result: Hello, " + parameter);
                else
                    System.out.println("2nd assignment result: There is no such name.");
                break;
            case "3":
                System.out.println("3rd assignment result:");
                for (String s : parameter.split(",")) {
                    int number = Integer.parseInt(s.strip());
                    if (number % 3 == 0) {
                        System.out.println(number);
                    }
                }
                break;
            default:
                System.out.println("There is no such assignment.");

        }
    }

    public static boolean checkNumber (int number) {
        return number > 7;
    }

    public static boolean checkName (String name) {
        return name.equalsIgnoreCase("viacheslav");
    }
}
