package com.JavaFeatures;

public class Java12 {
    public static void main(String[] args) {
        //JAVA 12
        //1. Here switch returns the value with respective return type
        //2. syntax has changed added new -> arrow
        //3. no need to add break statement.
        int no =7;

        String result = switch (no)
        {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thrusday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Invalid Day of the week!");

        };

        System.out.println("Result =" + result);
    }
}

