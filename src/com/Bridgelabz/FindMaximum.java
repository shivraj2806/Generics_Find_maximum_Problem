package com.Bridgelabz;

public class FindMaximum {
    public Integer getMax(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }

    public static void main(String[] args) {

        FindMaximum maximum = new FindMaximum();
        System.out.println("Maximum Value:");
        System.out.println(maximum.getMax(60, 50, 55));

    }
}




