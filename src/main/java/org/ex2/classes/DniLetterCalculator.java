package org.ex2.classes;

public class DniLetterCalculator {

    public DniLetterCalculator() {
    }

    public char calculateLetter(long number) {
        char[] letters = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T', 'R', 'W', 'A', 'G', 'M', 'Y'
        };
        int indexOfLetter = (int) (number % 23);
        return letters[indexOfLetter];
    }
}
