package com.pluralsight;

public class Main {

    public static void main(String[] args) {
        Dice dice  = new Dice();

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for(int i = 0; i < 100; i++) {
            int roll1 = dice.roll();
            int roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.printf("Roll %d: %d - %d Sum: %d%n",
                    i + 1,
                    roll1,
                    roll2,
                    sum);

            switch (sum) {
                case 2 -> twoCounter ++;
                case 4 -> fourCounter ++;
                case 6 -> sixCounter ++;
                case 7 -> sevenCounter ++;
            }

        }

    }
}
