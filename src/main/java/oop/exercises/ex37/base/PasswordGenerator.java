package oop.exercises.ex37.base;

import java.util.Random;

public class PasswordGenerator {

    private static final String[] letters = {"A", "B", "C", "D", "E", "F", "G",
            "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",
            "V", "W", "X", "Y", "Z", "a", "b", "c", "d", "e", "f", "g", "h", "i",
            "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
            "x", "y", "z"};

    private static final String[] numbers = {"1", "2", "3", "4", "5", "6", "7",
            "8", "9", "0"};

    private static final String[] specials = {"!", "@", "#", "$", "%", "^", "&",
            "*", "(", ")", "<", ">", "?"};

    private static final Random random = new Random();

    private int minLength;
    private int maxLength;
    private int numNumbers;
    private int numSpecial;

    public PasswordGenerator(int minLength,  int maxLength, int numNumbers, int numSpecial) {
        if (((numSpecial + numNumbers) * 2) > minLength) {
            throw new IllegalArgumentException("There must be at least as many " +
                    "letters as numbers and special characters");
        }
        if (minLength > maxLength) {
            throw new IllegalArgumentException("Minimum length cannot be larger " +
                    "than maximum length");
        }

        this.minLength = minLength;
        this.maxLength = maxLength;
        this.numNumbers = numNumbers;
        this.numSpecial = numSpecial;
    }


    public String generatePassword() {
        int length = minLength + random.nextInt(maxLength - minLength + 1);

        int numLettersLeft = length - numSpecial - numNumbers;
        int numNumbersLeft = numNumbers;
        int numSpecialLeft = numSpecial;

        StringBuilder password = new StringBuilder();

        for(int i = 0; i < length; i++) {
            int charType = chooseCharacterType(numLettersLeft, numNumbersLeft,
                    numSpecialLeft);

            if(charType == 0) {
                password.append(generateLetter());
                numLettersLeft--;
            } else if (charType == 1) {
                password.append(generateNumber());
                numNumbersLeft--;
            } else {
                password.append(generateSpecial());
                numSpecialLeft--;
            }
        }

        return password.toString();
    }

    private String generateLetter() {
        return letters[random.nextInt(letters.length)];
    }

    private String generateNumber() {
        return numbers[random.nextInt(numbers.length)];
    }

    private String generateSpecial() {
        return specials[random.nextInt(specials.length)];
    }

    // 0 for letter, 1 for number, 2 for special
    private int chooseCharacterType(int numLettersLeft, int numNumbersLeft,
                                    int numSpecialLeft) {
        int choice = random.nextInt(numLettersLeft + numNumbersLeft + numSpecialLeft);

        if (choice < numLettersLeft) return 0;
        else if (choice < numLettersLeft + numNumbersLeft) return 1;
        else return 2;
    }

    public int getMinLength() {
        return minLength;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getNumNumbers() {
        return numNumbers;
    }

    public int getNumSpecial() {
        return numSpecial;
    }

    public void setMinLength(int minLength) {
        if (((this.numSpecial + this.numNumbers) * 2) > minLength) {
            throw new IllegalArgumentException("There must be at least as many " +
                    "letters as numbers and special characters");
        }
        if(minLength > this.maxLength) {
            throw new IllegalArgumentException("Minimum length cannot be larger " +
                    "than maximum length");
        }
        this.minLength = minLength;
    }

    public void setMaxLength(int maxLength) {
        if(this.minLength > maxLength) {
            throw new IllegalArgumentException("Maximum length cannot be smaller " +
                    "than minimum length");
        }
        this.maxLength = maxLength;
    }

    public void setNumNumbers(int numNumbers) {
        if (((this.numSpecial + numNumbers) * 2) > this.minLength) {
            throw new IllegalArgumentException("There must be at least as many " +
                    "letters as numbers and special characters");
        }
        this.numNumbers = numNumbers;
    }

    public void setNumSpecial(int numSpecial) {
        if (((numSpecial + this.numNumbers) * 2) > this.minLength) {
            throw new IllegalArgumentException("There must be at least as many " +
                    "letters as numbers and special characters");
        }
        this.numSpecial = numSpecial;
    }
}
