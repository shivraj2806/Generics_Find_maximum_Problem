package com.Bridgelabz;

public class FindMaximum {
    //Refactor all the three to one Generic Method and find maximum

    public <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue) {
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;

        return max;
    }

    public static void main(String[] args) {

        FindMaximum maximum = new FindMaximum();
        System.out.println("Maximum Value Of Integer:");
        System.out.println(maximum.getMax(50, 20, 70));
        System.out.println("Maximum Value Of Flot:");
        System.out.println(maximum.getMax(15.3f, 45.5f, 13.2f));
        System.out.println("Maximum Value Of String:");
        System.out.println(maximum.getMax("Apple", "Peach", "Banana"));

    }
}

