package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=0; i<1001;i++) {
            int result = getCrossSum(i);

            if (result%7==0) {
                System.out.println(i +" "+ result);
            }
        }

    }

    private static int getCrossSum(int i) {
        String numberAsString = Integer.toString(i);
        char[] numbers = numberAsString.toCharArray();

        int result = 0;

        for (char number : numbers) {
            result = result + Character.getNumericValue(number);
        }
        return result;
    }
}
