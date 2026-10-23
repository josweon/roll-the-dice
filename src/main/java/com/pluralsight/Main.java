package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Dice dice  = new Dice();

        int rolledA2 = 0;
        int rolledA4 = 0;
        int rolledA6 = 0;
        int rolledA7 = 0;

        for(int i = 0; i < 100; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();

            System.out.printf("Roll %d: %d - %d Sum: %d%n",
                    i + 1,
                    roll1,
                    roll2,
                    roll1 + roll2);

        }

    }
}
