package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i=0; i<1001;i++) {
            int result = getCrossSum(i);

            //System.out.println(i +" "+ result);

            if (result>0&&result%7==0) {
                System.out.println(i +" "+ result +" "+ result/7);
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
