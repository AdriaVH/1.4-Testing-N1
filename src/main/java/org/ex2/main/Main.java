package org.ex2.main;

import org.ex2.classes.DniLetterCalculator;

public class Main {
    public static void main(String[] args) {
        try {
            long dniNumber = 55555555;

            if (dniNumber < 0 || dniNumber > 99999999) {
                throw new IllegalArgumentException("Invalid DNI number. It should be a none negative 8-digit number.");
            }

            DniLetterCalculator dniLetterCalculator = new DniLetterCalculator();
            char dniLetter = dniLetterCalculator.calculateLetter(dniNumber);
            System.out.println("The letter for the DNI number " + dniNumber + " is: " + dniLetter);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
