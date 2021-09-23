package com.Bridgelabz;
public class FindMaximum<E extends Comparable<E>> {

    E firstValue;
    E secondValue;
    E thirdValue;
    E[] extraParamaters;

    public FindMaximum(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
        this.extraParamaters = extraParamaters;
    }

    public static <E extends Comparable<E>> E getMax(E firstValue, E secondValue, E thirdValue, E... extraParamaters) {
        E max = firstValue;
        if (secondValue.compareTo(max) > 0)
            max = secondValue;
        if (thirdValue.compareTo(max) > 0)
            max = thirdValue;
        if (extraParamaters.length != 0) {
            for (E extraParamater : extraParamaters) {
                if (extraParamater.compareTo(max) > 0) {
                    max = extraParamater;
                }
            }
        }
        return max;
    }

    public <E extends Comparable<E>> E getMax() {
        E max = (E) getMax(firstValue, secondValue, thirdValue, extraParamaters);
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Maximum Value Of Integer:");
        System.out.println(new FindMaximum(40, 10, 90, 100,200).getMax());
        System.out.println("Maximum Value Of Flot:");
        System.out.println(new FindMaximum(1.2f, 4.2f, 5.6f, 8.5f).getMax());
        System.out.println("Maximum Value Of String:");
        System.out.println(new FindMaximum("apple", "banana", "peach", "grapes").getMax());

    }
}
